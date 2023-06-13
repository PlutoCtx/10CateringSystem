/*
 Navicat Premium Data Transfer

 Source Server         : testmmysql
 Source Server Type    : MySQL
 Source Server Version : 100605
 Source Host           : localhost:3306
 Source Schema         : 10cateringsys

 Target Server Type    : MySQL
 Target Server Version : 100605
 File Encoding         : 65001

 Date: 13/06/2023 10:52:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `goodsDesc` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `imageLink` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (3, '宫保鸡丁', 21, '宫保鸡丁哦', 'D:\\ProgramingCodes\\IntelliJIDEAProjects\\JavaCodes\\java\\CateringSystem\\src\\main\\resources\\imgs\\111.jpg');
INSERT INTO `goods` VALUES (5, '青椒肉丝', 22, '青椒肉丝不好吃', 'D:\\ProgramingCodes\\IntelliJIDEAProjects\\JavaCodes\\java\\CateringSystem\\src\\main\\resources\\imgs\\222.jpg');
INSERT INTO `goods` VALUES (8, '21', 2, 'sd cd', 'D:\\ProgramingCodes\\IntelliJIDEAProjects\\JavaCodes\\java\\CateringSystem\\src\\main\\resources\\imgs\\333.jpg');
INSERT INTO `goods` VALUES (9, '鱼香肉丝', 9, '四川风味', 'D:\\ProgramingCodes\\IntelliJIDEAProjects\\JavaCodes\\java\\CateringSystem\\src\\main\\resources\\imgs\\444.jpg');
INSERT INTO `goods` VALUES (10, '回锅肉', 12, NULL, 'D:\\ProgramingCodes\\IntelliJIDEAProjects\\JavaCodes\\java\\CateringSystem\\src\\main\\resources\\imgs\\555.jpg');
INSERT INTO `goods` VALUES (11, '热狗肠', 32, '说的', 'D:\\ProgramingCodes\\IntelliJIDEAProjects\\JavaCodes\\java\\CateringSystem\\src\\main\\resources\\imgs\\666.jpg');
INSERT INTO `goods` VALUES (12, '123', 11, '1231231', '');

-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `orderId` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `goodsTotalPrice` float NULL DEFAULT NULL,
  `goodsId` int(10) NULL DEFAULT NULL,
  `goodsPrice` float NULL DEFAULT NULL,
  `goodsNum` int(10) NULL DEFAULT NULL,
  `goodsName` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_order_goods_2`(`orderId`) USING BTREE,
  INDEX `FK_order_goods_1`(`goodsId`) USING BTREE,
  CONSTRAINT `order_goods_ibfk_1` FOREIGN KEY (`goodsId`) REFERENCES `goods` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_goods_ibfk_2` FOREIGN KEY (`orderId`) REFERENCES `order_info` (`orderId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_goods
-- ----------------------------
INSERT INTO `order_goods` VALUES (23, '20130708001514', 12, 10, 12, 1, '回锅肉');
INSERT INTO `order_goods` VALUES (28, '20130708021437', 12, 10, 12, 1, '回锅肉');
INSERT INTO `order_goods` VALUES (31, '20130708110510', 22, 5, 22, 1, '青椒肉丝');
INSERT INTO `order_goods` VALUES (32, '20130708110510', 9, 9, 9, 1, '鱼香肉丝');
INSERT INTO `order_goods` VALUES (33, '20130708110513', 12, 10, 12, 1, '回锅肉');
INSERT INTO `order_goods` VALUES (34, '20130708110513', 32, 11, 32, 1, '热狗肠');
INSERT INTO `order_goods` VALUES (39, '20130708115503', 2, 8, 2, 1, '21');
INSERT INTO `order_goods` VALUES (40, '20130708115508', 12, 10, 12, 1, '回锅肉');
INSERT INTO `order_goods` VALUES (41, '20130708115508', 32, 11, 32, 1, '热狗肠');
INSERT INTO `order_goods` VALUES (42, '20130708115512', 22, 5, 22, 1, '青椒肉丝');
INSERT INTO `order_goods` VALUES (43, '20130708121456', 9, 9, 9, 1, '鱼香肉丝');
INSERT INTO `order_goods` VALUES (44, '20230613003816', 22, 5, 22, 1, '青椒肉丝');
INSERT INTO `order_goods` VALUES (45, '20230613094949', 9, 9, 9, 1, '鱼香肉丝');
INSERT INTO `order_goods` VALUES (46, '20230613095000', 2, 8, 2, 1, '21');
INSERT INTO `order_goods` VALUES (47, '20230613095000', 9, 9, 9, 1, '鱼香肉丝');
INSERT INTO `order_goods` VALUES (48, '20230613095000', 32, 11, 32, 1, '热狗肠');
INSERT INTO `order_goods` VALUES (49, '20230613095135', 22, 5, 22, 1, '青椒肉丝');
INSERT INTO `order_goods` VALUES (50, '20230613095135', 2, 8, 2, 1, '21');

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info`  (
  `orderId` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `orderStatus` int(10) NULL DEFAULT NULL,
  `orderNum` int(10) NULL DEFAULT NULL,
  `orderTotalMoney` float NULL DEFAULT NULL,
  `userName` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('20130708001514', 3, 1, 12, 'admin1');
INSERT INTO `order_info` VALUES ('20130708021437', 1, 1, 12, 'admin1');
INSERT INTO `order_info` VALUES ('20130708110510', 2, 2, 31, 'aaa');
INSERT INTO `order_info` VALUES ('20130708110513', 3, 2, 44, 'aaa');
INSERT INTO `order_info` VALUES ('20130708115503', 1, 1, 2, 'admin1');
INSERT INTO `order_info` VALUES ('20130708115508', 4, 2, 44, 'admin1');
INSERT INTO `order_info` VALUES ('20130708115512', 3, 1, 22, 'admin1');
INSERT INTO `order_info` VALUES ('20130708121456', 4, 1, 9, 'admin1');
INSERT INTO `order_info` VALUES ('20230613003816', 4, 1, 22, '123');
INSERT INTO `order_info` VALUES ('20230613094949', 4, 1, 9, '123');
INSERT INTO `order_info` VALUES ('20230613095000', 1, 3, 43, '123');
INSERT INTO `order_info` VALUES ('20230613095135', 0, 2, 24, '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `email` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `rank` int(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123', NULL, 1);
INSERT INTO `user` VALUES (8, 'aaa', '123', 'ad@1.com', 0);
INSERT INTO `user` VALUES (9, 'admin1', '123', NULL, 0);
INSERT INTO `user` VALUES (10, '123', '123123', NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;
