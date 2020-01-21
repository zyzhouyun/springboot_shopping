package com.rocket.dream.shopping.service;

import com.rocket.dream.shopping.pojo.Cart;
import com.rocket.dream.shopping.pojo.custom.CartCustom;

import java.util.List;

public interface ICartService {

    public Integer addCart(Cart cart)throws Exception;

    public List<CartCustom> findCartCustom(CartCustom cartCustom)throws Exception;

}
