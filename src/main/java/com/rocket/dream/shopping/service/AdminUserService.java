package com.rocket.dream.shopping.service;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.User;

public interface AdminUserService {
    public PageInfo<User> selectUser(User user, Integer pageIndex, Integer pageSize);

    public User select(int userCode);//查询单个用户用于禁用

    public int ProhibitAndEnable(User user);
}
