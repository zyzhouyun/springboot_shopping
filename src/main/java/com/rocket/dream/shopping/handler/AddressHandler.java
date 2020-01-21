package com.rocket.dream.shopping.handler;

import com.rocket.dream.shopping.dao.AddressMapper;
import com.rocket.dream.shopping.pojo.Address;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.service.IAddressService;
import com.rocket.dream.shopping.utils.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/address")
@Controller
public class AddressHandler {
    @Resource private IAddressService addressService;
    @Resource private AddressMapper addressMapper;

    @ResponseBody
    @RequestMapping(value = "/findAddress")
    public VO findAddress(Address address, HttpServletRequest request){
        Integer userCode=1;
        Object object=request.getSession().getAttribute("loginUser");
        if(object!=null){
            userCode=((User)object).getUserCode();
        }
        address.setUserCode(userCode);
        List<Address> address1=addressService.selectAddress(address);
        return new VO(address1);
    }


    @ResponseBody
    @RequestMapping(value = "/addressChange")
    public Integer addressChange(Address address,HttpServletRequest request){
        //System.out.println("需要设为默认的地址"+address.getAddressId());
        Integer userCode=((User)request.getSession().getAttribute("loginUser")).getUserCode();
        Address address1=new Address(); //下拉框域被改变，把0默认地址改为其他地址
        address1.setUserCode(userCode);
        address1.setAddressStatus(0);
        Address addre=addressService.selectAddressByUserCodeAndStatus(address1).get(0);
        System.out.println(addre);
        addre.setAddressStatus(1);
        int cou=addressMapper.updateAddress(addre);
        Integer count=0;
        if(cou==1){
            Address addressChange = addressMapper.selectAddressById(address); //选中后的地址，改为默认地址
            addressChange.setAddressStatus(0);
            count=addressMapper.updateAddress(addressChange);
        }
        return count;
    }







}
