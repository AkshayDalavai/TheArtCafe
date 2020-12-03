package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Account;
import com.backend.theartcafebackend.entity.Address;

import java.util.List;

public interface AddressService {
    Account addShippingAddress(Address address);
    List<Address> getShppingAddress(Integer acctId);
    List<Address> getAllAddress();
}
