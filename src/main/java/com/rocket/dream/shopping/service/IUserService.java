package com.rocket.dream.shopping.service;

import com.rocket.dream.shopping.pojo.User;

import java.util.List;

/**
 * 用户相关Service接口
 */
public interface IUserService {

    /**
     * 用于进行登录
     */
    public abstract List<User> login(User user);
}
