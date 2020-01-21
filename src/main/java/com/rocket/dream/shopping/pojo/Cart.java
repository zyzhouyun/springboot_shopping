package com.rocket.dream.shopping.pojo;

public class Cart {
    private Integer cartId;

    private Integer billCode;

    private Integer buyerId;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getBillCode() {
        return billCode;
    }

    public void setBillCode(Integer billCode) {
        this.billCode = billCode;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }
}