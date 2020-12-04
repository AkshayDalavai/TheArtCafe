package com.backend.theartcafebackend.service.impl;

import com.backend.theartcafebackend.entity.Item;
import com.backend.theartcafebackend.repository.ItemRepository;
import com.backend.theartcafebackend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item updateItem(Item item) {
        return null;
    }
}
