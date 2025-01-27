package com.nimish.ecom_proj.controller;

import com.nimish.ecom_proj.model.Product;

public class TestLombok {
    public static void main(String[] args) {
        // Create a new Product instance
        Product product = new Product();

        // Set values for the fields
        product.setName("Laptop");
        product.setPrice(1300.0);
        product.setDescription("High-performance laptop");
        product.setBrand("Dell");
        product.setCategory("Electronics");
        product.setAvailable(true); // Boolean value
        product.setQuantity(10);

        // Print the product's name to verify Lombok's getter is working
        System.out.println("Product Name: " + product.getName());
    }
}
