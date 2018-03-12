package com.xiaohei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * Created by 非洲小黑 on 2018/3/12.
 */
@Controller
public class DataSourceController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "dataSource")
    @ResponseBody
    public String dataSource(){
        return dataSource.getClass()+"-----"+dataSource.toString();
    }
}
