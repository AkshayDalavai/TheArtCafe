package com.backend.theartcafebackend.controller;

import com.backend.theartcafebackend.entity.ProductCategory;
import com.backend.theartcafebackend.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductCategoryRestController {

//    private final ProductCategoryService productCategoryService;
//    @Autowired
//    public ProductCategoryRestController(ProductCategoryService productCategoryService) {
//        this.productCategoryService = productCategoryService;
//    }
//
//    @PostMapping("/addCategory")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Mono<ResponseEntity<ProductCategory>> addCategory(@RequestBody ProductCategory productCategory){
//        return productCategoryService.addProductCategory(productCategory).map(ResponseEntity::ok).
//                defaultIfEmpty(ResponseEntity.badRequest().build());
//    }
//
//    @GetMapping("/getCategories")
//    public Flux<ProductCategory> getCategories(){
//        return productCategoryService.getAllCategories();
//
//    }

}
