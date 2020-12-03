package com.backend.theartcafebackend.controller;

import com.backend.theartcafebackend.entity.Member;
import com.backend.theartcafebackend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberRestController {

    private final MemberService memberService;

    @Autowired
    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping(value = "/createuser")
    public ResponseEntity<Member> createUser(@RequestBody Member member){
        Member createdMember = memberService.createUser(member);
        return new ResponseEntity<>(createdMember,HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllUsers", produces = "application/json")
    public ResponseEntity<List<Member>> getAllUsers(){
        List<Member> members = memberService.findAllUsers();
        return new ResponseEntity<>(members,HttpStatus.OK);
    }
}
