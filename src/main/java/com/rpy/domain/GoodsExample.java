package com.rpy.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andOriPriceIsNull() {
            addCriterion("ori_price is null");
            return (Criteria) this;
        }

        public Criteria andOriPriceIsNotNull() {
            addCriterion("ori_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriPriceEqualTo(BigDecimal value) {
            addCriterion("ori_price =", value, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceNotEqualTo(BigDecimal value) {
            addCriterion("ori_price <>", value, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceGreaterThan(BigDecimal value) {
            addCriterion("ori_price >", value, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ori_price >=", value, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceLessThan(BigDecimal value) {
            addCriterion("ori_price <", value, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ori_price <=", value, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceIn(List<BigDecimal> values) {
            addCriterion("ori_price in", values, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceNotIn(List<BigDecimal> values) {
            addCriterion("ori_price not in", values, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ori_price between", value1, value2, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andOriPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ori_price not between", value1, value2, "oriPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andImgsIsNull() {
            addCriterion("imgs is null");
            return (Criteria) this;
        }

        public Criteria andImgsIsNotNull() {
            addCriterion("imgs is not null");
            return (Criteria) this;
        }

        public Criteria andImgsEqualTo(String value) {
            addCriterion("imgs =", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotEqualTo(String value) {
            addCriterion("imgs <>", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsGreaterThan(String value) {
            addCriterion("imgs >", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsGreaterThanOrEqualTo(String value) {
            addCriterion("imgs >=", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLessThan(String value) {
            addCriterion("imgs <", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLessThanOrEqualTo(String value) {
            addCriterion("imgs <=", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLike(String value) {
            addCriterion("imgs like", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotLike(String value) {
            addCriterion("imgs not like", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsIn(List<String> values) {
            addCriterion("imgs in", values, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotIn(List<String> values) {
            addCriterion("imgs not in", values, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsBetween(String value1, String value2) {
            addCriterion("imgs between", value1, value2, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotBetween(String value1, String value2) {
            addCriterion("imgs not between", value1, value2, "imgs");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andSoldNumIsNull() {
            addCriterion("sold_num is null");
            return (Criteria) this;
        }

        public Criteria andSoldNumIsNotNull() {
            addCriterion("sold_num is not null");
            return (Criteria) this;
        }

        public Criteria andSoldNumEqualTo(Integer value) {
            addCriterion("sold_num =", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotEqualTo(Integer value) {
            addCriterion("sold_num <>", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumGreaterThan(Integer value) {
            addCriterion("sold_num >", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sold_num >=", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumLessThan(Integer value) {
            addCriterion("sold_num <", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumLessThanOrEqualTo(Integer value) {
            addCriterion("sold_num <=", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumIn(List<Integer> values) {
            addCriterion("sold_num in", values, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotIn(List<Integer> values) {
            addCriterion("sold_num not in", values, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumBetween(Integer value1, Integer value2) {
            addCriterion("sold_num between", value1, value2, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sold_num not between", value1, value2, "soldNum");
            return (Criteria) this;
        }

        public Criteria andTotalStocksIsNull() {
            addCriterion("total_stocks is null");
            return (Criteria) this;
        }

        public Criteria andTotalStocksIsNotNull() {
            addCriterion("total_stocks is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStocksEqualTo(Integer value) {
            addCriterion("total_stocks =", value, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksNotEqualTo(Integer value) {
            addCriterion("total_stocks <>", value, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksGreaterThan(Integer value) {
            addCriterion("total_stocks >", value, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_stocks >=", value, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksLessThan(Integer value) {
            addCriterion("total_stocks <", value, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksLessThanOrEqualTo(Integer value) {
            addCriterion("total_stocks <=", value, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksIn(List<Integer> values) {
            addCriterion("total_stocks in", values, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksNotIn(List<Integer> values) {
            addCriterion("total_stocks not in", values, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksBetween(Integer value1, Integer value2) {
            addCriterion("total_stocks between", value1, value2, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andTotalStocksNotBetween(Integer value1, Integer value2) {
            addCriterion("total_stocks not between", value1, value2, "totalStocks");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIsNull() {
            addCriterion("delivery_mode is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIsNotNull() {
            addCriterion("delivery_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeEqualTo(Object value) {
            addCriterion("delivery_mode =", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotEqualTo(Object value) {
            addCriterion("delivery_mode <>", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeGreaterThan(Object value) {
            addCriterion("delivery_mode >", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeGreaterThanOrEqualTo(Object value) {
            addCriterion("delivery_mode >=", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLessThan(Object value) {
            addCriterion("delivery_mode <", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLessThanOrEqualTo(Object value) {
            addCriterion("delivery_mode <=", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIn(List<Object> values) {
            addCriterion("delivery_mode in", values, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotIn(List<Object> values) {
            addCriterion("delivery_mode not in", values, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeBetween(Object value1, Object value2) {
            addCriterion("delivery_mode between", value1, value2, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotBetween(Object value1, Object value2) {
            addCriterion("delivery_mode not between", value1, value2, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdIsNull() {
            addCriterion("delivery_template_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdIsNotNull() {
            addCriterion("delivery_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdEqualTo(Long value) {
            addCriterion("delivery_template_id =", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdNotEqualTo(Long value) {
            addCriterion("delivery_template_id <>", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdGreaterThan(Long value) {
            addCriterion("delivery_template_id >", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("delivery_template_id >=", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdLessThan(Long value) {
            addCriterion("delivery_template_id <", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("delivery_template_id <=", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdIn(List<Long> values) {
            addCriterion("delivery_template_id in", values, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdNotIn(List<Long> values) {
            addCriterion("delivery_template_id not in", values, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdBetween(Long value1, Long value2) {
            addCriterion("delivery_template_id between", value1, value2, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("delivery_template_id not between", value1, value2, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeIsNull() {
            addCriterion("putaway_time is null");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeIsNotNull() {
            addCriterion("putaway_time is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeEqualTo(Date value) {
            addCriterion("putaway_time =", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeNotEqualTo(Date value) {
            addCriterion("putaway_time <>", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeGreaterThan(Date value) {
            addCriterion("putaway_time >", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("putaway_time >=", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeLessThan(Date value) {
            addCriterion("putaway_time <", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeLessThanOrEqualTo(Date value) {
            addCriterion("putaway_time <=", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeIn(List<Date> values) {
            addCriterion("putaway_time in", values, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeNotIn(List<Date> values) {
            addCriterion("putaway_time not in", values, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeBetween(Date value1, Date value2) {
            addCriterion("putaway_time between", value1, value2, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeNotBetween(Date value1, Date value2) {
            addCriterion("putaway_time not between", value1, value2, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaIsNull() {
            addCriterion("ismiaosha is null");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaIsNotNull() {
            addCriterion("ismiaosha is not null");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaEqualTo(Integer value) {
            addCriterion("ismiaosha =", value, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaNotEqualTo(Integer value) {
            addCriterion("ismiaosha <>", value, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaGreaterThan(Integer value) {
            addCriterion("ismiaosha >", value, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismiaosha >=", value, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaLessThan(Integer value) {
            addCriterion("ismiaosha <", value, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaLessThanOrEqualTo(Integer value) {
            addCriterion("ismiaosha <=", value, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaIn(List<Integer> values) {
            addCriterion("ismiaosha in", values, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaNotIn(List<Integer> values) {
            addCriterion("ismiaosha not in", values, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaBetween(Integer value1, Integer value2) {
            addCriterion("ismiaosha between", value1, value2, "ismiaosha");
            return (Criteria) this;
        }

        public Criteria andIsmiaoshaNotBetween(Integer value1, Integer value2) {
            addCriterion("ismiaosha not between", value1, value2, "ismiaosha");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}