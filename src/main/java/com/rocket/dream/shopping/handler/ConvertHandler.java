package com.rocket.dream.shopping.handler;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertHandler {
    /**
     * 配置InitBinder注解，进行参数绑定前的日期转换，
     *
     * @param webDataBinder
     */
    @InitBinder
    public void stringToDate(WebDataBinder webDataBinder) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //创建属性编辑器
        CustomDateEditor customDateEditor = new CustomDateEditor(format, true);
        webDataBinder.registerCustomEditor(Date.class, customDateEditor);
    }
}
