package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.ProductCategory;
import com.backend.theartcafebackend.repository.ProductCategoryRepository;
import com.backend.theartcafebackend.repository.ProductRepository;
import com.backend.theartcafebackend.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductCategoryServiceImpl {
//    private final ProductCategoryRepository productCategoryRepository;
//    private final ProductRepository productRepository;
//    @Autowired
//    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository, ProductRepository productRepository) {
//        this.productCategoryRepository = productCategoryRepository;
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public Mono<ProductCategory> addProductCategory(ProductCategory productCategory) {
//        if(productCategory == null || productCategory.getName() == null || productCategory.getName().trim().isEmpty()){
//            return null;
//        }
//        return productCategoryRepository.save(productCategory);
//    }
//
//    @Override
//    public Flux<ProductCategory> getAllCategories() {
//        return productCategoryRepository.findAll();
//        return productCategoryRepository.findAll()
//                .flatMap( productCategory ->
//                        Flux.just(productCategory)
//                                .zipWith(productRepository.findAllById(productCategoryRepository.get)
//                                                .collectionList(),
//                                        (u, p) -> {
//                                            u.setProfiles(p);
//                                            return u;
//                                        })
//                );
//    }
}
