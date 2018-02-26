package com.xiaohei.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 非洲小黑 on 2018/2/12.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThreeDatasource {
    private String username;
    private String password;
    private String url;
}
