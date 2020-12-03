package com.backend.theartcafebackend.controller;

import com.backend.theartcafebackend.entity.Account;
import com.backend.theartcafebackend.entity.Address;
import com.backend.theartcafebackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressRestController {

    private final AddressService addressService;
    @Autowired
    public AddressRestController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(value = "/createAddress")
    public ResponseEntity<Account> addAddress(@RequestBody Address address){
        address.setId(0);
        Account addedacct = addressService.addShippingAddress(address);
        return new ResponseEntity<>(addedacct,HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllAddress", produces = "application/json")
    public ResponseEntity<List<Address>> getAllAddress(){
        List<Address> addressList = addressService.getAllAddress();
        return new ResponseEntity<>(addressList,HttpStatus.OK);
    }
}
