//*** Begin *** Added by Akshay Dalavai

package com.backend.theartcafebackend.entity;

import com.backend.theartcafebackend.data.AccountStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="account_status")
    private String status;

    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;

    @OneToOne(mappedBy="account",cascade = CascadeType.ALL)
    @JsonBackReference
    private Member member;

    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Address> shippingAddress;

    public Account(String firstName, String lastName, String status, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.phone = phone;
        this.email = email;
    }
}
