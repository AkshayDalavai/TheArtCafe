//*** Begin *** Added by Akshay Dalavai
package com.backend.theartcafebackend.entity;

public class Customer {

    private ShoppingCart shoppingCart;
    private Order order;

    public Customer() {
    }

    public Customer(ShoppingCart shoppingCart, Order order) {
        this.shoppingCart = shoppingCart;
        this.order = order;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", shoppingCart=" + shoppingCart +
                ", order=" + order +
                '}';
    }
}
