package com.xiaohei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 非洲小黑 on 2018/2/26.
 */
@Controller
public class FreeMakerController {

    @RequestMapping(value = "hello3")
    public String hello3(Model model){
        model.addAttribute("msg","freeMaker的视图");
        return "hello3";
    }
}
