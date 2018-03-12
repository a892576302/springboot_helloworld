package com.xiaohei;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

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
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///shuaihei");
        dataSource.setUsername("root");
        dataSource.setPassword("luo0514");
        dataSource.setInitialSize(3);
        return dataSource;
    }

    /*public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }*/
}
