package com.rocket.dream.shopping.service;

import com.rocket.dream.shopping.pojo.Account;
import com.rocket.dream.shopping.pojo.Order;

public interface IAccountService {

    public Account findAccountByUserCode(Integer userCode)throws Exception;

    public int updateAccount(Account account,Integer userCode)throws Exception;


    //下订单
    public Integer pay(Integer userCode,Account account, Order order,Integer[] billIds)throws Exception;

}
