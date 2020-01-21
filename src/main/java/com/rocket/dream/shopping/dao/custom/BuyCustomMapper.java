package com.rocket.dream.shopping.dao.custom;

import com.rocket.dream.shopping.pojo.custom.BuyCustom;

import java.util.List;

/**
 * 查询发布求购信息
 */
public interface BuyCustomMapper {
    List<BuyCustom> findBuyInfo();
}
