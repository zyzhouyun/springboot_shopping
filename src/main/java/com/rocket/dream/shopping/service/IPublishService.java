package com.rocket.dream.shopping.service;

import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.BillType;

import java.util.List;

/**
 * 发布商品
 * 负责人：周云
 */
public interface IPublishService {

    public int publishGoods(Bill bill);

    public List<BillType> findAllBillType();

    public long findCountByBillName(String billName);


    /**
     * 我发布的物品
     */
    public List<Bill> findBillByUserCode(Integer userCode);

    public int delBill(Integer billCode);
    public long billCount(Integer userCode);

}