package com.nimish.ecom_proj.service;

import com.nimish.ecom_proj.model.Product;
import com.nimish.ecom_proj.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepo repo;

    public List<Product> getAllProducts() {
        List<Product> products = repo.findAll();
        return products;
    }

    public Product getProductById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException
    {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return repo.save(product);
    }
}
