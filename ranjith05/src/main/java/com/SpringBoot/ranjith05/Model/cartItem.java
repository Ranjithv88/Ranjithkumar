package com.SpringBoot.ranjith05.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class cartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CartItermId;
    private long ProductId;
    private long cartId;
    private long CreatedOn;

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(long createdOn) {
        CreatedOn = createdOn;
    }
}
