package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.repository.MemberRepository;
import com.backend.theartcafebackend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Mono<Member> createUser(Member member) {
        String userEmail = member.getAccount().getEmail();
        member.getAccount().setUserName(userEmail);
        return memberRepository.save(member);
    }

    @Override
    public Flux<Member> findAllUsers() {
        return memberRepository.findAll();
    }

    @Override
    public boolean placeOrder() {
        return false;
    }
}
