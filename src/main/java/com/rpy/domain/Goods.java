package com.rpy.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 店铺id
    */
    private Long shopId;

    /**
    * 原价
    */
    private BigDecimal oriPrice;

    /**
    * 现价
    */
    private BigDecimal price;

    /**
    * 简要描述,卖点等
    */
    private String brief;

    /**
    * 详细描述
    */
    private String content;

    /**
    * 商品主图
    */
    private String picture;

    /**
    * 商品图片，以,分割
    */
    private String imgs;

    /**
    * 默认是1，表示正常状态, -1表示删除, 0下架
    */
    private Integer status;

    /**
    * 商品分类
    */
    private Long categoryId;

    /**
    * 销量
    */
    private Integer soldNum;

    /**
    * 总库存
    */
    private Integer totalStocks;

    /**
    * 配送方式json见TransportModeVO
    */
    private Object deliveryMode;

    /**
    * 运费模板id
    */
    private Long deliveryTemplateId;

    /**
    * 录入时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 上架时间
    */
    private Date putawayTime;

    /**
    * 版本 乐观锁
    */
    private Integer version;

    /**
    * 是否参与秒杀1是0否
    */
    private Integer ismiaosha;
}