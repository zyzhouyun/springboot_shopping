package com.rocket.dream.shopping.utils;

/**
 * 后台处理前台的多种提示
 */
public class VO {
    private Integer num;
    private String message;
    private Object datas;

    public VO(){}

    public VO(Object datas) {
        this.datas = datas;
    }

    public VO(Integer num, String message, Object datas) {
        this.num = num;
        this.message = message;
        this.datas = datas;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }
}
