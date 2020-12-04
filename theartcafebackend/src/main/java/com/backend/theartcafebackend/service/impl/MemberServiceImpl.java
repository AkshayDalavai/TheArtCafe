package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.dto.ItemDto;
import com.backend.theartcafebackend.dto.dtoconverter.FromDtoConverter;
import com.backend.theartcafebackend.entity.*;
import com.backend.theartcafebackend.repository.*;
import com.backend.theartcafebackend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final ShoppingCartRepository shoppingCartRepository;
    private final ItemRepository itemRepository;
    private final ProductRepository productRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository, ShoppingCartRepository shoppingCartRepository, ItemRepository itemRepository, ProductRepository productRepository) {
        this.memberRepository = memberRepository;
        this.shoppingCartRepository = shoppingCartRepository;
        this.itemRepository = itemRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Member createUser(Member member) {
        String userName = member.getUsername();
        member.getAccount().setEmail(userName);
        if(member.getShoppingCart() == null){
            member.setShoppingCart(new ShoppingCart());
        }
        return memberRepository.save(member);
    }

    @Override
    public List<Member> findAllUsers() {
        return memberRepository.findAll();
    }

    @Override
    public Member addToShoppingCart(ItemDto itemDto) {
        Optional<Member> tempMember = Optional.ofNullable(memberRepository.findByUsername(itemDto.getUsername()));
        Member theMember = null;
        if(tempMember.isPresent()){
            theMember = tempMember.get();
        }
        else{
            throw new RuntimeException("Could'nt find the user id - ");
        }
        Optional<Product> tempProduct = productRepository.findById(itemDto.getProductId());
        Product theProduct = null;
        if(tempProduct.isPresent()){
            theProduct = tempProduct.get();
        }
        else{
            throw new RuntimeException("Could'nt find product id - ");
        }
        Item tempItem = FromDtoConverter.fromItemDtoConverter(itemDto);
        tempItem.setProduct(theProduct);
        tempItem.setShoppingCart(theMember.getShoppingCart());
        itemRepository.save(tempItem);
        return theMember;
    }


    @Override
    public Member updateMember(Member member) {
        Optional<Member> result = memberRepository.findById(member.getId());
        Member theMember = null;
        if(result.isPresent()){
            theMember = result.get();
        }
        else
        {
            throw new RuntimeException("Could'nt update as the member id - " + member.getId()+" not present");
        }
        memberRepository.save(member);
        return null;
    }

    @Override
    public boolean checkMemberCredentials(LoginMember loginMember) {
        Optional<Member> tempMember = Optional.ofNullable(memberRepository.findByUsername(loginMember.getUsername()));
        Member theMember = null;
        if(tempMember.isPresent()){
            theMember = tempMember.get();
            return true;
        }
        return false;
    }


}
