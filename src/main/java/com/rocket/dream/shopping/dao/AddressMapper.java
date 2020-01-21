package com.rocket.dream.shopping.dao;

import com.rocket.dream.shopping.pojo.Address;

import java.util.List;

public interface AddressMapper {
      List<Address> findAddress(Address address);

    int deleteAddress(Address address);

    int insertAddress(Address address);

    int updateAddress(Address address);

    int checkD(Address address);


    //by UserCode
    public List<Address> selectAddress(Address address);


    public List<Address> selectAddressByUserCodeAndStatus(Address address);

    public Address selectAddressById(Address address);

}
