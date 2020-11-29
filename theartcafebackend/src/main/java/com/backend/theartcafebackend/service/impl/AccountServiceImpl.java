package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Address;
import com.backend.theartcafebackend.repository.MemberRepository;
import com.backend.theartcafebackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final MemberRepository memberRepository;

    @Autowired
    public AccountServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }

    @Override
    public List<Address> addShippingAddress() {
        return null;
    }

    @Override
    public boolean addProduct() {
        return false;
    }

    @Override
    public boolean addProductReview() {
        return false;
    }
}
