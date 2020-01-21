package com.rocket.dream.shopping.handler;

import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户相关：controller
 */
@Controller
@RequestMapping(value = "/user")
public class UserHandler {
    @Resource
    private IUserService iUserService;

    /**
     * 用于登录
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session, User user, Model model) {
        //根据手机号和密码获取用户
        List<User> login = iUserService.login(user);
        //判断是否获取到用户，获取到则将用户存入model中，方便做发布功能
        if (login != null && login.size() != 0) {
            User user1 = login.get(0);
            //将用户存入session中
            session.setAttribute("loginUser", user1);
        }

        return "/index";//返回首页
    }

    /**
     * 用于登录验证
     */
    @RequestMapping(value = "/dengluyanzheng")
    @ResponseBody
    public String dengluyanzheng(User user, Model model){
        //根据用户手机号和密码获取用户信息
        List<User> login = iUserService.login(user);
        //判断如果获取到用户，则可以进行登录操作
        if(login!=null&&login.size()!=0){
            //判断该用户是否被冻结,1为冻结，0为正常
            if(login.get(0).getUserState()!=1){
                //未冻结可以进行登录操作
                return "0";//此处，0表示可以进行登录操作
            }else {
                return "1";//此处，1表示账号被冻结，不能进行登录操作
            }
        }else {
            return "-1";//此处，-1表示账号或密码错误，未找到此用户
        }
    }

    /**
     * 用于退出登录
     */
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("loginUser");//将登录的账号从session作用域中清空
        return "/index";//返回首页
    }
}
