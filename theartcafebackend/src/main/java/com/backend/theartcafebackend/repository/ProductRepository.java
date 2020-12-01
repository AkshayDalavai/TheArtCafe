package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {

    Product findByName(String name);

    @Override
    Mono<Product> findById(String id);
}
