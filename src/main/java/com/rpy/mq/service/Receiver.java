package com.rpy.mq.service;

import com.rpy.config.ActiveMQConfig;
import com.rpy.domain.Goods;
import com.rpy.domain.Order;
import com.rpy.service.GoodsService;
import com.rpy.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.MapMessage;
import java.util.Date;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@Service
@Log4j2
public class Receiver {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private OrderService orderService;


    private int i;

    @JmsListener(destination = ActiveMQConfig.QUEUE_NAME)
    public void receive(MapMessage mapMessage){
        try {
            //取到商品ID判断redis里面的该商品库存是否为0
            String goodsId = mapMessage.getString("goodsId");
            ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
            long num = opsForValue.decrement(goodsId).longValue();//递减
            if(num<0){
                /**
                 * 此处不能判断等于0，因为当商品库存为1时，Redis执行递减返回为0
                 * 如果判断为0商品最后不能卖完也就是当库存为1时此处就抛异常了
                 */
                throw new RuntimeException("库存不足啦，不能再抢了");
            }
            log.info("接收时>>>>>>>>>>>"+i++);
            Goods goods=new Goods();
            goods.setGoodsId(Long.valueOf(goodsId));
            //哪果不为0=则减小mysql里面该商品的库存
            goods.setTotalStocks((int)num);
            //根据商品的id和库存同步数据到MySQL
            if(!goodsService.updateByPrimaryKeySelective(goods)) {
                throw new RuntimeException("同步到商品表异常！");
            }
            ////生成订单
            String uid=mapMessage.getString("userId");
            log.info("成功了>>>>>>>>>>>"+uid+"  抢到了商品 O(∩_∩)O哈哈~");
            Order order=new Order();
            order.setGoodsid(Integer.valueOf(goodsId));
            order.setUserid(Integer.valueOf(uid));
            order.setCreatetime(new Date());
            orderService.insert(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
