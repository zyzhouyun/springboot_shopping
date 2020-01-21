package com.rocket.dream.shopping.dao.custom;

import com.rocket.dream.shopping.pojo.Account;
import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.custom.BillCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillCustomMapper {

    /**
     * 我发布的物品
     * @param userCode
     * @return
     */
    public List<Bill> findBillsbyUserCode(Integer userCode);


    //start

    /**
     * 根据商品id查询商品自定义
     * -查看商品详细
     */
    public BillCustom selectBillCustomByBillCode(BillCustom billCustom);


    //商家加钱
    public Integer addMoneyMerchant(@Param("userCode") Integer userCode, @Param("billMoney") Float billMoney);



}
