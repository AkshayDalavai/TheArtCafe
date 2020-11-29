package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Address;

import java.util.List;

public interface AccountService {

    boolean resetPassword();
    List<Address> addShippingAddress();
    boolean addProduct();
    boolean addProductReview();
}
