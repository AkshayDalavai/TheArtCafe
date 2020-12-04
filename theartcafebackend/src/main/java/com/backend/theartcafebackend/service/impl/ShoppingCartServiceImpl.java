package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Item;
import com.backend.theartcafebackend.entity.ShoppingCart;
import com.backend.theartcafebackend.repository.ShoppingCartRepository;
import com.backend.theartcafebackend.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;
    @Autowired
    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public List<Item> addItem(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public void removeItem(ShoppingCart shoppingCart) {

    }

    @Override
    public List<Item> getItems() {
        return null;
    }
}
