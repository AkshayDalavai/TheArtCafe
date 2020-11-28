package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Address;

public interface AccountService {

    Address getShippingAddress();
    boolean addProduct();
    boolean addProductReview();
}
