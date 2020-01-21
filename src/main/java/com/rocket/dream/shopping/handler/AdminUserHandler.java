package com.rocket.dream.shopping.handler;

import com.github.pagehelper.PageInfo;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.service.AdminUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminUserHandler {
    @Resource
    private AdminUserService adminUserService;

    @RequestMapping("/findUser")
    public String test(Model model, User user, Integer pageIndex){
        model.addAttribute("userFind",user);
        PageInfo<User> userPageInfo = adminUserService.selectUser(user,pageIndex,5);
        model.addAttribute("userPageInfo",userPageInfo);
        return "admin/user/user_list";
    }

    @RequestMapping("/changeUserState")
    public String state(int userCode,Model model, User user, Integer pageIndex){
        model.addAttribute("userFind",user);
        User user1 = adminUserService.select(userCode);//查询单个用户获取对象
        if (user1.getUserState()==1){
            user1.setUserState(0);
        }else{
            user1.setUserState(1);
        }
        int i = adminUserService.ProhibitAndEnable(user1);
        PageInfo<User> userPageInfo = adminUserService.selectUser(user,pageIndex,5);//查询用户
        model.addAttribute("userPageInfo",userPageInfo);
        return "admin/user/user_list";
    }

    @RequestMapping("/selectOne")
    public String selectOne(int userCode,Model model){
        User user = adminUserService.select(userCode);
        model.addAttribute("user",user);
        return "";
    }
}
