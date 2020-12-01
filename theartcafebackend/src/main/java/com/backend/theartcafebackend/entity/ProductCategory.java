//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "categories")
@TypeAlias("category")
public class ProductCategory {
    @Id
    private String id;
    private String name;
    private String description;
    @DBRef(lazy = true)
    private List<Product> productsOfCategory = new ArrayList<>();
}
