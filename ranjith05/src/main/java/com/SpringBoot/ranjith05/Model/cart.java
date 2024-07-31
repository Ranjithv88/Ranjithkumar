package com.SpringBoot.ranjith05.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CartId;
    private long UserId;
    private long CartItemsId;

    public long getCartId() {
        return CartId;
    }

    public void setCartId(long cartId) {
        CartId = cartId;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getCartItemsId() {
        return CartItemsId;
    }

    public void setCartItemsId(long cartItemsId) {
        CartItemsId = cartItemsId;
    }
}

