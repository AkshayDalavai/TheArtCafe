//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document(collection = "products")
@TypeAlias("product")
public class Product {
    @Id
    private String productID;
    private String name;
    private String description;
    private double price;
    @DBRef
    private Member member;
    private Set<EmbeddedCategory> fallIntoCategories = new HashSet<>();
    private List<String> image_URLs = new ArrayList<>();
    private int availableItemCount;

    public Product() {
    }

    public Product(String name, String description, double price, Member member, Set<EmbeddedCategory> fallIntoCategories, int availableItemCount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.member = member;
        this.fallIntoCategories = fallIntoCategories;
        this.availableItemCount = availableItemCount;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Set<EmbeddedCategory> getFallIntoCategories() {
        return fallIntoCategories;
    }

    public void setFallIntoCategories(Set<EmbeddedCategory> fallIntoCategories) {
        this.fallIntoCategories = fallIntoCategories;
    }

    public List<String> getImage_URLs() {
        return image_URLs;
    }

    public void setImage_URLs(List<String> image_URLs) {
        this.image_URLs = image_URLs;
    }

    public int getAvailableItemCount() {
        return availableItemCount;
    }

    public void setAvailableItemCount(int availableItemCount) {
        this.availableItemCount = availableItemCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", member=" + member +
                ", fallIntoCategories=" + fallIntoCategories +
                ", image_URLs=" + image_URLs +
                ", availableItemCount=" + availableItemCount +
                '}';
    }
}
