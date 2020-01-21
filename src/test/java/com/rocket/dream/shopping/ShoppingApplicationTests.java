package com.rocket.dream.shopping;

import com.rocket.dream.shopping.dao.custom.BillCustomMapper;
import com.rocket.dream.shopping.dao.custom.CartCustomMapper;
import com.rocket.dream.shopping.dao.custom.CommentCustomMapper;
import com.rocket.dream.shopping.pojo.custom.BillCustom;
import com.rocket.dream.shopping.pojo.custom.CartCustom;
import com.rocket.dream.shopping.pojo.custom.CommentCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {

    @Resource private BillCustomMapper billCustomMapper;

    @Resource private CommentCustomMapper commentCustomMapper;


    @Test
    public void contextLoadsc() {
        CommentCustom commentCustom=new CommentCustom();
        commentCustom.setBillCode(48);
        List<CommentCustom> commentCustomList = commentCustomMapper.selectComtCustomPage(commentCustom);
        System.out.println(commentCustomList.size());
    }

    @Test
    public void contextLoads() {
        BillCustom billCustom =new BillCustom();
        billCustom.setBillCode(1);
    BillCustom billCustom1 =billCustomMapper.selectBillCustomByBillCode(billCustom);
        System.out.println(billCustom1);
}


    @Resource private CartCustomMapper cartCustomMapper;
    @Test
    public void contextLoads1() {
        CartCustom cartCustom=new CartCustom();
        List<CartCustom> cartCustomList=cartCustomMapper.selectCartCustom(cartCustom);

    }


}
