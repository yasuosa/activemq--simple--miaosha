package com.rpy.service.impl;

import com.rpy.domain.Goods;
import com.rpy.domain.GoodsExample;
import com.rpy.mapper.GoodsMapper;
import com.rpy.mq.service.Sender;
import com.rpy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@Transactional
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private Sender sender;

    int i=0;

    @Override
    public boolean updateByPrimaryKeySelective(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods)>0;
    }

    @Override
    public List<Goods> selectGoodsToMiaoSha() {
        GoodsExample example=new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andIsmiaoshaEqualTo(1);//只找要秒杀的
        List<Goods> goods = this.goodsMapper.selectByExample(example);
        return goods;
    }

    @Override
    public boolean secondsKill(String pid, String userId) {
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        boolean result = true;
        //根据商品id获取Redis中的库存数量
        String num =opsForValue.get(pid);
        System.out.println("redis>>>>>>>>>>"+num);
        if(new Long(num) <= 0) {
            result = false;
            throw new RuntimeException("库存不足");
        }
        //消息入队，调用相关方法
        sender.sendDirectQueue(pid,userId);
        //只为验证请求及发送消息次数
        System.out.println("service>>>>>>>>>>"+i++);
        return result;
    }
}
