package com.rpy.service;

import com.rpy.domain.Goods;

import java.util.List;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/

public interface GoodsService {
    boolean updateByPrimaryKeySelective(Goods goods);

    List<Goods> selectGoodsToMiaoSha();

    boolean secondsKill(String pid, String userId);
}
