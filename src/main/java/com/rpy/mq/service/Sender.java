package com.rpy.mq.service;

import com.rpy.config.ActiveMQConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@Service
@Log4j2
public class Sender {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    private int i;
    /**
     * 如查用户抢到商品就发送到队列，信息包含商品ID和用户ID
     * @param goodsId
     * @param userId
     */
    public void sendDirectQueue(String goodsId,String userId){
        log.info(">>>>>>>>>>>>>>秒杀请求已发送，商品ID为："+goodsId+"--用户ID："+userId);
        try {
            Map<String,String> map=new HashMap<>();
            map.put("goodsId",goodsId);
            map.put("userId",userId);
            //第一个参数是指要发送到哪个队列里面， 第二个参数是指要发送的内容
            jmsMessagingTemplate.convertAndSend(ActiveMQConfig.QUEUE_NAME, map);
            //此处为了记录并发请求下，请求的次数及消息传递的次数
            log.info("发送请求>>>>>>>>>>>>>"+i++);
        } catch (Exception e) {
            log.error("请求发送异常："+e.getMessage());
            e.printStackTrace();
        }
    }
}
