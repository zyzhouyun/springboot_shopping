package com.rocket.dream.shopping.service.impl;

import com.rocket.dream.shopping.dao.BillMapper;
import com.rocket.dream.shopping.dao.BillTypeMapper;
import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.BillExample;
import com.rocket.dream.shopping.pojo.BillType;
import com.rocket.dream.shopping.service.IPublishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 发布商品业务层
 * 负责人：周云
 */
@Service
public class PublishServiceImpl implements IPublishService{
    @Resource private BillMapper billMapper; //商品
    @Resource private BillTypeMapper billTypeMapper; //商品类型


    /**
     * 发布/添加商品
     * @param bill
     * @return
     */
    @Override
    public int publishGoods(Bill bill) {
        return billMapper.insertSelective(bill);
    }

    @Override
    public List<BillType> findAllBillType() {
        return billTypeMapper.selectByExample(null);
    }

    @Override
    public long findCountByBillName(String billName) {
        BillExample example=new BillExample();
        example.createCriteria().andBillNameEqualTo(billName);
        return billMapper.countByExample(example);
    }



    /**
     * 我发布的物品
     */
    @Override
    public List<Bill> findBillByUserCode(Integer userCode) {
        BillExample example=new BillExample();
        example.createCriteria().andUserCodeEqualTo(userCode);
        List<Bill>  billList = billMapper.selectByExample(example);
        return  billList;
    }

    @Override
    public int delBill(Integer billCode) {
        return billMapper.deleteByPrimaryKey(billCode);
    }

    @Override
    public long billCount(Integer userCode) {
        BillExample example=new BillExample();
        example.createCriteria().andUserCodeEqualTo(userCode);
        return billMapper.countByExample(example);
    }


}
