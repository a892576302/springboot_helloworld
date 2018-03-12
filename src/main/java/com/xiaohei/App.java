package com.xiaohei;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by 非洲小黑 on 2018/1/31.
 */
@SpringBootApplication
//①相当于在xml中配置<tx:annotation-driven/>,
// 如果在classpath中添加的是spring-boot-starter-jdbc，那么springboot自动创建DataSourceTranscationManager；
//在想事物控制的地方贴标签 @Transactional
//@EnableTransactionManagement
//②可以用代码的@Bean形式注入
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
