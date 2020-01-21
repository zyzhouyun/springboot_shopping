package com.rocket.dream.shopping.pojo.custom;

import com.rocket.dream.shopping.pojo.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartCustom extends Cart {

    private List<BillCustom> billCustoms=new ArrayList<>();

    public List<BillCustom> getBillCustoms() {
        return billCustoms;
    }

    public void setBillCustoms(List<BillCustom> billCustoms) {
        this.billCustoms = billCustoms;
    }
}
