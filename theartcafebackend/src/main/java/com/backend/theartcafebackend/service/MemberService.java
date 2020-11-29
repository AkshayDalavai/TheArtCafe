package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Member;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MemberService {

    Mono<Member> createUser(Member member);
    Flux<Member> findAllUsers();
    boolean placeOrder();
}
