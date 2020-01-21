package com.rocket.dream.shopping.service;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.Address;
import com.rocket.dream.shopping.pojo.Buy;
import com.rocket.dream.shopping.pojo.Order;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.custom.BuyCustom;

import java.util.List;

/**
 * 个人中心
 */
public interface OneService {
    //显示个人设置
    User showOneUser(Integer userCode);

    //修改个人基本信息
    int updateOneUserInfo(User user);

    //显示发布求购信息列表
    PageInfo<BuyCustom> findBuyInfo(int num, int size);

    //添加发布求购信息
    int insertBuyInfo(Buy buy);

    //查找用户根据用户编号
    User findUserById(int userCode);

    //显示我的地址
    List<Address> showAddress(Address address);

    //添加新的地址
    int addressInsert(Address address);

    //判断是否存在默认地址
    int checkAddress(Address address);

    //查找修改地址信息
    Address findUpdateInfo(Address address);

    //修改收货地址信息
    int updateAddressInfo(Address address);

    //删除收货地址
    int deleteAddressInfo(Address address);

    //个人中心买家信息显示
    List<Order> findOrderInfo(Order order);
}
