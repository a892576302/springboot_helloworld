package com.xiaohei.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.xiaohei.domain.MyDatasource;
import com.xiaohei.domain.ThreeDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by 非洲小黑 on 2018/2/8.
 */
@Configuration
public class AppConfig {
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;

    @Bean
    public MyDatasource getMyDatasource(){
        return new MyDatasource(username,password,url);
    }

    @Bean
    @ConfigurationProperties(prefix = "db")
    public ThreeDatasource getThreeDatasource(){
        return new ThreeDatasource();
    }


    /**
     * 第一种代码的方式实现datasource
     */
   /* @Bean
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///shuaihei");
        dataSource.setUsername("root");
        dataSource.setPassword("luo0514");
        dataSource.setInitialSize(5);
        dataSource.setMinIdle(5);
        return dataSource;
    }*/
    /*//配置和代码形式实现
   @Bean
   @ConfigurationProperties(prefix = "ds")
   public DataSource dataSource(Properties properties) throws Exception {
       return DruidDataSourceFactory.createDataSource(properties);
   }*/
}
