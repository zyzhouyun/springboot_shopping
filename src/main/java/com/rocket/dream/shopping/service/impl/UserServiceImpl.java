package com.rocket.dream.shopping.service.impl;

import com.rocket.dream.shopping.dao.UserMapper;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.UserExample;
import com.rocket.dream.shopping.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;
    /**
     * 用于进行登录
     *
     * @param user
     */
    @Override
    public List<User> login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        criteria.andUserPhoneEqualTo(user.getUserPhone());
        criteria.andUserPwdEqualTo(user.getUserPwd());

        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
