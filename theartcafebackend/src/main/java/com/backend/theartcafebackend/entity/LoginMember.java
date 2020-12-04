//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class LoginMember {
    private String username;
    private String password;

    public LoginMember() {
    }

    public LoginMember(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginMember{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
