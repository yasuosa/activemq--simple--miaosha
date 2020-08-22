/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : miaosha

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 26/03/2020 11:13:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods`  (
  `goods_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goods_name` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '商品名称',
  `shop_id` bigint(20) NULL DEFAULT NULL COMMENT '店铺id',
  `ori_price` decimal(15, 2) NULL DEFAULT 0.00 COMMENT '原价',
  `price` decimal(15, 2) NULL DEFAULT NULL COMMENT '现价',
  `brief` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '简要描述,卖点等',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '详细描述',
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品主图',
  `imgs` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片，以,分割',
  `status` int(1) NULL DEFAULT 0 COMMENT '默认是1，表示正常状态, -1表示删除, 0下架',
  `category_id` bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '商品分类',
  `sold_num` int(11) NULL DEFAULT NULL COMMENT '销量',
  `total_stocks` int(11) NULL DEFAULT 0 COMMENT '总库存',
  `delivery_mode` json NULL COMMENT '配送方式json见TransportModeVO',
  `delivery_template_id` bigint(20) NULL DEFAULT NULL COMMENT '运费模板id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `putaway_time` datetime(0) NULL DEFAULT NULL COMMENT '上架时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本 乐观锁',
  `ismiaosha` int(11) NULL DEFAULT 0 COMMENT '是否参与秒杀1是0否',
  PRIMARY KEY (`goods_id`) USING BTREE,
  INDEX `shop_id`(`shop_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 95 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES (18, 'Apple iPhone XS Max 移动联通电信4G手机 ', 1, 0.00, 1.01, '6.5英寸大屏，支持双卡。', '<div style=\"margin: 0px; padding: 0px; color: #666666; font-family: tahoma, arial, \'Microsoft YaHei\', \'Hiragino Sans GB\', u5b8bu4f53, sans-serif; font-size: 12px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: #ffffff; text-decoration-style: initial; text-decoration-color: initial;\" align=\"center\">\n<table id=\"__01\" style=\"text-align: center;\" border=\"0\" width=\"750\" cellspacing=\"0\" cellpadding=\"0\">\n<tbody>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img30.360buyimg.com/cms/jfs/t1/4626/32/3475/220504/5b997365E80a1373f/279c244f12161cb3.jpg\" alt=\"\" width=\"750\" height=\"1991\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img12.360buyimg.com/cms/jfs/t1/3397/21/3533/236322/5b99759aE73795787/f782e04a140c8f16.jpg\" alt=\"\" width=\"750\" height=\"2052\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img11.360buyimg.com/cms/jfs/t1/5274/3/3465/245167/5b997365E16b81bc9/93e07e40f3af5e62.jpg\" alt=\"\" width=\"750\" height=\"2250\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img30.360buyimg.com/cms/jfs/t1/2322/11/3524/269574/5b997365E26f81a7a/e01fc9486da9eda1.jpg\" alt=\"\" width=\"750\" height=\"2327\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img13.360buyimg.com/cms/jfs/t1/5074/21/3432/296470/5b997364Ee966f7a0/7f424d41479db45d.jpg\" alt=\"\" width=\"750\" height=\"2561\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img13.360buyimg.com/cms/jfs/t1/5770/18/3580/288371/5b997365Ea2c58cb4/176b9a40ccd4e56b.jpg\" alt=\"\" width=\"750\" height=\"2668\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img11.360buyimg.com/cms/jfs/t1/227/21/3811/268132/5b997364E3d6c51b2/92d2a3a559e3baa8.jpg\" alt=\"\" width=\"750\" height=\"2850\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img20.360buyimg.com/cms/jfs/t1/3787/5/3493/125020/5b997363E3c9f5910/ddbd08a556744630.jpg\" alt=\"\" width=\"750\" height=\"1486\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img30.360buyimg.com/cms/jfs/t1/1687/5/3327/266718/5b997366E9cc80e69/9e40ceae1fef4466.jpg\" alt=\"\" width=\"750\" height=\"3376\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img30.360buyimg.com/cms/jfs/t1/457/6/3849/283318/5b997363E0c5ab7a9/6f636f0a286bc87c.jpg\" alt=\"\" width=\"750\" height=\"2455\" /></td>\n</tr>\n<tr>\n<td><img class=\"\" style=\"margin: 0px; padding: 0px; border: 0px; vertical-align: middle;\" src=\"https://img10.360buyimg.com/cms/jfs/t1/397/25/3796/217624/5b9975a8E5ee578af/4d8f05a606fa5c4a.jpg\" alt=\"\" width=\"750\" height=\"2703\" /></td>\n</tr>\n</tbody>\n</table>\n</div>', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 1, 93, 0, 10, '{\"hasUserPickUp\": false, \"hasShopDelivery\": true}', 47, '2019-03-29 14:40:00', '2019-06-22 18:28:32', '2019-06-22 18:28:32', 85, 1);
INSERT INTO `t_goods` VALUES (59, '兰蔻粉水清滢柔肤水400ml 爽肤水女保湿舒缓滋润嫩肤', 1, 0.00, 420.00, '好看耐穿', '<p><img src=\"http://img-test.gz-yami.com/2019/04/71f54ee20ef34872b1e0aa53cb75b7b6.jpg\" alt=\"\" width=\"790\" height=\"1110\" /></p>', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 1, 87, 0, 10, '{\"hasUserPickUp\": false, \"hasShopDelivery\": true}', 48, '2019-04-21 19:15:34', '2019-04-29 14:30:44', '2019-04-29 14:30:44', NULL, 1);
INSERT INTO `t_goods` VALUES (68, '【Dole都乐】菲律宾都乐非转基因木瓜1只 单只约410g', 1, 0.00, 26.00, '包邮 肉厚籽少 独具风味', '<p style=\"text-align: justify;\"><img src=\"http://img-test.gz-yami.com/2019/04/e7536a53a83d450e8635ce1e9819faf6.jpg\" alt=\"\" width=\"790\" height=\"350\" /></p>', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 1, 95, 0, 10, '{\"hasUserPickUp\": false, \"hasShopDelivery\": true}', 47, '2019-04-21 21:56:38', '2019-05-22 10:30:37', '2019-05-22 10:30:37', NULL, 0);
INSERT INTO `t_goods` VALUES (69, '阿迪达斯官方 adidas 三叶草 NITE JOGGER 男子经典鞋BD7956', 1, 10.00, 1199.00, ' 运动鞋/休闲鞋', '<p><img src=\"http://img-test.gz-yami.com/2019/04/6d0bea4a0be54423999136bcd1158897.jpg\" alt=\"\" width=\"790\" height=\"2232\" /></p>', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 1, 88, 100, 10, '{\"hasUserPickUp\": false, \"hasShopDelivery\": true}', 47, '2019-04-21 22:10:04', '2019-05-23 20:17:03', '2019-05-22 13:37:26', NULL, 0);
INSERT INTO `t_goods` VALUES (70, '【Dole都乐】比利时Truval啤梨12只 进口水果新鲜梨 单果120g左右', 1, 0.00, 38.00, '好吃', '<p><img src=\"http://img-test.gz-yami.com/2019/04/67ce2251e9b14ea08b87752ef7b30207.jpg\" alt=\"\" width=\"760\" height=\"488\" /></p>', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 1, 95, 100, 10, '{\"hasUserPickUp\": false, \"hasShopDelivery\": true}', 47, '2019-04-22 16:43:33', '2019-06-22 09:40:24', '2019-06-22 09:40:24', NULL, 0);
INSERT INTO `t_goods` VALUES (71, '旗舰店官网 自拍神器 梵高定制', 1, 10.00, 6998.00, '梵高定制礼盒 全球限量发售 分期免息', '<p><img src=\"http://img-test.gz-yami.com/2019/04/fa35b300102e45f3a57d7c5c775ebf6d.jpg\" alt=\"\" width=\"790\" height=\"853\" /></p>\n<p><img src=\"http://img-test.gz-yami.com/2019/04/f8fd168ddb8a437dbb5b742691bd1d02.jpg\" alt=\"\" width=\"800\" height=\"800\" /><img src=\"http://img-test.gz-yami.com/2019/04/db46108466264b48841b18437940e0b3.jpg\" alt=\"\" width=\"800\" height=\"800\" /></p>', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 'https://img12.360buyimg.com/n7/jfs/t7297/154/3413903491/65679/45ae4902/59e42830N9da56c41.jpg', 1, 85, 0, 10, '{\"hasUserPickUp\": false, \"hasShopDelivery\": true}', 47, '2019-04-23 15:43:26', '2019-05-21 11:01:59', '2019-05-21 11:01:59', NULL, 0);

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NULL DEFAULT NULL,
  `goodsid` int(11) NULL DEFAULT NULL,
  `createtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
