package com.backend.theartcafebackend.controller;

import com.backend.theartcafebackend.entity.Account;
import com.backend.theartcafebackend.entity.Address;
import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.entity.Product;
import com.backend.theartcafebackend.service.ProductService;
import com.backend.theartcafebackend.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        product.setId(0);
        Product prodAdded = productService.addProduct(product);
        return new ResponseEntity<>(prodAdded,HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllProducts", produces = "application/json")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> prodList = productService.getAllProduct();
        return new ResponseEntity<>(prodList,HttpStatus.OK);
    }

}
