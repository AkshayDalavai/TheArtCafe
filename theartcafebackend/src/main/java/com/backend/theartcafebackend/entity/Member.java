//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Member extends Customer{
    @Id
    private String id;
    private Account account;

    public Member() {

    }
    public Member(Account account) {
        this.account = account;
    }

    public Member(ShoppingCart shoppingCart, Order order,Account account) {
        super(shoppingCart, order);
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Member{" +
                "account=" + account +
                '}';
    }
}
