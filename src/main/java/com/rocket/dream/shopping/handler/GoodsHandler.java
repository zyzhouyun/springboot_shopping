package com.rocket.dream.shopping.handler;

import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.service.IBillService;
import com.rocket.dream.shopping.utils.LogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/goods")
@Controller
public class GoodsHandler {
    @Resource
    private IBillService billService;


    @RequestMapping(value = "/publishGoods")
    public String publishGoods(){

        return "/goods/pubGoods";
    }





    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping(value="/homeGoods")
    public String homeGoods(Model model){
        //查询最新的六件商品
        List<Bill> bills = billService.selectNewBills(null);
        //查询最新六件闲置数码
        List<Bill> billsDigital = billService.selectDigital(null);
        //查询最新六件闲置电器
        List<Bill> billsElectrical = billService.selectUnusedElectricalAppliances(null);
        //查询最新六件闲置书籍
        List<Bill> billsBooks = billService.selectIdleBooks(null);
        //查询最新六件闲置运动
        List<Bill> billsMotion = billService.selectIdleMotion(null);

        //将商品信息保存至model中
        //保存最新发布的六条商品信息至model中。
        model.addAttribute("billlist",bills);
        //保存最新发布六件闲置数码商品信息至model中。
        model.addAttribute("billsDigital",billsDigital);
        //保存最新发布六件闲置电器商品信息至model中。
        model.addAttribute("billsElectrical",billsElectrical);
        //保存最新发布六件闲置书籍商品信息至model中。
        model.addAttribute("billsBooks",billsBooks);
        //保存最新发布六件闲置运动商品信息至model中。
        model.addAttribute("billsMotion",billsMotion);
        return "/goods/homeGoods";
    }






}
