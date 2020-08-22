package com.rpy.listener;

import com.rpy.domain.Goods;
import com.rpy.service.GoodsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@Component
@Scope("singleton")
@Log4j2
public class ApplicationInitListener  implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private StringRedisTemplate redisTemplate;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(event.getApplicationContext().getParent() == null) {
            ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
            log.info(">>>>>>>>>>>>项目初始化完成，执行监听器中逻辑");
            //mapper中的sql，返回全部上架（支持秒杀）的商品集合
            List<Goods> list = goodsService.selectGoodsToMiaoSha();
            Iterator<Goods> it = list.iterator();
            while(it.hasNext()) {
                Goods p = it.next();
                try {
                    opsForValue.set(String.valueOf(p.getGoodsId()), String.valueOf(p.getTotalStocks()));
                    log.info("商品放成Redis成功ID："+p.getGoodsId()+"商品库存："+p.getTotalStocks());
                } catch (Exception e) {
                    log.error("当前商品ID："+p.getGoodsId()+"库存："+p.getTotalStocks()+"放入Redis缓存异常<<<<<<<<<<<<<<<<<<<<");
                    e.printStackTrace();
                }
            }
        }
    }
}
