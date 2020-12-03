package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Member;


import java.util.List;

public interface MemberService {
//
//    Mono<Member> createUser(Member member);
//    Flux<Member> findAllUsers();
//    boolean placeOrder();

    Member createUser(Member member);
    List<Member> findAllUsers();
}
