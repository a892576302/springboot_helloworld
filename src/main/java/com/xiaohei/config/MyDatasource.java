package com.xiaohei.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 非洲小黑 on 2018/2/8.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyDatasource {
    private String username;
    private String password;
    private String url;
}
