package com.rocket.dream.shopping.service;

import com.rocket.dream.shopping.pojo.Address;

import java.util.List;

public interface IAddressService {

    public List<Address> selectAddress(Address address);

    public List<Address> selectAddressByUserCodeAndStatus(Address address);

}
