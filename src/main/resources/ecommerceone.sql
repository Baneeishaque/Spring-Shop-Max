/*
 Navicat Premium Data Transfer

 Source Server         : intern
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : ecommerceone

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 25/05/2020 16:25:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for a
-- ----------------------------
DROP TABLE IF EXISTS `a`;
CREATE TABLE `a`  (
  `PRODUCTID` int(11) NOT NULL,
  `ORDERID` int(11) NOT NULL,
  PRIMARY KEY (`PRODUCTID`, `ORDERID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a
-- ----------------------------

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `ADDRESSID` int(11) NOT NULL,
  `ORDERID` int(11) NULL DEFAULT NULL,
  `CITY` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `PROVINCE` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `STATE` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `STREETNO` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `STREETNAME` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `POSTALCODE` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ADDRESSID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `ADMINID` int(11) NOT NULL,
  `ADMINNAME` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ADMINPASSWORD` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ADMINEMAIL` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`ADMINID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'tom', '1234', 'tom@gmail.com');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `CUSTOMERIID` int(11) NOT NULL,
  `PAYMENTID` int(11) NULL DEFAULT NULL,
  `WISHLISTID` int(11) NULL DEFAULT NULL,
  `USERNAME` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `PASSWORDS` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `FULL_NAME` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `GENDER` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `PHONE` bigint(20) NOT NULL,
  PRIMARY KEY (`CUSTOMERIID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `ORDERID` int(11) NOT NULL,
  `ADDRESSID` int(11) NULL DEFAULT NULL,
  `PAYMENTID` int(11) NULL DEFAULT NULL,
  `CUSTOMERIID` int(11) NULL DEFAULT NULL,
  `SHIPPINGID` int(11) NULL DEFAULT NULL,
  `ORDERDATE` datetime(0) NOT NULL,
  `TOTALPRICE` float NOT NULL,
  `QUANTITY` float NOT NULL,
  PRIMARY KEY (`ORDERID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `PAYMENTID` int(11) NOT NULL,
  `CUSTOMERIID` int(11) NULL DEFAULT NULL,
  `CARD` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `WECHAT` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ALIPAY` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`PAYMENTID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of payment
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `PRODUCTID` int(11) NOT NULL AUTO_INCREMENT,
  `WISHLISTID` int(11) NULL DEFAULT NULL,
  `ADMINID` int(11) NULL DEFAULT NULL,
  `IMAGE` longblob NULL,
  `NAME` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `PRICE` float NULL DEFAULT NULL,
  `DESCRIPTION` varchar(1024) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`PRODUCTID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (3, NULL, NULL, 0x6265617665722E6A7067, 'ada', 123, 'asdfa');
INSERT INTO `product` VALUES (4, NULL, NULL, 0x546F756B612E706E67, '122', 12321, 'weqe');

-- ----------------------------
-- Table structure for shipping
-- ----------------------------
DROP TABLE IF EXISTS `shipping`;
CREATE TABLE `shipping`  (
  `SHIPPINGID` int(11) NOT NULL,
  `ORDERID` int(11) NULL DEFAULT NULL,
  `SHIPPINGFEE` float NOT NULL,
  PRIMARY KEY (`SHIPPINGID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shipping
-- ----------------------------

-- ----------------------------
-- Table structure for wishlist
-- ----------------------------
DROP TABLE IF EXISTS `wishlist`;
CREATE TABLE `wishlist`  (
  `WISHLISTID` int(11) NOT NULL,
  `CUSTOMERIID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`WISHLISTID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wishlist
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
