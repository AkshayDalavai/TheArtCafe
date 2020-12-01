//*** Begin *** Added by Akshay Dalavai

package com.backend.theartcafebackend.entity;

import com.backend.theartcafebackend.data.AccountStatus;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class Account {

    private String userName;
    private String password;
    private AccountStatus status;
    private String firstName;
    private String lastName;
    @DBRef
    private List<Address> shippingAddress;
    private String email;
    private String phone;

    public Account() {
    }

    public Account(String userName, String password, AccountStatus status, String firstName, String lastName, List<Address> shippingAddress, String email, String phone) {
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shippingAddress = shippingAddress;
        this.email = email;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Address> getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(List<Address> shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shippingAddress=" + shippingAddress +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
