package com.xiaohei.controller;

import com.xiaohei.domain.MyDatasource;
import com.xiaohei.domain.ThreeDatasource;
import com.xiaohei.domain.TwoDatasouce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 非洲小黑 on 2018/1/31.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private ApplicationArguments args;
    @Autowired
    private MyDatasource myDatasource;
    @Autowired
    private TwoDatasouce twoDatasouce;
    @Autowired
    private ThreeDatasource threeDatasource;
    @Value("${springboot.randomint}")
    private int randomint;

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println(randomint);
        System.out.println(args.getNonOptionArgs().toString());
        System.out.println(myDatasource);
        System.out.println(twoDatasouce);
        System.out.println(threeDatasource);
        return "hello world";
    }
}
