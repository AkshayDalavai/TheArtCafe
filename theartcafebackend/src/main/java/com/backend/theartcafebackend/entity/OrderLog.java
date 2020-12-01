package com.backend.theartcafebackend.entity;

import com.backend.theartcafebackend.data.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLog {
    private String orderNumber;
    private String creationDate;
    private OrderStatus status;
}
