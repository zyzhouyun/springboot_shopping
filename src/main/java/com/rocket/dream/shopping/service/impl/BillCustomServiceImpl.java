package com.rocket.dream.shopping.service.impl;

import com.rocket.dream.shopping.dao.custom.BillCustomMapper;
import com.rocket.dream.shopping.pojo.custom.BillCustom;
import com.rocket.dream.shopping.service.IBillCustomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * zhouyun
 */
@Service
public class BillCustomServiceImpl implements IBillCustomService{

    @Resource private BillCustomMapper billCustomMapper;


    @Override
    public BillCustom findBillCustomByBillCode(BillCustom billCustom) throws Exception {
        BillCustom billCustom1 = billCustomMapper.selectBillCustomByBillCode(billCustom);

        return billCustom1;
    }


}
