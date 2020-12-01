//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

import com.backend.theartcafebackend.data.OrderStatus;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;
}
