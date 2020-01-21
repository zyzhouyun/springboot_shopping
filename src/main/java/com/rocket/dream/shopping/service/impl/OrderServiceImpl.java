package com.rocket.dream.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.dao.OrderBillMapper;
import com.rocket.dream.shopping.dao.OrderMapper;
import com.rocket.dream.shopping.pojo.Order;
import com.rocket.dream.shopping.pojo.OrderBillExample;
import com.rocket.dream.shopping.pojo.OrderExample;
import com.rocket.dream.shopping.service.OrderService;
import org.springframework.stereotype.Service;
import com.mysql.jdbc.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderBillMapper orderBillMapper;

    public List<Order> selectCx(Order order) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        if (order != null) {
            if (!StringUtils.isNullOrEmpty(order.getUserName())) {
                criteria.andUserNameLike("%" + order.getUserName() + "%");
            }
            if (order.getOrderStatus() != null && order.getOrderStatus() != 0) {
                criteria.andOrderCodeEqualTo(order.getOrderStatus());
            }
            if (order.getOrderId() != null && order.getOrderId() != 0) {
                criteria.andOrderCodeEqualTo(order.getOrderId());
            }
        }
        List<Order> orders = orderMapper.selectByExample(example);
        return orders;
    }

    @Override
    public PageInfo<Order> SelectInfo(Integer pageIndex, Integer pageSize) {
        //分页判断
        if (null == pageIndex || 0 == pageIndex) {
            pageIndex = 1;
        }
        if (null == pageSize || 0 == pageSize) {
            pageSize = 5;
        }
        PageHelper.startPage(pageIndex, pageSize);
        List<Order> userList = orderMapper.selectOrder();
        return new PageInfo<>(userList);
    }

    @Override
    public Integer delete(Integer orderId) {
        OrderBillExample orderBillExample = new OrderBillExample();
        orderBillExample.createCriteria().andOrderIdEqualTo(orderId);
        orderBillMapper.deleteByExample(orderBillExample);
        return orderMapper.deleteByPrimaryKey(orderId);
    }

    //批量删除
    @Override
    public Integer batchDelete(Integer[] orderIds) {
        OrderBillExample orderBillExample = new OrderBillExample();
        //循环删
        int count = 0;
        for (int i = 0; i < orderIds.length; i++) {
            orderBillExample.createCriteria().andOrderIdEqualTo(orderIds[i]);
            orderBillMapper.deleteByExample(orderBillExample); //删除关系表
            count = orderMapper.deleteByPrimaryKey(orderIds[i]);
            count++;
        }
        return count;

    }
}