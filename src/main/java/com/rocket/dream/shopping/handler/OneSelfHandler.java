package com.rocket.dream.shopping.handler;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.Address;
import com.rocket.dream.shopping.pojo.Buy;
import com.rocket.dream.shopping.pojo.Order;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.pojo.custom.BuyCustom;
import com.rocket.dream.shopping.service.OneService;
import com.rocket.dream.shopping.utils.FileUploadBean;
import com.rocket.dream.shopping.utils.PortBean;
import com.rocket.dream.shopping.utils.VO;
import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 个人中心
 */
@Controller
@RequestMapping("/oneSelf")
public class OneSelfHandler extends ConvertHandler {
    @Resource
    private OneService oneService;
    @Resource
    private FileUploadBean fileUploadBean; //上传类

    //显示个人中心首页
    @RequestMapping("/showHome")
    public String showHome(HttpSession session, Model model, Integer number) {
      /*  Object object=session.getAttribute("loginUser");*/
        if (number == null) {
            number = 1;
        }

        PageInfo<BuyCustom> buyInfo = oneService.findBuyInfo(number, 4);
        int pages = buyInfo.getPages();
        model.addAttribute("buyInfo", buyInfo);
        model.addAttribute("pages", pages);
        model.addAttribute("number", number);
        return "/user/home";
    }

    //显示个人设置
    @RequestMapping("/showOneSelf")
    public String showOneSelf(User oneUser, Model model, HttpSession session) {
        User user=(User)session.getAttribute("loginUser");
        model.addAttribute("user", user);
        return "/user/basic";
    }

    //显示订单信息
    @RequestMapping("/showOneOrder")
    public String showOneOrder(HttpSession session, Model model) {
        User loginUser = (User) session.getAttribute("loginUser");
        Order order = new Order();
        order.setUserCode(loginUser.getUserCode());
        List<Order> orderInfo = oneService.findOrderInfo(order);
        model.addAttribute("orderInfo", orderInfo);
        return "/user/orders";
    }

    //显示支付中心
    @RequestMapping("/showOnePay")
    public String showOnePay() {
        return "/user/purse";
    }

    //修改用户信息
    @RequestMapping("/updateUserInfo")
    public String updateUserInfo(User user, @RequestParam(value = "user_Img", required = false) List<MultipartFile> multipartFile, Model model, HttpSession session) throws Exception {
        String originalFilename = multipartFile.get(0).getOriginalFilename();

        if (!originalFilename.equals("")) {
            List<String> upload = fileUploadBean.upload(multipartFile);
            String img = upload.get(0);
            user.setUserHeadPortrait(img);
        }
        user.setUserCode(1);
        int i = oneService.updateOneUserInfo(user);
        if (i == 1) {
            User users = (User) session.getAttribute("loginUser");
            BeanUtils.copyProperties(user, users);
            model.addAttribute("user", user);
            return "redirect:/oneSelf/showHome";
        } else {
            return "/user/basic";
        }
    }

    //添加求购信息
    @RequestMapping("/insert")
    @ResponseBody
    public VO buyInsert(Buy buy, HttpSession session) {
        buy.setBuyDate(new Date());
        User users = (User) session.getAttribute("loginUser");
        BuyCustom buyCustom = new BuyCustom();
        buyCustom.setBuyDate(new Date());
        buyCustom.setUser(users);
        buyCustom.setUserCode(users.getUserCode());
        buyCustom.setBuyInfo(buy.getBuyInfo());
        buy.setUserCode(users.getUserCode());
        int i = oneService.insertBuyInfo(buy);
        VO vo = new VO();
        vo.setNum(i);
        if (i == 1) {
            vo.setDatas(buyCustom);
        } else {
            vo.setMessage("发布失败");
        }
        return vo;
    }

    //求购信息查询用户信息
    @RequestMapping("/buyFindUser")
    @ResponseBody
    public VO buyFIndById(Integer userCode) {
        VO vo = new VO();
        User user = oneService.findUserById(userCode);
        if (user == null) {
            vo.setMessage("用户查询不到");
            vo.setNum(0);
        } else {
            vo.setNum(1);
            vo.setDatas(user);
        }
        return vo;
    }

    //显示收货地址页面
    @RequestMapping("/showAddress")
    public String showAddressInfo(Model model, HttpSession session) {
        User users = (User) session.getAttribute("loginUser");
        Address address = new Address();
        address.setUserCode(users.getUserCode());
        List<Address> addresses = oneService.showAddress(address);
        model.addAttribute("addresses", addresses);
        return "/user/address";
    }

    //添加新的收货地址
    @RequestMapping("/insertAddress")
    @ResponseBody
    public VO insertAdd(Address address, HttpSession session) {
        User users = (User) session.getAttribute("loginUser");
        address.setUserCode(users.getUserCode());
        int addressStatu = oneService.checkAddress(address);
        VO vo = new VO();
        if (addressStatu == 1) {
            address.setAddressStatus(1);
        } else {
            address.setAddressStatus(0);
        }
        int i = oneService.addressInsert(address);
        if (i == 1) {
            vo.setNum(1);
        } else {
            vo.setNum(0);
        }
        return vo;
    }

    //求购信息查找
    @RequestMapping("/findUpdate")
    @ResponseBody
    public VO updateAddressFind(Address address, HttpSession session) {
        User users = (User) session.getAttribute("loginUser");
        address.setUserCode(users.getUserCode());
        VO vo = new VO();
        Address updateInfo = oneService.findUpdateInfo(address);
        if (address != null) {
            vo.setDatas(updateInfo);
            vo.setNum(1);
        } else {
            vo.setNum(0);
        }
        return vo;
    }

    //修改收货地址
    @RequestMapping("/updateAddress")
    @ResponseBody
    public VO updateAddressInfo(Address address, HttpSession session) {
        VO vo = new VO();
        int i = oneService.updateAddressInfo(address);
        vo.setNum(i);
        return vo;
    }

    //删除收货地址
    @RequestMapping("/deleteAddress")
    @ResponseBody
    public VO addressDelete(Address address) {
        int i = -1;
        i = oneService.deleteAddressInfo(address);
        VO vo = new VO();
        vo.setNum(i);
        return vo;
    }
}
