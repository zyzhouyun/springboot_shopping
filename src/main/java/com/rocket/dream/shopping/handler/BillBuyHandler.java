package com.rocket.dream.shopping.handler;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.Comment;
import com.rocket.dream.shopping.pojo.custom.CommentCustom;
import com.rocket.dream.shopping.service.ICommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * 购买物品，评论
 */
@RequestMapping("/buy")
@Controller
public class BillBuyHandler extends ConvertHandler{
    @Resource private ICommentService commentService;

    @RequestMapping(value = "/todetail")
    public String todetail(){
        return "/goods/detailGoods";
    }

    @ResponseBody
    @RequestMapping(value = "/findPageComments")
    public PageInfo<CommentCustom> findPageComments(CommentCustom commentCustom,Integer pageNum){
        PageInfo<CommentCustom> pageInfo = commentService.findPageComtCustom(commentCustom,pageNum);
        return pageInfo;
    }

/*    @ResponseBody
    @RequestMapping(value = "/findUserById")
    private Object findUserById(Integer userCode){
        return commentService.findUserByUserCode(userCode);
    }*/


    @ResponseBody
    @RequestMapping(value = "/createComment")
    public int createComment(Comment comment){
        Integer count=null;
        if(comment!=null){
            comment.setComDate(new Timestamp(System.currentTimeMillis()));
            count=commentService.addComment(comment);
        }
        return count;
    }





}
