package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<Product> addProduct(Product product);
    Mono<Product> updateProduct(Product product);
    Flux<Product> getAllProduct();
    Mono<Product> getProduct(String name);

}
