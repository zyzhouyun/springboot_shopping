package com.rocket.dream.shopping.service.impl;

import com.rocket.dream.shopping.dao.*;
import com.rocket.dream.shopping.dao.custom.BillCustomMapper;
import com.rocket.dream.shopping.pojo.*;
import com.rocket.dream.shopping.pojo.custom.BillCustom;
import com.rocket.dream.shopping.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * zhouyun
 */
@Service
@Transactional
public class AccountServiceImpl implements IAccountService {

    @Resource private AccountMapper accountMapper;
    @Resource private OrderMapper orderMapper;
    @Resource private OrderBillMapper orderBillMapper;
    @Resource private BillMapper billMapper;
    @Resource private BillCustomMapper billCustomMapper;
    @Resource private CartMapper cartMapper;




    @Override
    public Account findAccountByUserCode(Integer userCode) throws Exception {
        AccountExample accountExample=new AccountExample();
        accountExample.createCriteria().andUserCodeEqualTo(userCode);
        List<Account> accountList=accountMapper.selectByExample(accountExample);
        return accountList.get(0);
    }

    @Override
    public int updateAccount(Account account,Integer userCode) throws Exception {
        AccountExample accountExample=new AccountExample();
        accountExample.createCriteria().andUserCodeEqualTo(userCode);
        int count=accountMapper.updateByExampleSelective(account,accountExample);
        return count;
    }

    /**
     * 修改
     * @param userCode
     * @param account
     * @param order
     * @param billIds
     * @return
     * @throws Exception
     */
    @Override
    public Integer pay(Integer userCode,Account account, Order order, Integer[] billIds) throws Exception {
        int a=this.updateAccount(account,userCode);
        int m=0;
        for(int i=0;i<billIds.length;i++){
            Bill buyBill = billMapper.selectByPrimaryKey(billIds[i]);
            Integer merchantUserCode=buyBill.getUserCode(); //商家id
            Float billMoney=buyBill.getBillMoney(); //商品价格
            m+=billCustomMapper.addMoneyMerchant(merchantUserCode,billMoney);
        }
        int o=0;
        int count=0;
        int ob=0;

        if(a==1){
            order.setUserCode(userCode);
            order.setOrderStatus(0);
            o=orderMapper.insertSelective(order);
        }

        if(o==1){
            for(Integer billCode :billIds){
                Bill bill = billMapper.selectByPrimaryKey(billCode);
                bill.setBillState(1);
                count+=billMapper.updateByPrimaryKeySelective(bill);
            }
        }

        if(count==billIds.length){
            OrderExample orderExample=new OrderExample();
            orderExample.createCriteria().andOrderCodeEqualTo(order.getOrderCode());
            List<Order> orderList=orderMapper.selectByExample(orderExample);
            Order order1=null;
            if(!orderList.isEmpty()&&orderList.size()==1){
                order1=orderList.get(0);
            }
            for(Integer billCode:billIds){
                OrderBillKey orderBillKey=new OrderBillKey();
                orderBillKey.setBillCode(billCode);
                orderBillKey.setOrderId(order1.getOrderId());
                ob+=orderBillMapper.insertSelective(orderBillKey);
            }
        }
        if(ob==billIds.length){
            this.delCartItems(userCode,billIds);
            return 1;
        }else{
            return 0;
        }
    }

    private Integer delCartItems(Integer userCode,Integer[] billIds)throws Exception{
        CartExample cartExample=new CartExample();
        List<Integer> billIdsList=new ArrayList<>();
        Collections.addAll(billIdsList,billIds);
        cartExample.createCriteria().andBuyerIdEqualTo(userCode).andBillCodeIn(billIdsList);
        return cartMapper.deleteByExample(cartExample);
    }


}
