package com.xiaohei.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一的异常处理
 * Created by 非洲小黑 on 2018/2/26.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public String error(Model model,Exception e){
        model.addAttribute("error",e.getMessage());
        return "err";
    }
}
