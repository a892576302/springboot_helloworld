package com.xiaohei.controller;

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
    @Value("${springboot.randomint}")
    private int randomint;

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println(randomint);
        System.out.println(args.getNonOptionArgs().toString());
        return "hello world yes---";
    }
}
