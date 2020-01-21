package com.rocket.dream.shopping.pojo.custom;

import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.BillType;
import com.rocket.dream.shopping.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 周云
 * date 2019/9/20
 * 商品自定义类
 */
public class BillCustom extends Bill {

    private User user;
    private BillType billType;
    private List<String> imgList=new ArrayList<>();



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }
}
