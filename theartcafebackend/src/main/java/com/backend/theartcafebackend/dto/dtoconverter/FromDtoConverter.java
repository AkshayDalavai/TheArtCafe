package com.backend.theartcafebackend.dto.dtoconverter;

import com.backend.theartcafebackend.dto.ItemDto;
import com.backend.theartcafebackend.entity.Item;

public class FromDtoConverter {

    public static Item fromItemDtoConverter(final ItemDto itemDto)
    {
        return new Item(itemDto.getQuantity(),
                itemDto.getPrice()
        );
    }
}
