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

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for `t_account`
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id`          INT(6) UNSIGNED     NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(60)         NOT NULL,
  `isautoship`  INT(6) UNSIGNED     NOT NULL DEFAULT '1',
  `annualfee`   DECIMAL(6, 2)       NOT NULL,
  `min_bv`      INT(11)             NOT NULL,
  `cpsn_id`     INT(6) UNSIGNED     NOT NULL DEFAULT '0',
  `promotions`  TINYINT(1) UNSIGNED NOT NULL DEFAULT '1',
  `description` VARCHAR(255)                 DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_account
-- ----------------------------

-- ----------------------------
-- Table structure for `t_album`
-- ----------------------------
DROP TABLE IF EXISTS `t_album`;
CREATE TABLE `t_album` (
  `id`        INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `productid` INT(6) UNSIGNED NOT NULL,
  `imagename` VARCHAR(50)              DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_album
-- ----------------------------

-- ----------------------------
-- Table structure for `t_autoship`
-- ----------------------------
DROP TABLE IF EXISTS `t_autoship`;
CREATE TABLE `t_autoship` (
  `id`           INT(6) UNSIGNED    NOT NULL AUTO_INCREMENT,
  `date`         DATE            NOT NULL,
  `shipdate`     INT(10)            NOT NULL,
  `userid`       INT(8) UNSIGNED NOT NULL,
  `addressid`    INT(6) UNSIGNED    NOT NULL,
  `shipmethodid` INT(6) UNSIGNED    NOT NULL,
  `volume`       DECIMAL(6, 2)               DEFAULT NULL,
  `fee`          DECIMAL(6, 2)      NOT NULL,
  `paymentid`    INT(6) UNSIGNED    NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_autoship
-- ----------------------------

-- ----------------------------
-- Table structure for `t_bank`
-- ----------------------------
DROP TABLE IF EXISTS `t_bank`;
CREATE TABLE `t_bank` (
  `id`          INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(60)     NOT NULL,
  `description` VARCHAR(100)             DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_bank
-- ----------------------------

-- ----------------------------
-- Table structure for `t_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `id`   INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50)     NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_category
-- ----------------------------

-- ----------------------------
-- Table structure for `t_country`
-- ----------------------------
DROP TABLE IF EXISTS `t_country`;
CREATE TABLE `t_country` (
  `id`   INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(20)     NOT NULL,
  `name` VARCHAR(100)    NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_country
-- ----------------------------

-- ----------------------------
-- Table structure for `t_currency`
-- ----------------------------
DROP TABLE IF EXISTS `t_currency`;
CREATE TABLE `t_currency` (
  `id`     INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`   VARCHAR(60)     NOT NULL,
  `symbol` VARCHAR(20)     NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_currency
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id`         INT(6) UNSIGNED    NOT NULL AUTO_INCREMENT,
  `date`       DATE            NOT NULL,
  `userid`     BIGINT(8) UNSIGNED NOT NULL,
  `autoshipid` INT(6) UNSIGNED    NOT NULL,
  `paymentid`  INT(6) UNSIGNED    NOT NULL,
  `status`     INT(6) UNSIGNED    NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for `t_orderdetails`
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdetails`;
CREATE TABLE `t_orderdetails` (
  `id`          INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `seq`         INT(6) UNSIGNED NOT NULL,
  `date`        DATE         NOT NULL,
  `productid`   INT(6) UNSIGNED NOT NULL,
  `itemcode`    VARCHAR(20)     NOT NULL,
  `price`       DECIMAL(6, 2)   NOT NULL,
  `currencyid`  INT(6) UNSIGNED NOT NULL,
  `volume`      INT(11)                  DEFAULT NULL,
  `volume2`     INT(11)                  DEFAULT NULL,
  `description` VARCHAR(255)             DEFAULT NULL,
  `quantity`    INT(11)         NOT NULL,
  `price_total` DECIMAL(6, 2)   NOT NULL,
  `point_total` DECIMAL(6, 2)   NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_orderdetails
-- ----------------------------

-- ----------------------------
-- Table structure for `t_parameter`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter`;
CREATE TABLE `t_parameter` (
  `id`          INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(60)     NOT NULL,
  `value`       VARCHAR(100)    NOT NULL,
  `description` VARCHAR(200)             DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_parameter
-- ----------------------------

-- ----------------------------
-- Table structure for `t_paymentmethod`
-- ----------------------------
DROP TABLE IF EXISTS `t_paymentmethod`;
CREATE TABLE `t_paymentmethod` (
  `id`              INT(6) UNSIGNED     NOT NULL AUTO_INCREMENT,
  `paymentmethodid` INT(6) UNSIGNED     NOT NULL,
  `name`            VARCHAR(100)                 DEFAULT NULL,
  `description`     VARCHAR(255)                 DEFAULT NULL,
  `status`          TINYINT(1) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_paymentmethod
-- ----------------------------

-- ----------------------------
-- Table structure for `t_product`
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id`             INT(6) UNSIGNED  NOT NULL AUTO_INCREMENT,
  `itemcode`       VARCHAR(20)      NOT NULL,
  `name`           VARCHAR(60)      NOT NULL,
  `capsulenumber`  INT(11)                   DEFAULT NULL,
  `wholesaleprice` DECIMAL(6, 2)    NOT NULL,
  `retailprice`    DECIMAL(6, 2)    NOT NULL,
  `date`           DATE NOT NULL,
  `currencyid`     INT(6) UNSIGNED  NOT NULL,
  `volume`         INT(11)          NOT NULL,
  `volume2`        INT(11)                   DEFAULT NULL,
  `description`    VARCHAR(255),
  `categoryid`     INT(6) UNSIGNED  NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------

-- ----------------------------
-- Table structure for `t_province`
-- ----------------------------
DROP TABLE IF EXISTS `t_province`;
CREATE TABLE `t_province` (
  `id`        INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `countryid` INT(6) UNSIGNED NOT NULL,
  `code`      VARCHAR(20)              DEFAULT NULL,
  `name`      VARCHAR(100)             DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_province
-- ----------------------------

-- ----------------------------
-- Table structure for `t_shippingaddress`
-- ----------------------------
DROP TABLE IF EXISTS `t_shippingaddress`;
CREATE TABLE `t_shippingaddress` (
  `id`          INT(6) UNSIGNED    NOT NULL AUTO_INCREMENT,
  `userid`      BIGINT(8) UNSIGNED NOT NULL,
  `address`     VARCHAR(60)        NOT NULL,
  `phone`       VARCHAR(20)                 DEFAULT NULL,
  `mobile`      VARCHAR(20)        NOT NULL,
  `firstname`   VARCHAR(30)                 DEFAULT NULL,
  `lastname`    VARCHAR(30)                 DEFAULT NULL,
  `companyname` VARCHAR(60)                 DEFAULT NULL,
  `countryid`   INT(6) UNSIGNED    NOT NULL,
  `province`    VARCHAR(30)        NOT NULL,
  `city`        VARCHAR(30)        NOT NULL,
  `zip`         VARCHAR(20)        NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_shippingaddress
-- ----------------------------

-- ----------------------------
-- Table structure for `t_shippingmethod`
-- ----------------------------
DROP TABLE IF EXISTS `t_shippingmethod`;
CREATE TABLE `t_shippingmethod` (
  `id`          INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(60)     NOT NULL,
  `volume`      DECIMAL(6, 2)            DEFAULT NULL,
  `fee`         DECIMAL(6, 2)   NOT NULL,
  `description` VARCHAR(100)             DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_shippingmethod
-- ----------------------------

-- ----------------------------
-- Table structure for `t_shoppingcart`
-- ----------------------------
DROP TABLE IF EXISTS `t_shoppingcart`;
CREATE TABLE `t_shoppingcart` (
  `id`        INT(6) UNSIGNED    NOT NULL AUTO_INCREMENT,
  `userid`    BIGINT(8) UNSIGNED NOT NULL,
  `date`      DATE            NOT NULL,
  `productid` INT(6) UNSIGNED    NOT NULL,
  `quantity`  INT(11)            NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` BIGINT(8) UNSIGNED NOT NULL AUTO_INCREMENT,
  'userId' VARCHAR(30) NOT NULL,
  `date` DATE NOT NULL,
  `accountid` INT(6) UNSIGNED DEFAULT NULL,
  `firstname` VARCHAR(30) DEFAULT NULL,
  `lastname` VARCHAR(30) DEFAULT NULL,
  `companyname` VARCHAR(60) DEFAULT NULL,
  `companytype` INT(6) UNSIGNED DEFAULT NULL,
  `gender` VARCHAR(10) DEFAULT NULL,
  `sponsorid` VARCHAR(30) DEFAULT NULL,
  `password` CHAR(32) NOT NULL,
  `mobile` VARCHAR(20) NOT NULL,
  `phone` VARCHAR(20) DEFAULT NULL,
  `fax` VARCHAR(20) DEFAULT NULL,
  `birthday` DATE DEFAULT NULL,
  `email` VARCHAR(60) NOT NULL,
  `address` VARCHAR(60) DEFAULT NULL,
  `countryid` INT(6) UNSIGNED DEFAULT NULL,
  `province` VARCHAR(30) DEFAULT NULL,
  `city` VARCHAR(30) DEFAULT NULL,
  `zip` VARCHAR(20) DEFAULT NULL,
  `roleid` INT(6) UNSIGNED NOT NULL,
  `SSN` VARCHAR(30) DEFAULT NULL,
  `status` INT(6) UNSIGNED NOT NULL DEFAULT '0',
  PRIMARY KEY (`userId`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;
-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for `t_userpayment`
-- ----------------------------
DROP TABLE IF EXISTS `t_userpayment`;
CREATE TABLE `t_userpayment` (
  `id`              INT(6) UNSIGNED     NOT NULL AUTO_INCREMENT,
  `userid`          BIGINT(8) UNSIGNED  NOT NULL,
  `paymentmethodid` INT(6) UNSIGNED     NOT NULL,
  `firstname`       VARCHAR(30)                  DEFAULT NULL,
  `lastname`        VARCHAR(30)                  DEFAULT NULL,
  `bankid`          INT(11) UNSIGNED    NOT NULL,
  `accountno`       VARCHAR(50)                  DEFAULT NULL,
  `cardno`          VARCHAR(50)                  DEFAULT NULL,
  `csv`             VARCHAR(10)                  DEFAULT NULL,
  `username`        VARCHAR(50)                  DEFAULT NULL,
  `password`        CHAR(32)                     DEFAULT NULL,
  `defaultpayment`  TINYINT(1) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of t_userpayment
-- ----------------------------
