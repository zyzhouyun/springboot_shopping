package com.rocket.dream.shopping.handler;

import com.rocket.dream.shopping.dao.CartMapper;
import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.Cart;
import com.rocket.dream.shopping.pojo.CartExample;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.custom.BillCustom;
import com.rocket.dream.shopping.pojo.custom.CartCustom;
import com.rocket.dream.shopping.service.IBillCustomService;
import com.rocket.dream.shopping.service.ICartService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequestMapping("/billc")
@Controller
public class BillCustomHandler {

    @Resource private IBillCustomService billCustomService;
    @Resource private ICartService cartService;
    @Resource private CartMapper cartMapper;


    /**
     * 查看商品明细
     */
    @RequestMapping(value = "/descByBillId/{billCode}")
    public String descByBillId(@PathVariable("billCode") Integer billCode, BillCustom billCustom,
                               Model model ) throws Exception {
        //LogUtil.info("商品id==>"+billCode);
        billCustom.setBillCode(billCode);
        BillCustom billCustom1 = billCustomService.findBillCustomByBillCode(billCustom);
        //LogUtil.info("商品信息==》"+billCustom1);

        if(billCustom1!=null){
            if(!StringUtils.isEmpty(billCustom1.getBillImage())){
                String[] strarr=billCustom1.getBillImage().split(";");
                Collections.addAll(billCustom1.getImgList(),strarr);
                billCustom1.setImgList(billCustom1.getImgList());
                //LogUtil.info("图片集合-->"+billCustom1.getImgList());
            }
        }
        model.addAttribute("billCustom",billCustom1);
        return "goods/detailGoods";
    }

    /**
     * 跳转到购物车页面
     */
    @RequestMapping(value = "/toCart")
    public String toCart(){
        return "user/cart";
    }

    //添加购物项
    @ResponseBody
    @RequestMapping(value = "/addBillCodetoCart")
    public Integer addBillCodetoCart(Cart cart, HttpServletRequest request) throws Exception {
        int userCode=1;
        Object login = request.getSession().getAttribute("loginUser");
        if(login!=null){
            userCode=((User)login).getUserCode();
        }
        cart.setBuyerId(userCode); //买家id未当前用户id
        CartExample example=new CartExample();
        example.createCriteria().andBillCodeEqualTo(cart.getBillCode()).andBuyerIdEqualTo(cart.getBuyerId()); //确保唯一性
        List<Cart> cartList=cartMapper.selectByExample(example);
        if(cartList!=null&&cartList.size()!=0){
            //购物车有此商品
            return -1;
        }else{
            //添加购物项
            return cartService.addCart(cart);
        }
    }

    //查看购物车
    @RequestMapping(value = "showCartList")
    public String showCartList(@SessionAttribute(value = "loginUser",required = false) User user, Model model) throws Exception {
        Integer userCode=1; //session/userid
        if(user!=null){
            userCode=user.getUserCode();
        }
        CartCustom cartCustom1=new CartCustom();
        cartCustom1.setBuyerId(userCode);
        List<CartCustom> cartCustomList=cartService.findCartCustom(cartCustom1);

        List<BillCustom> billCustoms=new ArrayList<>();
        for(CartCustom cartCustom:cartCustomList){
            for(BillCustom billCustom :cartCustom.getBillCustoms()){
                billCustoms.add(billCustom);
            }
        }
        model.addAttribute("billCustoms",billCustoms);
        return "user/cart";
    }


 /*   @RequestMapping(value = "/pay.html")
    public String payHtml(){
        return "user/pay";
    }*/

    @RequestMapping(value = "/toPay/{billIds}")
    public String toPay(@PathVariable("billIds") Integer[] billIds,Model model) throws Exception {
        System.out.println(Arrays.toString(billIds));
        List<BillCustom> billCustomList=new ArrayList<>();
        BillCustom billCustom=new BillCustom();
        for(Integer billCode:billIds){
            billCustom.setBillCode(billCode);
            BillCustom billCustom1 = billCustomService.findBillCustomByBillCode(billCustom);
            billCustomList.add(billCustom1);
        }
        model.addAttribute("billCustomList",billCustomList);
        model.addAttribute("billIds",billIds);
        return "user/pay";
    }


    /**
     * 删除购物项
     */
    @ResponseBody
    @RequestMapping("/delCartItem/{billCode}")
    public Integer delCartItem(@PathVariable("billCode") Integer billCode,HttpServletRequest request){
        CartExample cartExample=new CartExample();
        cartExample.createCriteria().andBillCodeEqualTo(billCode).andBuyerIdEqualTo(((User)request.getSession().getAttribute("loginUser")).getUserCode());
        return cartMapper.deleteByExample(cartExample);
    }



}




