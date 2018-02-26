package com.xiaohei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 非洲小黑 on 2018/1/31.
 */
@Controller
public class Hello2WorldController {
    //日志对象
    private static final Logger logger = LoggerFactory.getLogger(Hello2WorldController.class);
    @RequestMapping("hello2")
    @ResponseBody
    public String hello(){
        if(logger.isInfoEnabled()){
            logger.info("操作开始");
            if(logger.isDebugEnabled()){
                logger.debug("第一步");
                if(logger.isTraceEnabled()){
                    logger.trace("第二步");
                }
            }
            logger.info("操作结束");
        }
        return "hello springboot";
    }
}
