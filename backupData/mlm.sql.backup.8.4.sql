-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 04, 2015 at 03:33 PM
-- Server version: 5.5.41-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mlm`
--
CREATE DATABASE IF NOT EXISTS `mlm` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `mlm`;

-- --------------------------------------------------------

--
-- Table structure for table `t_account`
--

DROP TABLE IF EXISTS `t_account`;
CREATE TABLE IF NOT EXISTS `t_account` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `isautoship` int(6) unsigned NOT NULL DEFAULT '1',
  `annualfee` decimal(6,2) NOT NULL,
  `min_bv` int(11) NOT NULL,
  `cpsn_id` int(6) unsigned NOT NULL DEFAULT '0',
  `promotions` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `t_album`
--

DROP TABLE IF EXISTS `t_album`;
CREATE TABLE IF NOT EXISTS `t_album` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `productid` int(6) unsigned NOT NULL,
  `imagename` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=45 ;

--
-- Dumping data for table `t_album`
--

INSERT INTO `t_album` (`id`, `productid`, `imagename`) VALUES
(9, 3, '1430061933579.jpg'),
(42, 4, '1430073376837.jpg'),
(43, 4, '1430274416499.jpg'),
(44, 5, '1431196408229.png');

-- --------------------------------------------------------

--
-- Table structure for table `t_autoship`
--

DROP TABLE IF EXISTS `t_autoship`;
CREATE TABLE IF NOT EXISTS `t_autoship` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `shipdate` int(10) NOT NULL,
  `userid` int(8) unsigned NOT NULL,
  `addressid` int(6) unsigned NOT NULL,
  `shipmethodid` int(6) unsigned NOT NULL,
  `volume` decimal(6,2) DEFAULT NULL,
  `fee` decimal(6,2) NOT NULL,
  `paymentid` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `t_autoship`
--

INSERT INTO `t_autoship` (`id`, `date`, `shipdate`, `userid`, `addressid`, `shipmethodid`, `volume`, `fee`, `paymentid`) VALUES
(1, '2014-12-28', 0, 7, 0, 0, 0.00, 0.00, 0),
(2, '2014-12-28', 0, 7, 0, 0, 0.00, 0.00, 0),
(3, '2014-12-28', 0, 7, 0, 0, 0.00, 0.00, 0),
(5, '2014-12-28', 0, 15, 0, 0, 0.00, 0.00, 0),
(6, '2015-07-29', 0, 7, 0, 0, 0.00, 0.00, 0),
(7, '2015-08-04', 0, 20, 0, 0, 0.00, 0.00, 0);

-- --------------------------------------------------------

--
-- Table structure for table `t_bank`
--

DROP TABLE IF EXISTS `t_bank`;
CREATE TABLE IF NOT EXISTS `t_bank` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `t_category`
--

DROP TABLE IF EXISTS `t_category`;
CREATE TABLE IF NOT EXISTS `t_category` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `t_category`
--

INSERT INTO `t_category` (`id`, `name`) VALUES
(1, 'Anti-Aging'),
(2, 'Life Extension'),
(11, 'Brain Health'),
(12, 'Energy & Performance'),
(13, 'Wealth Creation');

-- --------------------------------------------------------

--
-- Table structure for table `t_country`
--

DROP TABLE IF EXISTS `t_country`;
CREATE TABLE IF NOT EXISTS `t_country` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `t_currency`
--

DROP TABLE IF EXISTS `t_currency`;
CREATE TABLE IF NOT EXISTS `t_currency` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `symbol` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `t_currency`
--

INSERT INTO `t_currency` (`id`, `name`, `symbol`) VALUES
(2, 'Canada Dollar', 'CA'),
(3, 'United State', 'US'),
(4, 'Euro', 'EU'),
(5, 'Chinese Mainland Yuan', 'RMB');

-- --------------------------------------------------------

--
-- Table structure for table `t_order`
--

DROP TABLE IF EXISTS `t_order`;
CREATE TABLE IF NOT EXISTS `t_order` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `autoshipid` int(6) unsigned NOT NULL,
  `paymentid` int(6) unsigned NOT NULL,
  `status` int(6) unsigned NOT NULL,
  `userid` bigint(8) unsigned NOT NULL,
  `orderIdl` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderIdl_UNIQUE` (`orderIdl`),
  KEY `fk_t_order_t_user1_idx` (`userid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=44 ;

--
-- Dumping data for table `t_order`
--

INSERT INTO `t_order` (`id`, `date`, `autoshipid`, `paymentid`, `status`, `userid`, `orderIdl`) VALUES
(6, '2015-07-10', 0, 0, 1, 7, '1436567388494'),
(7, '2015-07-10', 0, 0, 1, 7, '1436582967581'),
(8, '2015-07-10', 0, 0, 1, 7, '1436583317750'),
(9, '2015-07-10', 0, 0, 1, 7, '1436583400867'),
(10, '2015-07-10', 0, 0, 1, 7, '1436583480840'),
(11, '2015-07-10', 0, 0, 1, 7, '1436583547124'),
(15, '2015-07-10', 0, 0, 1, 7, '1436585494745'),
(16, '2015-07-12', 0, 0, 1, 7, '1436728041529'),
(17, '2015-07-12', 0, 0, 1, 7, '1436737271176'),
(18, '2015-07-12', 0, 0, 1, 7, '1436737851879'),
(19, '2015-07-14', 0, 0, 1, 9, '1436888106619'),
(20, '2015-07-14', 0, 0, 1, 9, '1436900946390'),
(21, '2015-07-14', 0, 0, 1, 12, '1436911798398'),
(22, '2015-07-14', 0, 0, 1, 12, '1436911823693'),
(23, '2015-07-29', 0, 0, 1, 7, '1438177840045'),
(24, '2015-07-29', 0, 0, 1, 7, '1438178365393'),
(25, '2015-07-29', 0, 0, 1, 7, '1438179639274'),
(26, '2015-07-29', 0, 0, 1, 7, '1438180998935'),
(33, '2015-07-29', 0, 0, 1, 15, '1438185631560'),
(34, '2015-07-29', 0, 0, 1, 15, '1438185865306'),
(35, '2015-07-29', 0, 0, 1, 15, '1438188027147'),
(36, '2015-07-29', 0, 0, 1, 15, '1438192320758'),
(42, '2015-08-02', 0, 0, 1, 16, '1438518800128');

-- --------------------------------------------------------

--
-- Table structure for table `t_orderdetails`
--

DROP TABLE IF EXISTS `t_orderdetails`;
CREATE TABLE IF NOT EXISTS `t_orderdetails` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `seq` int(6) unsigned NOT NULL,
  `createddate` date NOT NULL,
  `productid` int(6) unsigned NOT NULL,
  `itemcode` varchar(20) NOT NULL,
  `transactionprice` decimal(6,2) unsigned NOT NULL DEFAULT '0.00',
  `volume` int(11) DEFAULT NULL,
  `volume2` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `price_total` decimal(6,2) NOT NULL,
  `point_total` decimal(6,2) NOT NULL,
  `userid` bigint(8) unsigned NOT NULL,
  `orderIdl` varchar(45) NOT NULL,
  `t_currency_id` int(6) unsigned NOT NULL,
  `t_paymentmethod_id` int(6) unsigned NOT NULL,
  `endedate` date NOT NULL,
  `status` int(11) NOT NULL,
  `autoship_id` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`,`autoship_id`),
  KEY `fk_t_orderdetails_t_user1_idx` (`userid`),
  KEY `fk_t_orderdetails_t_product1_idx` (`productid`),
  KEY `fk_t_orderdetails_t_currency1_idx` (`t_currency_id`),
  KEY `fk_t_orderdetails_t_paymentmethod1_idx` (`t_paymentmethod_id`),
  KEY `fk_t_orderdetails_t_autoship1_idx` (`autoship_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `t_orderdetails`
--

INSERT INTO `t_orderdetails` (`id`, `seq`, `createddate`, `productid`, `itemcode`, `transactionprice`, `volume`, `volume2`, `description`, `quantity`, `price_total`, `point_total`, `userid`, `orderIdl`, `t_currency_id`, `t_paymentmethod_id`, `endedate`, `status`, `autoship_id`) VALUES
(1, 0, '2015-07-29', 4, 'A000000002', 0.00, 40, 0, '', 1, 41.00, 40.00, 7, '1438196842988', 2, 1, '2015-07-29', 1, 1),
(2, 0, '2015-07-29', 3, 'A000000001', 0.00, 40, 0, 'The first product!!!!!', 1, 99.00, 40.00, 7, '1438197051054', 2, 1, '2015-07-29', 1, 2),
(3, 0, '2015-07-29', 4, 'A000000002', 0.00, 40, 0, '', 1, 41.00, 40.00, 7, '1438197744145', 2, 1, '2015-07-29', 1, 3),
(5, 0, '2015-07-29', 4, 'A000000002', 0.00, 40, 0, '', 1, 41.00, 40.00, 15, '1438198210002', 2, 1, '2015-07-29', 1, 5),
(6, 0, '2015-07-29', 4, 'A000000002', 0.00, 40, 0, '', 1, 41.00, 40.00, 7, '1438198825604', 2, 1, '2015-07-29', 1, 6),
(7, 0, '2015-08-03', 3, 'A000000001', 0.00, 40, 0, 'The first product!!!!!', 1, 99.00, 40.00, 20, '1438656913452', 2, 1, '2015-08-03', 1, 7);

-- --------------------------------------------------------

--
-- Table structure for table `t_order_has_t_product`
--

DROP TABLE IF EXISTS `t_order_has_t_product`;
CREATE TABLE IF NOT EXISTS `t_order_has_t_product` (
  `t_order_id` int(6) unsigned NOT NULL,
  `t_product_id` int(6) unsigned NOT NULL,
  `quantity` int(11) NOT NULL,
  `transactionprice` decimal(6,2) unsigned NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`t_order_id`,`t_product_id`),
  KEY `fk_t_order_has_t_product_t_product1_idx` (`t_product_id`),
  KEY `fk_t_order_has_t_product_t_order_idx` (`t_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_order_has_t_product`
--

INSERT INTO `t_order_has_t_product` (`t_order_id`, `t_product_id`, `quantity`, `transactionprice`) VALUES
(6, 3, 3, 0.00),
(6, 4, 3, 0.00),
(6, 5, 4, 0.00),
(7, 3, 3, 0.00),
(7, 4, 3, 0.00),
(7, 5, 4, 0.00),
(8, 3, 3, 0.00),
(8, 4, 3, 0.00),
(8, 5, 4, 0.00),
(9, 3, 3, 0.00),
(9, 4, 3, 0.00),
(9, 5, 4, 0.00),
(10, 3, 3, 0.00),
(10, 4, 3, 0.00),
(10, 5, 4, 0.00),
(11, 3, 3, 0.00),
(11, 4, 3, 0.00),
(11, 5, 4, 0.00),
(15, 3, 3, 0.00),
(15, 4, 3, 0.00),
(15, 5, 4, 0.00),
(19, 3, 2, 0.00),
(19, 4, 1, 0.00),
(20, 3, 1, 0.00),
(20, 4, 1, 0.00),
(22, 3, 1, 0.00),
(22, 5, 1, 0.00),
(23, 3, 1, 0.00),
(24, 3, 1, 0.00),
(25, 3, 1, 0.00),
(26, 3, 1, 0.00),
(33, 3, 1, 0.00),
(34, 5, 1, 0.00),
(35, 4, 1, 0.00),
(36, 3, 1, 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `t_parameter`
--

DROP TABLE IF EXISTS `t_parameter`;
CREATE TABLE IF NOT EXISTS `t_parameter` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `value` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `t_parameter`
--

INSERT INTO `t_parameter` (`id`, `name`, `value`, `description`) VALUES
(1, 'TPS', '0.05', 'T.P.S'),
(2, 'TVQ', '0.09975', 'TVQ');

-- --------------------------------------------------------

--
-- Table structure for table `t_paymentmethod`
--

DROP TABLE IF EXISTS `t_paymentmethod`;
CREATE TABLE IF NOT EXISTS `t_paymentmethod` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `t_paymentmethod`
--

INSERT INTO `t_paymentmethod` (`id`, `name`, `description`) VALUES
(1, 'cheque', 'cheque');

-- --------------------------------------------------------

--
-- Table structure for table `t_product`
--

DROP TABLE IF EXISTS `t_product`;
CREATE TABLE IF NOT EXISTS `t_product` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `itemcode` varchar(20) NOT NULL,
  `name` varchar(60) NOT NULL,
  `capsulenumber` int(11) DEFAULT NULL,
  `wholesaleprice` decimal(6,2) NOT NULL,
  `retailprice` decimal(6,2) NOT NULL,
  `date` date NOT NULL,
  `currencyid` int(6) unsigned NOT NULL,
  `volume` int(11) NOT NULL,
  `volume2` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `categoryid` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `t_product`
--

INSERT INTO `t_product` (`id`, `itemcode`, `name`, `capsulenumber`, `wholesaleprice`, `retailprice`, `date`, `currencyid`, `volume`, `volume2`, `description`, `categoryid`) VALUES
(3, 'A000000001', 'MT-1000', 90, 58.00, 99.00, '2015-04-18', 2, 40, 0, 'The first product!!!!!', 1),
(4, 'A000000002', 'MT-1000B', 25, 31.00, 41.00, '2015-04-18', 2, 40, 0, '', 2),
(5, 'A000000003', 'Rejwvienator', 30, 62.00, 82.00, '2015-04-18', 2, 40, 0, '', 11);

-- --------------------------------------------------------

--
-- Table structure for table `t_province`
--

DROP TABLE IF EXISTS `t_province`;
CREATE TABLE IF NOT EXISTS `t_province` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `countryid` int(6) unsigned NOT NULL,
  `code` varchar(20) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `t_shippingaddress`
--

DROP TABLE IF EXISTS `t_shippingaddress`;
CREATE TABLE IF NOT EXISTS `t_shippingaddress` (
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `t_shippingmethod`
--

DROP TABLE IF EXISTS `t_shippingmethod`;
CREATE TABLE IF NOT EXISTS `t_shippingmethod` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `volume` decimal(6,2) DEFAULT NULL,
  `fee` decimal(6,2) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `t_shoppingcart`
--

DROP TABLE IF EXISTS `t_shoppingcart`;
CREATE TABLE IF NOT EXISTS `t_shoppingcart` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userid` int(8) NOT NULL,
  `date` date NOT NULL,
  `productid` int(6) unsigned NOT NULL,
  `quantity` int(11) NOT NULL,
  `transactionprice` decimal(6,2) unsigned NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=47 ;

--
-- Dumping data for table `t_shoppingcart`
--

INSERT INTO `t_shoppingcart` (`id`, `userid`, `date`, `productid`, `quantity`, `transactionprice`) VALUES
(1, 1, '2015-04-26', 3, 1, 99.00),
(3, 3, '2015-05-02', 3, 1, 99.00),
(5, 3, '2015-05-02', 5, 1, 82.00),
(6, 3, '2015-05-02', 4, 3, 41.00),
(18, 8, '2015-05-13', 5, 2, 0.00),
(22, 11, '2015-06-24', 3, 3, 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` bigint(8) unsigned NOT NULL AUTO_INCREMENT,
  `userId` varchar(30) NOT NULL,
  `regitsdate` date NOT NULL,
  `accountid` int(6) unsigned DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `companyname` varchar(60) DEFAULT NULL,
  `companytype` int(6) unsigned DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `sponsorid` varchar(30) DEFAULT NULL,
  `password` char(128) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(60) NOT NULL,
  `address` varchar(60) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `province` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `zip` varchar(20) DEFAULT NULL,
  `roleid` int(6) unsigned NOT NULL,
  `SSN` varchar(30) DEFAULT NULL,
  `status` int(6) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` (`id`, `userId`, `regitsdate`, `accountid`, `firstname`, `lastname`, `companyname`, `companytype`, `gender`, `sponsorid`, `password`, `mobile`, `phone`, `fax`, `birthday`, `email`, `address`, `country`, `province`, `city`, `zip`, `roleid`, `SSN`, `status`) VALUES
(1, '1430073874041', '2015-04-26', 1, 'Le', 'Hu', NULL, 0, 'Male', '1', '111', '5148850513', '5148850513', NULL, NULL, 'hu.le.ca@gmail.com', 'Queen Mary', '86', 'QC', 'Montreal', 'H3W 1X2', 0, '', 0),
(2, 'abc111', '2015-04-30', 0, 'Hu', 'le', '7th company', 1, 'M', '1111', '111111', '4385570123', '5148851234', '5148850513', '2008-12-28', 'hu.le.ca@gmail.com', '5004 QueenMary', '86', 'QC', 'Montreal', 'h3w 1x2', 77, NULL, 1),
(3, '1430581048496', '2015-05-02', 2, 'Leo', 'Gao', NULL, 0, 'Male', '1', '123456', '5148888888', '', NULL, NULL, 'leo@qq.com', '', '86', 'QC', '', '', 0, '', 0),
(4, '1430593665356', '2015-05-02', 2, 'DANI', 'CHIDIAC', NULL, 0, 'Male', '123456', '$2a$10$/6.Ua2v80qZrDlstsUoEV.FxAh9wrIt1/PPxNgS716cpdyQbuuPq.', '5146383315', '5146383315', NULL, '2014-12-28', 'gaopleo@gmail.com', '301 BOUL DEGUIRE', '86', 'QC', 'SAINT LAURENT', 'H4N1P8', 0, '12134324363', 0),
(5, '1430598802266', '2015-05-02', 1, 'DANI', 'CHIDIAC', NULL, 0, 'Male', '1111', '$2a$10$5qzRECw7KN2riqABSnATXuHlszjP6d/3.LM67IHRckb1tlaCdILti', '5146383315', '5146383315', NULL, NULL, 'gaopleo@gmail.com', '301 BOUL DEGUIRE', '86', 'QC', 'SAINT LAURENT', 'H4N1P8', 0, '', 0),
(6, '1430598950050', '2015-05-02', 4, NULL, NULL, '7thclass', 2, NULL, '12345', '$2a$10$UsmBBsITBv9s0PwGjAH7juaPRwY7yY5rF7qtkyiSt0NQfG.imyqG6', '5146383315', '5146383315', NULL, NULL, 'gaopleo@gmail.com', '301 BOUL DEGUIRE', '86', 'QC', 'SAINT LAURENT', 'H4N1P8', 0, NULL, 0),
(7, '1430599049710', '2015-05-02', 3, 'admin', 'Li', NULL, 0, 'Male', NULL, '$2a$10$0OH1Zf0bIqUJUu.BlKkMOOPUCZmyWL9PFMJlnSzOsnILrHtA6O2rS', '5146383315', '5146383315', NULL, '2014-12-28', 'gaopleo@gmail.com', '301 BOUL DEGUIRE', '86', 'QC', 'SAINT LAURENT', 'H4N1P8', 0, NULL, 0),
(8, '1431573608104', '2015-05-13', 2, '111', '222', NULL, 0, 'Male', '111', '$2a$10$g7d8IbVNDo4XhuMjR8/EKesdQXQQhM44ZRwxr8TZG1LqQcrI8CT.G', '111', '', NULL, '2014-12-28', '111', '', '86', 'QC', '', '', 0, '', 0),
(9, '1431726691537', '2015-05-15', 1, 'pan', 'weihong', NULL, 0, 'Female', NULL, '$2a$10$R356fKID.HEwTIjtK4Atwe1Y7f7/NmNq0Uu.EDH0rab0lh7yUf2PC', '1234567890', '', NULL, '2010-12-26', '4051172@qq.com', '', '86', 'QC', '', '', 0, NULL, 0),
(10, '1432088328818', '2015-05-19', 2, 'DANI', 'CHIDIAC', NULL, 0, 'Male', NULL, '$2a$10$x/49jfUH5jFN.6Nlkyo70.ObeWlY0/ypNRPpx1qUvRBx2a90dxyGS', '5146383315', '5146383315', NULL, NULL, 'rtt', '301 BOUL DEGUIRE', '86', 'QC', 'SAINT LAURENT', 'H4N1P8', 0, NULL, 0),
(11, '1435189715452', '2015-06-24', 3, 'test', 'test', NULL, 0, 'Male', '123456', '$2a$10$Muv/KYZXtl3MvyAC8uduuuk1vnev6lUcyAZ4SbeTutFqz4pmn8m8a', '5148888888', '', NULL, '2014-12-28', '132243@gmail.com', '', '86', 'QC', '', '', 0, '', 0),
(12, '1436908730270', '2015-07-14', 2, 'admin1', 'admin1', NULL, 0, 'Male', NULL, '$2a$10$LLFZrr21KxyvwNzBaWUJL.0rt.6zN3euJlma1kExzT9uQv3MFhwW2', '5140000000', '', NULL, NULL, 'admin1@mlm.com', 'psd:admin1', '86', 'QC', '', '', 0, NULL, 0),
(13, 'abc111', '2015-07-14', 0, 'Hu', 'le', '7th company', 1, 'M', '1111', '111111', '4385570123', '5148851234', '5148850513', '2008-12-28', 'hu.le.ca@gmail.com', '5004 QueenMary', 'china', 'QC', 'Montreal', 'h3w 1x2', 77, NULL, 1),
(14, 'abc111', '2015-07-14', 0, 'Hu', 'le', '7th company', 1, 'M', '1111', '111111', '4385570123', '5148851234', '5148850513', '2008-12-28', 'hu.le.ca@gmail.com', '5004 QueenMary', 'china', 'QC', 'Montreal', 'h3w 1x2', 77, NULL, 1),
(15, 'MV1507210-9878', '2015-07-29', 1, 'zzz', '111', NULL, 0, 'Male', '1', '$2a$10$99i12IcAD4SCxoFlVJlhR.4bFVDCIbIQR0tDi9bz/0uWdyYRGryjW', '14', '5148850513', NULL, NULL, 'hu.le.ca@gmail.com', 'Boulevard', '86', 'QC', 'Montreal', 'H4A2A9', 0, '', 0),
(16, 'MV1508214-3823', '2015-08-02', 2, 'margaret', 'j', NULL, 0, 'Female', NULL, '$2a$10$s/1zdVMeVCVi1jAf7O1q.OeoQSV9W7Yzzk2PvN2V1cZdw3GUKEloG', '5145505222', '', NULL, NULL, 'milleansvie@gmail.com', '', '86', 'QC', '', '', 0, NULL, 0),
(17, '1438648941085', '2015-08-03', 1, 'Ming', 'Jian', NULL, 0, 'Male', '12121', '$2a$10$VcUBIeYgR2C64bDHrKcvxebhYwuyezVjnUfuDgN/xTaqJofwgO4Da', '5145505222', '5145505222', NULL, NULL, 'mingj228@hotmail.ca', '301-4851 cote-st-luc', '86', 'QC', 'MONTREAL', 'h3w 2h6', 0, '', 0),
(18, 'MV1508215-3565', '2015-08-03', 0, 'Test', 'TT', NULL, 0, 'Male', NULL, '$2a$10$ZOCwjH1zZGtY1BVg26xCKutFjEU7BcKDbAfqA1JIpfHR8m1PeGVBu', '5145505222', '', NULL, '2015-08-01', 'test@gmail.com', '', '86', 'QC', '', '', 0, NULL, 0),
(19, 'MV1508215-4558', '2015-08-03', 0, 'zzz', '111', NULL, 0, 'Male', NULL, '$2a$10$wQSoTMHBLUC8lS1fYNcIyujjz9xywAc4RLI/JVJwMQ6IjujEIe/Ga', '1324', '5148850513', NULL, '2015-08-02', 'le.hu@outlook.com', '7695 Avenue Papineau', '86', 'QC', 'Montreal', 'H2E2H1', 1, NULL, 0),
(20, 'MV1508215-8723', '2015-08-03', 0, 'Test1', 'TT', NULL, 0, 'Male', NULL, '$2a$10$MF3dk/JMikT58.kBIr/BgucObpekPKbPDZcBztNahSzf3Xh4aStWW', '5146383315', '5146383315', NULL, NULL, 'test@gmail.com', '301 BOUL DEGUIRE', '86', 'QC', 'SAINT LAURENT', 'H4N1P8', 1, NULL, 0),
(21, 'MV1508215-8356', '2015-08-03', 1, 'Test', 'TT', NULL, 0, 'Male', '12345', '$2a$10$wdXQJ/2fjvI3VpFvSEhYHOx1basaAXTAG52rakt.yTQ5ruL3OfK4u', '5145611111', '', NULL, NULL, 'test@gmail.com', '', '86', 'QC', '', '', 0, '', 0),
(22, 'MV1508216-6633', '2015-08-04', 0, 'test', 'zzz', NULL, 0, 'Male', NULL, '$2a$10$yTPvU2UIPcNd83HrNTdS3.Ej6bLUYYZQ8AcFRvhJtWkoM4MugTdg6', '1234', '5148850513', NULL, NULL, 'hu.le.ca@gmail.com', 'Boulevard', '86', 'QC', 'Montreal', 'H4A2A9', 1, NULL, 0),
(23, 'MV1508216-2026', '2015-08-04', 0, '111', '222', NULL, 0, 'Male', NULL, '$2a$10$sYhxdFz7c0CbixbbFuf7du0BQd6tcx8TgMGqzQmNWCK9IdXvV/lyq', '5148850513', '5148850513', NULL, '2015-08-02', 'hu.le.ca@gmail.com', 'Boulevard', '86', 'QC', 'Montreal', 'H4A2A9', 1, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `t_userpayment`
--

DROP TABLE IF EXISTS `t_userpayment`;
CREATE TABLE IF NOT EXISTS `t_userpayment` (
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_order`
--
ALTER TABLE `t_order`
  ADD CONSTRAINT `fk_t_order_t_user1` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `t_orderdetails`
--
ALTER TABLE `t_orderdetails`
  ADD CONSTRAINT `fk_t_orderdetails_t_user1` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_t_orderdetails_t_product1` FOREIGN KEY (`productid`) REFERENCES `t_product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_t_orderdetails_t_currency1` FOREIGN KEY (`t_currency_id`) REFERENCES `t_currency` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_t_orderdetails_t_paymentmethod1` FOREIGN KEY (`t_paymentmethod_id`) REFERENCES `t_paymentmethod` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_t_orderdetails_t_autoship1` FOREIGN KEY (`autoship_id`) REFERENCES `t_autoship` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `t_order_has_t_product`
--
ALTER TABLE `t_order_has_t_product`
  ADD CONSTRAINT `fk_t_order_has_t_product_t_order` FOREIGN KEY (`t_order_id`) REFERENCES `t_order` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_t_order_has_t_product_t_product1` FOREIGN KEY (`t_product_id`) REFERENCES `t_product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
