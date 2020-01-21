package com.rocket.dream.shopping.service.impl; /***********************************************************************
 * Module:  BillServiceImpl.java
 * Author:  zhaoy
 * Purpose: Defines the Class BillServiceImpl
 ***********************************************************************/

import com.rocket.dream.shopping.dao.BillMapper;
import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.BillExample;
import com.rocket.dream.shopping.service.IBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @pdOid 5c063943-2ef3-42bd-832d-54ad9142d382
 */
@Service
public class BillServiceImpl implements IBillService {
    @Resource
    private BillMapper billMapper;

    /**
     * 查询最新发布的6个商品
     *
     * @param bill
     * @return
     */
    public List<Bill> selectNewBills(Bill bill) {
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();

        criteria.andBillStateEqualTo(0);

        billExample.setOrderByClause("putawayDate DESC , billCode DESC"); //升序排列，desc为降序排列。
        billExample.setOffset(0);
        billExample.setLimit(6);
        List<Bill> bills = billMapper.selectByExample(billExample);
        return bills;
    }

    /**
     * 查询最新发布的六个闲置数码商品
     *
     * @param bill
     * @return
     */
    public List<Bill> selectDigital(Bill bill) {
        //Mybatis逆向工程会生成实例及实例对应的example（用于添加条件，相当于where后的部分）
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();

        //添加条件，商品类型为数码，并且为可购买的最新六条
        //查询条件，商品类型为数码。
        criteria.andTypeIdEqualTo(1);
        //查询条件，商品状态为：可购买。
        criteria.andBillStateEqualTo(0);
        //查询条件，商品为最新上架的六件。
        billExample.setOrderByClause("putawayDate DESC , billCode DESC"); //升序排列，desc为降序排列。

        billExample.setOffset(0);
        billExample.setLimit(6);
        List<Bill> bills = billMapper.selectByExample(billExample);


        return bills;
    }

    /**
     * 查询最新发布的六个闲置电器商品
     *
     * @param bill
     * @return
     */
    public List<Bill> selectUnusedElectricalAppliances(Bill bill) {
        //Mybatis逆向工程会生成实例及实例对应的example（用于添加条件，相当于where后的部分）
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();

        //添加条件，商品类型为数码，并且为可购买的最新六条
        //查询条件，商品类型为数码。
        criteria.andTypeIdEqualTo(2);
        //查询条件，商品状态为：可购买。
        criteria.andBillStateEqualTo(0);
        //查询条件，商品为最新上架的六件。
        billExample.setOrderByClause("putawayDate DESC , billCode DESC"); //升序排列，desc为降序排列。

        billExample.setOffset(0);
        billExample.setLimit(6);
        List<Bill> bills = billMapper.selectByExample(billExample);


        return bills;
    }

    /**
     * 查询最新发布的六个闲置书籍商品
     *
     * @param bill
     * @return
     */
    public List<Bill> selectIdleBooks(Bill bill) {
        //Mybatis逆向工程会生成实例及实例对应的example（用于添加条件，相当于where后的部分）
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();

        //添加条件，商品类型为数码，并且为可购买的最新六条
        //查询条件，商品类型为数码。
        criteria.andTypeIdEqualTo(3);
        //查询条件，商品状态为：可购买。
        criteria.andBillStateEqualTo(0);
        //查询条件，商品为最新上架的六件。
        billExample.setOrderByClause("putawayDate DESC , billCode DESC"); //升序排列，desc为降序排列。

        billExample.setOffset(0);
        billExample.setLimit(6);
        List<Bill> bills = billMapper.selectByExample(billExample);


        return bills;
    }

    /**
     * 查询最新发布的六个闲置运动商品
     *
     * @param bill
     * @return
     */
    public List<Bill> selectIdleMotion(Bill bill) {
        //Mybatis逆向工程会生成实例及实例对应的example（用于添加条件，相当于where后的部分）
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();

        //添加条件，商品类型为数码，并且为可购买的最新六条
        //查询条件，商品类型为数码。
        criteria.andTypeIdEqualTo(4);
        //查询条件，商品状态为：可购买。
        criteria.andBillStateEqualTo(0);
        //查询条件，商品为最新上架的六件。
        billExample.setOrderByClause("putawayDate DESC , billCode DESC"); //升序排列，desc为降序排列。

        billExample.setOffset(0);
        billExample.setLimit(6);
        List<Bill> bills = billMapper.selectByExample(billExample);


        return bills;
    }

    /**
     * 查询学校图片
     *
     * @return
     */
    public List<String> selectSchoolImages() {
        // TODO: implement
        return null;
    }

}