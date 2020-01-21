package com.rocket.dream.shopping.handler;

import com.rocket.dream.shopping.dao.custom.BillCustomMapper;
import com.rocket.dream.shopping.pojo.Bill;
import com.rocket.dream.shopping.pojo.BillType;
import com.rocket.dream.shopping.pojo.User;
import com.rocket.dream.shopping.service.IPublishService;
import com.rocket.dream.shopping.utils.FileUploadBean;
import com.rocket.dream.shopping.utils.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * 发布物品控制层
 * 负责人：周云
 */
@Controller
@RequestMapping(value = "/publish")
public class PublishGoodsHandler {

    @Resource
    private FileUploadBean fileUploadBean; //上传类
    @Resource
    private IPublishService publishService;

    @Resource private BillCustomMapper billCustomMapper;

    @ResponseBody
    @RequestMapping(value = "/publishGoods")
    public Object publishGoods(@RequestParam(value = "upfile",required = false) List<MultipartFile> multipartFiles,
                               Bill bill , HttpServletRequest request ) throws Exception {

        List<String> paths=null;
        VO vo=new VO();
            paths = fileUploadBean.upload(multipartFiles);
            StringBuffer sb=new StringBuffer();
                for(int i=0;i<paths.size();i++){
                    if(paths.size()==1){
                        sb.append(paths.get(i));
                    }else{
                        sb.append(paths.get(i)).append(";");
                    }
                }
            String imgPath=sb.toString();
            System.out.println("图片路径"+imgPath);
            bill.setBillImage(imgPath);
            bill.setBillState(0); //订单状态，0：未出售
            bill.setPutawayDate(new Date()); //上架时间
            bill.setIssueDate(new Date()); //发布时间
            Integer userCode=null;
            Object login=request.getSession().getAttribute("loginUser");
            if(null!=login){
                userCode=((User)login).getUserCode();
            }
            bill.setUserCode(userCode); //用户id
            int count=publishService.publishGoods(bill);
            if(count!=0){
                vo.setNum(1);
                vo.setMessage("上传成功");
                vo.setDatas(paths);
            }
        return vo;
    }


    @ResponseBody
    @RequestMapping(value = "/findAllBillTypes")
    public List<BillType> findAllBillTypes(){
        return publishService.findAllBillType();
    }

    @ResponseBody
    @RequestMapping(value = "/checkBillName")
    public long checkBillName(String billName){
        return publishService.findCountByBillName(billName);
    }


    /**
     * 查看发布商品
     */
    @RequestMapping(value = "/goods")
    public String goods(HttpSession session, Model model){
    /*    Integer userCode=1;
        Object login=request.getSession().getAttribute("loginUser");
        if(login!=null){
            userCode = ((User) login).getUserCode();
        }
        ((User)request.getSession().getAttribute("loginUser")).getUserCode()
        */
        Integer userCode=((User)session.getAttribute("loginUser")).getUserCode();
        List<Bill> publishBillList = billCustomMapper.findBillsbyUserCode(userCode);
        List<Bill> billList=new ArrayList<>();
        for(int i=publishBillList.size()-1;i>=0;i--){
            billList.add(publishBillList.get(i));
        }
       /* if(!CollectionUtils.isEmpty(publishBillList)){
            publishBillList.clear();
        }*/
        model.addAttribute("publishBillList",billList);
        return "/user/goods";
    }


    @ResponseBody
    @RequestMapping(value = "/deleteBill")
    public VO deleteBill(Integer billCode,HttpServletRequest request){
        VO vo=new VO();
        vo.setNum(publishService.delBill(billCode));
        //session中获取
        Integer userCode=1;
        Object login=request.getSession().getAttribute("loginUser");
        if(login!=null){
            userCode=((User)login).getUserCode();
        }
        vo.setDatas(publishService.billCount(userCode));
        return vo;
    }


}
