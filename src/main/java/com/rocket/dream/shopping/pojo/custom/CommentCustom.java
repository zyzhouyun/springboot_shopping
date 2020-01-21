package com.rocket.dream.shopping.pojo.custom;

import com.rocket.dream.shopping.pojo.Comment;
import com.rocket.dream.shopping.pojo.User;

/**
 * 评论自定义
 */
public class CommentCustom extends Comment {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
