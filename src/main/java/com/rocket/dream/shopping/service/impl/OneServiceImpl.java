package com.rocket.dream.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.dao.AddressMapper;
import com.rocket.dream.shopping.dao.BuyMapper;
import com.rocket.dream.shopping.dao.OrderMapper;
import com.rocket.dream.shopping.dao.UserMapper;
import com.rocket.dream.shopping.dao.custom.BuyCustomMapper;
import com.rocket.dream.shopping.pojo.*;
import com.rocket.dream.shopping.pojo.custom.BuyCustom;
import com.rocket.dream.shopping.service.OneService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;

/**
 * 个人中心
 */
@Service
public class OneServiceImpl implements OneService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private BuyCustomMapper buyCustomMapper;
    @Resource
    private BuyMapper buyMapper;
    @Resource
    private AddressMapper addressMapper;
    @Resource
    private OrderMapper orderMapper;

    /**
     * 查询登录人员
     *
     * @param userCode
     * @return
     */
    @Override
    public User showOneUser(Integer userCode) {
        User user = userMapper.selectByPrimaryKey(userCode);
        return user;
    }

    /**
     * 修改个人基本信息
     *
     * @param user
     * @return
     */
    @Override
    public int updateOneUserInfo(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i;
    }

    /**
     * 查询求购信息
     *
     * @return
     */
    @Override
    public PageInfo<BuyCustom> findBuyInfo(int num, int size) {
        PageHelper.startPage(num, size);
        List<BuyCustom> buyInfo = buyCustomMapper.findBuyInfo();
        PageInfo<BuyCustom> pageInfo = new PageInfo<>(buyInfo);
        return pageInfo;
    }

    /**
     * * 添加求购信息
     * * @param buy
     *
     * @return
     */
    @Override
    public int insertBuyInfo(Buy buy) {
        int i = buyMapper.insertSelective(buy);
        return i;
    }

    /**
     * 根据id查找用户
     *
     * @param userCode
     * @return
     */
    @Override
    public User findUserById(int userCode) {
        User user = userMapper.selectByPrimaryKey(userCode);
        return user;
    }

    /**
     * 显示我的地址
     *
     * @return
     */
    @Override
    public List<Address> showAddress(Address address) {
        List<Address> address1 = addressMapper.findAddress(address);
        return address1;
    }

    /**
     * 添加新的收货地址
     *
     * @param address
     * @return
     */
    @Override
    public int addressInsert(Address address) {
        int i = addressMapper.insertAddress(address);
        return i;
    }

    /**
     * 判断是否存在默认地址
     *
     * @param address
     * @return
     */
    @Override
    public int checkAddress(Address address) {
        int i = addressMapper.checkD(address);
        return i;
    }

    /**
     * 查找修改信息
     *
     * @param address
     * @return
     */
    @Override
    public Address findUpdateInfo(Address address) {
        List<Address> address1 = addressMapper.findAddress(address);
        Address address2 = address1.get(0);
        return address2;
    }

    /**
     * 修改收货地址
     *
     * @param address
     * @return
     */
    @Override
    public int updateAddressInfo(Address address) {
        int i = addressMapper.updateAddress(address);
        return i;
    }

    /**
     * 删除收货地址
     *
     * @param address
     * @return
     */
    @Override
    public int deleteAddressInfo(Address address) {
        int i = addressMapper.deleteAddress(address);
        return i;
    }

    @Override
    public List<Order> findOrderInfo(Order order) {

        List<Order> orderInfoList = orderMapper.findOrderInfoList(order);

        return orderInfoList;
    }


}
