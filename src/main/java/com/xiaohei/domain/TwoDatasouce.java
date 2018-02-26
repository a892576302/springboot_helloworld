package com.xiaohei.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 非洲小黑 on 2018/2/8.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "db")
@Component
public class TwoDatasouce {
    private String username;
    private String password;
    private String url;
}
