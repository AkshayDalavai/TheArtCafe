//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shoppingcart")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "shoppingCart",cascade = CascadeType.ALL)
    private Member member;

    @OneToMany(mappedBy = "shoppingCart",cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    private List<Item> items;

}
