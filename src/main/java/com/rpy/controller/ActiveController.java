package com.rpy.controller;

import com.rpy.common.ResultObj;
import com.rpy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@RestController
public class ActiveController {


    @Autowired
    private GoodsService goodsService;

    /**
     * 秒杀入口
     * @param pid -商品id，做检查库存使用
     * @param userId -用户id，做订单和用户关联使用（比如生成成功秒杀商品的用户订单表）
     * 			     我这里没做多余的逻辑，只看了相关情况的返回结果，有需要的可以自己去实现
     */
    @RequestMapping(value = "secondsKill")
    public ResultObj secondsKill(String pid, String userId) {
        try {
            //模拟发送100次请求，库存设置为少于100查看结果，此100次请求为顺序请求
            //for(int i=0; i<100; i++) {
            boolean result = goodsService.secondsKill(pid, userId);
            if(result) {
                return new ResultObj(1,"秒杀成功，请稍后去订单查询");
            }
            //}
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultObj(-1,"秒杀失败，原因:"+e.getMessage());
        }
        return null;
    }
}
