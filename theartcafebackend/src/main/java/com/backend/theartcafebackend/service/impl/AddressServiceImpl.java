package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Address;
import com.backend.theartcafebackend.repository.AddressRepository;
import com.backend.theartcafebackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void addShippingAddress(Address address) {
        addressRepository.save(address);
    }
}
