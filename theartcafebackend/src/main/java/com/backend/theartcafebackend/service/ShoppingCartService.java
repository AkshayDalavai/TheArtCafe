package com.backend.theartcafebackend.service;

import com.backend.theartcafebackend.entity.Item;
import com.backend.theartcafebackend.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    List<Item> addItem(ShoppingCart shoppingCart);
    void removeItem(ShoppingCart shoppingCart);
    List<Item> getItems();

}
