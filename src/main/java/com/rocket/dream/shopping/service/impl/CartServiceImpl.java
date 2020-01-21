package com.rocket.dream.shopping.service.impl;

import com.rocket.dream.shopping.dao.CartMapper;
import com.rocket.dream.shopping.dao.custom.CartCustomMapper;
import com.rocket.dream.shopping.pojo.Cart;
import com.rocket.dream.shopping.pojo.custom.CartCustom;
import com.rocket.dream.shopping.service.ICartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * zhouyun
 */
@Service
public class CartServiceImpl implements ICartService {

    @Resource private CartMapper cartMapper;
    @Resource private CartCustomMapper cartCustomMapper;

    @Override
    public Integer addCart(Cart cart) throws Exception {
        return cartMapper.insertSelective(cart);
    }

    @Override
    public List<CartCustom> findCartCustom(CartCustom cartCustom) throws Exception {
        return cartCustomMapper.selectCartCustom(cartCustom);
    }


}
