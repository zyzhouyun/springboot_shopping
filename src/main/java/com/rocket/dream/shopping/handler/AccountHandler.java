package com.rocket.dream.shopping.handler;

import com.rocket.dream.shopping.dao.BillMapper;
import com.rocket.dream.shopping.dao.OrderBillMapper;
import com.rocket.dream.shopping.dao.OrderMapper;
import com.rocket.dream.shopping.pojo.*;
import com.rocket.dream.shopping.service.IAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.transport.ObjectTable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RequestMapping("/account")
@Controller
public class AccountHandler {

    @Resource private IAccountService accountService;
    @Resource private OrderMapper orderMapper;
    @Resource private OrderBillMapper orderBillMapper;
    @Resource private BillMapper billMapper;


    @ResponseBody
    @RequestMapping(value = "/accmoney.action")
    public Account accmoneyAction(HttpServletRequest request) throws Exception {
        Integer userCode=1;
        Object object=request.getSession().getAttribute("loginUser");
        if(object!=null){
            userCode=((User)object).getUserCode();
        }
        Account account = accountService.findAccountByUserCode(userCode);
        return account;
    }

    @ResponseBody
    @RequestMapping(value = "/toPay")
    public Integer toPay(Account account, Order order, @RequestParam("billIds[]") Integer[] billIds,HttpServletRequest request) throws Exception {
        Integer userCode=1;
        Object object=request.getSession().getAttribute("loginUser");
        if(object!=null){
            userCode=((User)object).getUserCode();
        }
        int count=accountService.pay(userCode,account,order,billIds);
        return count;
    }

}
