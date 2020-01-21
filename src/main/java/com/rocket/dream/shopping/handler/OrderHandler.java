package com.rocket.dream.shopping.handler;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.Order;
import com.rocket.dream.shopping.service.OrderService;
import com.rocket.dream.shopping.utils.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/order")
@Controller
public class OrderHandler {
    @Resource
    private OrderService orderService;

    @RequestMapping("/orderList")
    public String order_list(Model model, Integer pageIndex) {
        PageInfo<Order> orderPageInfo = orderService.SelectInfo(pageIndex, 5);
        model.addAttribute("selectInfo", orderPageInfo);
        return "admin/orders/orders_list";
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public Integer delete(Integer orderId) {
        return orderService.delete(orderId);
    }

    @ResponseBody
    @RequestMapping(value = "/batchDelete")
    public VO batchDelete(@RequestParam(value = "orderIds[]") Integer[] orderIds) {
        int count = orderService.batchDelete(orderIds);
        VO vo = new VO();
        vo.setNum(count);
        return vo;
    }
}