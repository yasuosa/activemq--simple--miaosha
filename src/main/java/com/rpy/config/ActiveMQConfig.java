package com.rpy.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/

@Configuration
public class ActiveMQConfig {


    public static final String QUEUE_NAME="seconds-kill-queue";

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(QUEUE_NAME);
    }
}
