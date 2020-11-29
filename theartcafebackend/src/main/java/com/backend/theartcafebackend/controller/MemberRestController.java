package com.backend.theartcafebackend.controller;

import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class MemberRestController {

    private final MemberService memberService;

    @Autowired
    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping(value = "/createuser")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Member> createUser(@RequestBody Member member){
        return memberService.createUser(member);
    }

    @GetMapping(value = "/getAllUsers", produces = "application/json")
    public Flux<Member> getAllUsers(){return memberService.findAllUsers();}
}
