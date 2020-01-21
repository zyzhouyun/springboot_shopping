package com.rocket.dream.shopping.ex;

import com.rocket.dream.shopping.utils.VO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {

    @ResponseBody
    @ExceptionHandler(FileException.class)
    public VO catchFileExcetion(Exception e){
        VO vo=new VO();
        vo.setMessage(e.getMessage());
        return vo;
    }
}
