package com.rocket.dream.shopping.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexHandler {
    @RequestMapping("/index")
    public String index(){
        return "forward:/goods/homeGoods";
    }
}
