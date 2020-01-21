package com.rocket.dream.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.dao.CommentMapper;
import com.rocket.dream.shopping.dao.UserMapper;
import com.rocket.dream.shopping.dao.custom.CommentCustomMapper;
import com.rocket.dream.shopping.pojo.Comment;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.custom.CommentCustom;
import com.rocket.dream.shopping.service.ICommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * zhouyun
 */
@Service
public class CommentServiceImpl implements ICommentService {
    @Resource private CommentMapper commentMapper;
    @Resource private UserMapper userMapper;
    @Resource private CommentCustomMapper commentCustomMapper;


    @Override
    public PageInfo<CommentCustom> findPageComtCustom(CommentCustom commentCustom,Integer pageNum) {
        if(null==pageNum){
            pageNum=1;
        }
        PageHelper.startPage(pageNum,5);
        List<CommentCustom> commentCustomList=commentCustomMapper.selectComtCustomPage(commentCustom);
        PageInfo<CommentCustom> pageInfo=new PageInfo<>(commentCustomList);
        return pageInfo;
    }

    @Override
    public int addComment(Comment comment) {
        return commentMapper.insertSelective(comment);
    }

    @Override
    public User findUserByUserCode(Integer userCode) {
        return userMapper.selectByPrimaryKey(userCode);
    }
}
