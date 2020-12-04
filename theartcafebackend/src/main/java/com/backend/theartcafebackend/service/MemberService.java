package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.dto.ItemDto;
import com.backend.theartcafebackend.entity.Item;
import com.backend.theartcafebackend.entity.LoginMember;
import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.entity.ShoppingCart;


import java.util.List;

public interface MemberService {
//
//    Mono<Member> createUser(Member member);
//    Flux<Member> findAllUsers();
//    boolean placeOrder();

    Member createUser(Member member);
    List<Member> findAllUsers();
    Member addToShoppingCart(ItemDto item);
    Member updateMember(Member member);
    boolean checkMemberCredentials(LoginMember loginMember);
}
