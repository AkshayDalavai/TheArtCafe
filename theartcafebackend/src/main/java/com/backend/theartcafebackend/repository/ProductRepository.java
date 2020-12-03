package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,String>{

    List<Product> findByName(String name);

}
