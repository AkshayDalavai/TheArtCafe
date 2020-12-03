//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="quantity")
    private int quantity;

    @Column(name="item_price")
    private Double price;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "shoppingcart_id")
    private ShoppingCart shoppingCart;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
                        CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="product_id")
    private Product product;

    public Item(int quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }
}
