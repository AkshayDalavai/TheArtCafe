package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Product;
import com.backend.theartcafebackend.repository.ProductRepository;
import com.backend.theartcafebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Mono<Product> addProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public Mono<Product> updateProduct(Product product) {
        return null;
    }

    @Override
    public Flux<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> getProduct(String name) {
        return null;
    }
}
