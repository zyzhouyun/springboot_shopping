package com.rocket.dream.shopping.dao.custom;

import com.rocket.dream.shopping.pojo.custom.CommentCustom;

import java.util.List;

public interface CommentCustomMapper {

    public List<CommentCustom> selectComtCustomPage(CommentCustom commentCustom);

}
