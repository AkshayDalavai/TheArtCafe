package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Product;

import java.util.List;


public interface ProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProduct();
    Product getProduct(String name);
}
