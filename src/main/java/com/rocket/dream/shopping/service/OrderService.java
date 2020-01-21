package com.rocket.dream.shopping.service;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.Order;

/**
 * 订单管理--李越
 */
public interface OrderService {
    public PageInfo<Order> SelectInfo(Integer pageIndex, Integer pageSize);

    public Integer delete(Integer orderId);

    public Integer batchDelete(Integer[] orderIds);

}
