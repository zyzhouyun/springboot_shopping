package com.rocket.dream.shopping.service;

import com.rocket.dream.shopping.pojo.custom.BillCustom;

public interface IBillCustomService {

    public BillCustom findBillCustomByBillCode(BillCustom billCustom)throws Exception;

}
