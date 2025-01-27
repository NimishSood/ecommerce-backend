package com.nimish.ecom_proj.controller;

import com.nimish.ecom_proj.model.Product;
import com.nimish.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController
{
    @Autowired
    private  ProductService service;

    @RequestMapping("/greet")
    public String greet()
    {
        return "Hello World!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }


    @GetMapping("/products/test")
    public Product getTestProduct() {
        List<Product> products = service.getAllProducts();
        if (!products.isEmpty()) {
            System.out.println("First Product: " + products.get(0));
            return products.get(0);
        }
        return null; // Return null if the list is empty
    }

}



