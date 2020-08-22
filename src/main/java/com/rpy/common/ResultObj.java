package com.rpy.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    private Integer code;
    private String msg;
}
