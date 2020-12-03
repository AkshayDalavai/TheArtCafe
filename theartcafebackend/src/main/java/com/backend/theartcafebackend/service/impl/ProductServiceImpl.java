package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.ImageURL;
import com.backend.theartcafebackend.entity.Product;
import com.backend.theartcafebackend.repository.ImageRepository;
import com.backend.theartcafebackend.repository.ProductRepository;
import com.backend.theartcafebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ImageRepository imageRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ImageRepository imageRepository) {
        this.productRepository = productRepository;
        this.imageRepository = imageRepository;
    }

    @Override
    public Product addProduct(Product product) {
        List<ImageURL> imageURL_List = product.getImage_URLs();
        for(ImageURL imageURL : imageURL_List)
        {
            imageURL.setProduct(product);
        }
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String name) {
        return null;
    }
}
