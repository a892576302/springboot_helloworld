package com.xiaohei.config;

import com.xiaohei.domain.MyDatasource;
import com.xiaohei.domain.ThreeDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
