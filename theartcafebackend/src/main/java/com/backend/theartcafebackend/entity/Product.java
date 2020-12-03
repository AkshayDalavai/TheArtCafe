//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
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
    private Member member;

//    @ManyToMany
//    private List<ProductCategory> productCategory;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ImageURL> image_URLs;

    public Product() {
    }

    public Product(String name, String description, double price, int itemCount, List<ImageURL> image_URLs) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemCount = itemCount;
        this.image_URLs = image_URLs;
    }
}
