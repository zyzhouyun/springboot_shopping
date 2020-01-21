package com.rocket.dream.shopping.pojo.custom;


import com.rocket.dream.shopping.pojo.Buy;
import com.rocket.dream.shopping.pojo.User;

public class BuyCustom extends Buy {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
