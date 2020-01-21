package com.rocket.dream.shopping.service.impl;

import com.rocket.dream.shopping.dao.AddressMapper;
import com.rocket.dream.shopping.pojo.Address;
import com.rocket.dream.shopping.service.IAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * zhouyun
 */
@Service
public class AddressServiceImpl implements IAddressService{
    @Resource private AddressMapper addressMapper;

    @Override
    public List<Address> selectAddress(Address address) {
        return addressMapper.selectAddress(address);
    }

    @Override
    public List<Address> selectAddressByUserCodeAndStatus(Address address) {
        return addressMapper.selectAddressByUserCodeAndStatus(address);
    }


}
