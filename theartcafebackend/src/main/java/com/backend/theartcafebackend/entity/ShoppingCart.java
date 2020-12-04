//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "shoppingCart",cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JsonManagedReference
    private List<Item> items;

    public void addItems(Item item){
        if(items == null){
            items = new ArrayList<>();
        }
        items.add(item);
    }
}
