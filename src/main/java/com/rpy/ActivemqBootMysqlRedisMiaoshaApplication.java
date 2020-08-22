package com.rpy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@MapperScan(basePackages = "com.rpy.mapper")
public class ActivemqBootMysqlRedisMiaoshaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqBootMysqlRedisMiaoshaApplication.class, args);
    }

}
