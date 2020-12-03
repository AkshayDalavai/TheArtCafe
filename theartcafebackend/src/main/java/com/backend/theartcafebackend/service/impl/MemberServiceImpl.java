package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Account;
import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.repository.AccountRepository;
import com.backend.theartcafebackend.repository.MemberRepository;
import com.backend.theartcafebackend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final AccountRepository accountRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository, AccountRepository accountRepository) {
        this.memberRepository = memberRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public Member createUser(Member member) {
        String userName = member.getUsername();
        member.getAccount().setEmail(userName);
        return memberRepository.save(member);
    }

    @Override
    public List<Member> findAllUsers() {
        return memberRepository.findAll();
    }

}
