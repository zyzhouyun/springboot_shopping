package com.rocket.dream.shopping.service;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.Comment;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.custom.CommentCustom;

public interface ICommentService {

    //查询所有评论
    public PageInfo<CommentCustom> findPageComtCustom(CommentCustom commentCustom,Integer pageNum);

    public int addComment(Comment comment);

    public User findUserByUserCode(Integer userCode);



}
