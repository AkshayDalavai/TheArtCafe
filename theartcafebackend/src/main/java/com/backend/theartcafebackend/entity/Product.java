//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "product")
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private double price;

    @Column(name="itemcount")
    private int itemCount;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="member_id")
    //Seller
    private Member member;

//    @OneToOne(mappedBy="product",cascade = CascadeType.ALL)
//    private Item item;
//    @ManyToMany
//    private List<ProductCategory> productCategory;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<ImageURL> image_URLs;

    public Product() {
    }

    public Product(String name, String description, double price, int itemCount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemCount = itemCount;
    }


    public void addImageURL(ImageURL imageURL){
        if(image_URLs == null){
            image_URLs = new ArrayList<>();
        }
        image_URLs.add(imageURL);
    }
}
