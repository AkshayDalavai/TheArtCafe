package com.backend.theartcafebackend.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemDto {

    private String username;
    private int quantity;
    private Double price;
    private int productId;
}
