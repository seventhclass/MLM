/*
Navicat MySQL Data Transfer

Source Server         : mysql(xampp)
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : mlm

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2015-04-11 15:26:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_account`
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `isautoship` int(6) unsigned NOT NULL DEFAULT '1',
  `annualfee` decimal(6,2) NOT NULL,
  `min_bv` int(11) NOT NULL,
  `cpsn_id` int(6) unsigned NOT NULL DEFAULT '0',
  `promotions` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_account
-- ----------------------------

-- ----------------------------
-- Table structure for `t_album`
-- ----------------------------
DROP TABLE IF EXISTS `t_album`;
CREATE TABLE `t_album` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `productid` int(6) unsigned NOT NULL,
  `imagename` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_album
-- ----------------------------

-- ----------------------------
-- Table structure for `t_autoship`
-- ----------------------------
DROP TABLE IF EXISTS `t_autoship`;
CREATE TABLE `t_autoship` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `date` int(10) NOT NULL,
  `shipdate` int(10) NOT NULL,
  `userid` bigint(8) unsigned NOT NULL,
  `addressid` int(6) unsigned NOT NULL,
  `shipmethodid` int(6) unsigned NOT NULL,
  `volume` decimal(6,2) DEFAULT NULL,
  `fee` decimal(6,2) NOT NULL,
  `paymentid` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_autoship
-- ----------------------------

-- ----------------------------
-- Table structure for `t_bank`
-- ----------------------------
DROP TABLE IF EXISTS `t_bank`;
CREATE TABLE `t_bank` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_bank
-- ----------------------------

-- ----------------------------
-- Table structure for `t_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_category
-- ----------------------------

-- ----------------------------
-- Table structure for `t_country`
-- ----------------------------
DROP TABLE IF EXISTS `t_country`;
CREATE TABLE `t_country` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_country
-- ----------------------------

-- ----------------------------
-- Table structure for `t_currency`
-- ----------------------------
DROP TABLE IF EXISTS `t_currency`;
CREATE TABLE `t_currency` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `symbol` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_currency
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `date` int(10) NOT NULL,
  `userid` bigint(8) unsigned NOT NULL,
  `autoshipid` int(6) unsigned NOT NULL,
  `paymentid` int(6) unsigned NOT NULL,
  `status` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for `t_orderdetails`
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdetails`;
CREATE TABLE `t_orderdetails` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `seq` int(6) unsigned NOT NULL,
  `date` int(10) NOT NULL,
  `productid` int(6) unsigned NOT NULL,
  `itemcode` varchar(20) NOT NULL,
  `price` decimal(6,2) NOT NULL,
  `currencyid` int(6) unsigned NOT NULL,
  `volume` int(11) DEFAULT NULL,
  `volume2` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `price_total` decimal(6,2) NOT NULL,
  `point_total` decimal(6,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_orderdetails
-- ----------------------------

-- ----------------------------
-- Table structure for `t_parameter`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter`;
CREATE TABLE `t_parameter` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `value` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter
-- ----------------------------

-- ----------------------------
-- Table structure for `t_paymentmethod`
-- ----------------------------
DROP TABLE IF EXISTS `t_paymentmethod`;
CREATE TABLE `t_paymentmethod` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `paymentmethodid` int(6) unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` tinyint(1) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_paymentmethod
-- ----------------------------

-- ----------------------------
-- Table structure for `t_product`
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `itemcode` varchar(20) NOT NULL,
  `name` varchar(60) NOT NULL,
  `capsulenumber` int(11) DEFAULT NULL,
  `wholesaleprice` decimal(6,2) NOT NULL,
  `retailprice` decimal(6,2) NOT NULL,
  `date` int(10) unsigned NOT NULL,
  `currencyid` int(6) unsigned NOT NULL,
  `volume` int(11) NOT NULL,
  `volume2` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `categoryid` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------

-- ----------------------------
-- Table structure for `t_province`
-- ----------------------------
DROP TABLE IF EXISTS `t_province`;
CREATE TABLE `t_province` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `countryid` int(6) unsigned NOT NULL,
  `code` varchar(20) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_province
-- ----------------------------

-- ----------------------------
-- Table structure for `t_shippingaddress`
-- ----------------------------
DROP TABLE IF EXISTS `t_shippingaddress`;
CREATE TABLE `t_shippingaddress` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userid` bigint(8) unsigned NOT NULL,
  `address` varchar(60) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) NOT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `companyname` varchar(60) DEFAULT NULL,
  `countryid` int(6) unsigned NOT NULL,
  `province` varchar(30) NOT NULL,
  `city` varchar(30) NOT NULL,
  `zip` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shippingaddress
-- ----------------------------

-- ----------------------------
-- Table structure for `t_shippingmethod`
-- ----------------------------
DROP TABLE IF EXISTS `t_shippingmethod`;
CREATE TABLE `t_shippingmethod` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `volume` decimal(6,2) DEFAULT NULL,
  `fee` decimal(6,2) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shippingmethod
-- ----------------------------

-- ----------------------------
-- Table structure for `t_shoppingcart`
-- ----------------------------
DROP TABLE IF EXISTS `t_shoppingcart`;
CREATE TABLE `t_shoppingcart` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userid` bigint(8) unsigned NOT NULL,
  `date` int(10) NOT NULL,
  `productid` int(6) unsigned NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shoppingcart
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(8) unsigned NOT NULL AUTO_INCREMENT,
  `date` int(10) unsigned NOT NULL,
  `accountid` int(6) unsigned DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `companyname` varchar(60) DEFAULT NULL,
  `companytype` int(6) unsigned DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `sponsorid` bigint(8) unsigned DEFAULT NULL,
  `password` char(32) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `birthday` int(10) DEFAULT NULL,
  `email` varchar(60) NOT NULL,
  `address` varchar(60) DEFAULT NULL,
  `countryid` int(6) unsigned DEFAULT NULL,
  `province` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `zip` varchar(20) DEFAULT NULL,
  `roleid` int(6) unsigned NOT NULL,
  `SSN` varchar(30) DEFAULT NULL,
  `status` int(6) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `p_index_1` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '20150315', '3', '111', '111', null, '0', 'Male', '111', '111', '111', '1111', null, '0', 'gaopleo@gmail.com', '111111', '86', 'QC', '1111', '111', '0', '11', '0');

-- ----------------------------
-- Table structure for `t_userpayment`
-- ----------------------------
DROP TABLE IF EXISTS `t_userpayment`;
CREATE TABLE `t_userpayment` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userid` bigint(8) unsigned NOT NULL,
  `paymentmethodid` int(6) unsigned NOT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `bankid` int(11) unsigned NOT NULL,
  `accountno` varchar(50) DEFAULT NULL,
  `cardno` varchar(50) DEFAULT NULL,
  `csv` varchar(10) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` char(32) DEFAULT NULL,
  `defaultpayment` tinyint(1) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_userpayment
-- ----------------------------
