package com.rocket.dream.shopping.dao.custom;

import com.rocket.dream.shopping.pojo.custom.CartCustom;

import java.util.List;

public interface CartCustomMapper {

    public List<CartCustom> selectCartCustom(CartCustom cartCustom);

}
