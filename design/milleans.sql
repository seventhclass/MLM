CREATE DATABASE milleans character set utf8;
use milleans;
/*
Navicat MySQL Data Transfer

Source Server         : mysql(xampp)
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : milleans

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2015-03-07 14:40:54
*/

SET FOREIGN_KEY_CHECKS=0;

#----------------------------
#Table structure for `t_account`
#----------------------------
CREATE TABLE `t_account` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `isautoship` int(6) unsigned NOT NULL DEFAULT '1',
  `annualfee` decimal(6,2) NOT NULL,
  `min_bv` int(11) NOT NULL,
  `cpsn_id` int(6) unsigned NOT NULL DEFAULT '0',
  `promotions` tinyint(1) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_account
#----------------------------

#----------------------------
#Table structure for `t_album`
#----------------------------
CREATE TABLE `t_album` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `productid` int(6) unsigned NOT NULL,
  `imagename` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_album
#----------------------------

#----------------------------
#Table structure for `t_autoship`
#----------------------------
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

#----------------------------
#Records of t_autoship
#----------------------------

#----------------------------
#Table structure for `t_bank`
#----------------------------
CREATE TABLE `t_bank` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_bank
#----------------------------

#----------------------------
#Table structure for `t_category`
#----------------------------
CREATE TABLE `t_category` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_category
#----------------------------

#----------------------------
#Table structure for `t_currency`
#----------------------------
CREATE TABLE `t_currency` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `symbol` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_currency
#----------------------------

#----------------------------
#Table structure for `t_order`
#----------------------------
CREATE TABLE `t_order` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `date` int(10) NOT NULL,
  `userid` bigint(8) unsigned NOT NULL,
  `autoshipid` int(6) unsigned NOT NULL,
  `paymentid` int(6) unsigned NOT NULL,
  `status` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_order
#----------------------------

#----------------------------
#Table structure for `t_orderdetails`
#----------------------------
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

#----------------------------
#Records of t_orderdetails
#----------------------------

#----------------------------
#Table structure for `t_parameter`
#----------------------------
CREATE TABLE `t_parameter` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `value` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_parameter
#----------------------------

#----------------------------
#Table structure for `t_payment`
#----------------------------
CREATE TABLE `t_payment` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userid` bigint(8) unsigned NOT NULL,
  `paymentmethod` int(6) unsigned NOT NULL,
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

#----------------------------
#Records of t_payment
#----------------------------

#----------------------------
#Table structure for `t_porduct`
#----------------------------
CREATE TABLE `t_porduct` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `itemcode` varchar(20) NOT NULL,
  `price` decimal(6,2) NOT NULL,
  `currencyid` int(6) unsigned NOT NULL,
  `volume` int(11) NOT NULL,
  `volume2` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `categoryid` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_porduct
#----------------------------

#----------------------------
#Table structure for `t_shippingaddress`
#----------------------------
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

#----------------------------
#Records of t_shippingaddress
#----------------------------

#----------------------------
#Table structure for `t_shippingmethod`
#----------------------------
CREATE TABLE `t_shippingmethod` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `volume` decimal(6,2) DEFAULT NULL,
  `fee` decimal(6,2) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_shippingmethod
#----------------------------

#----------------------------
#Table structure for `t_shoppingcart`
#----------------------------
CREATE TABLE `t_shoppingcart` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userid` bigint(8) unsigned NOT NULL,
  `date` int(10) NOT NULL,
  `productid` int(6) unsigned NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_shoppingcart
#----------------------------

#----------------------------
#Table structure for `t_user`
#----------------------------
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#----------------------------
#Records of t_user
#----------------------------
