package com.backend.theartcafebackend.controller;

import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.entity.Product;
import com.backend.theartcafebackend.service.ProductService;
import com.backend.theartcafebackend.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;
    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Product> addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping(value ="/getAllProducts")
    public Flux<Product> getAllProducts(){
        return productService.getAllProduct();
    }

}
