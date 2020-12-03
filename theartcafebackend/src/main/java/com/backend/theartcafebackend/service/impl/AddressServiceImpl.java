package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Account;
import com.backend.theartcafebackend.entity.Address;
import com.backend.theartcafebackend.repository.AccountRepository;
import com.backend.theartcafebackend.repository.AddressRepository;
import com.backend.theartcafebackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AccountRepository accountRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, AccountRepository accountRepository) {
        this.addressRepository = addressRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public Account addShippingAddress(Address address) {
        Account tempAcc = address.getAccount();
        tempAcc.getShippingAddress().add(address);
        return accountRepository.save(tempAcc);
    }

    @Override
    public List<Address> getShppingAddress(Integer acctId) {
        return null;
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }
}
