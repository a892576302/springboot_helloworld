package com.xiaohei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 非洲小黑 on 2018/3/12.
 */
@Controller
public class DataSourceController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "ds")
    @ResponseBody
    public String dataSource() throws SQLException {
        Connection connection = dataSource.getConnection();
        return dataSource.getClass()+"------"+dataSource.toString();
    }
}
