//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="member")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id")
    @JsonManagedReference
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="shoppingcart_id")
    private ShoppingCart shoppingCart;
    //private Order order;

    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<Product> sellingProducts;

    public Member(String username, String password, Account account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
