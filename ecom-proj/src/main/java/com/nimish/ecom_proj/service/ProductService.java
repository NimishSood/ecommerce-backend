package com.nimish.ecom_proj.service;

import com.nimish.ecom_proj.model.Product;
import com.nimish.ecom_proj.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepo repo;


    @Transactional
    public List<Product> getAllProducts() {
        List<Product> products = repo.findAll();
        System.out.println("Products retrieved: " + products);
        return products;
    }

}
