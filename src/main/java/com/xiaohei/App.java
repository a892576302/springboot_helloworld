package com.xiaohei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.activation.DataSource;

/**
 * Created by 非洲小黑 on 2018/1/31.
 */
@SpringBootApplication
public class App {
    /**
     * 代码的方式实现datasource
     */
    @Bean
    public DataSource getDataSource(){
        return null;
    }

    /*public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }*/
}
