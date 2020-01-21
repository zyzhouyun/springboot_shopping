package com.rocket.dream.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.dao.UserMapper;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.UserExample;
import com.rocket.dream.shopping.service.AdminUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "adminUserServiceImpl")
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public PageInfo<User> selectUser(User user, Integer pageIndex, Integer pageSize) {
        //分页判断
        if (null == pageIndex || 0 == pageIndex) {
            pageIndex = 1;
        }
        if (null == pageSize || 0 == pageSize) {
            pageSize = 5;
        }
        PageHelper.startPage(pageIndex, pageSize);
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(user.getUserPhone())) {
            criteria.andUserPhoneLike("%" + user.getUserPhone() + "%");
        }
        if (!StringUtils.isEmpty(user.getUserName())) {
            criteria.andUserNameLike("%" + user.getUserName() + "%");//添加条件
        }
        List<User> userList = userMapper.selectByExample(example);
        return new PageInfo<>(userList);
    }

    @Override
    public User select(int userCode) {
        User user = userMapper.selectByPrimaryKey(userCode);
        return user;
    }

    @Override
    public int ProhibitAndEnable(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
