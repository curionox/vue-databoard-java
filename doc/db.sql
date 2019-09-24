/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.27 : Database - bi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bi` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `bi`;



DROP TABLE IF EXISTS `bi_chart`;

CREATE TABLE `bi_chart` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `updated_time` DATETIME DEFAULT NULL,
  `creator` VARCHAR(20) DEFAULT NULL,
  `desc` VARCHAR(20) DEFAULT NULL,
  `ACL` VARCHAR(20) DEFAULT NULL,
  `content` TEXT,
  `object_id` VARCHAR(20) DEFAULT NULL,
  `chart_name` VARCHAR(20) DEFAULT NULL,
  `created_time` DATETIME DEFAULT NULL,
  `status` json DEFAULT NULL,
  `is_private` VARCHAR(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

/*Table structure for table `bi_chart_dash_info` */

DROP TABLE IF EXISTS `bi_chart_dash_info`;

CREATE TABLE `bi_chart_dash_info` (
  `_id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `objectId` VARCHAR(20) DEFAULT NULL,
  `ACL` json DEFAULT NULL,
  `createdAt` DATETIME DEFAULT NULL,
  `updatedAt` DATETIME DEFAULT NULL,
  `dashboard` VARCHAR(20) DEFAULT NULL,
  `chart` VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (`_id`)
) ENGINE=INNODB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

/*Table structure for table `bi_dashboard` */

DROP TABLE IF EXISTS `bi_dashboard`;

CREATE TABLE `bi_dashboard` (
  `_id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `updatedAt` DATETIME DEFAULT NULL,
  `creator` VARCHAR(20) DEFAULT NULL,
  `desc` VARCHAR(20) DEFAULT NULL,
  `ACL` json DEFAULT NULL,
  `content` TEXT,
  `name` VARCHAR(20) DEFAULT NULL,
  `objectId` VARCHAR(12) DEFAULT NULL,
  `createdAt` DATETIME DEFAULT NULL,
  `status` INT(1) DEFAULT NULL,
  `isPrivate` VARCHAR(1) DEFAULT NULL,
  PRIMARY KEY (`_id`)
) ENGINE=INNODB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

/*Table structure for table `bi_order` */

DROP TABLE IF EXISTS `bi_order`;

CREATE TABLE `bi_order` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `objectId` VARCHAR(20) DEFAULT NULL,
  `ACL` json DEFAULT NULL,
  `createdAt` DATETIME DEFAULT NULL,
  `updatedAt` DATETIME DEFAULT NULL,
  `userId` VARCHAR(20) DEFAULT NULL,
  `order` TEXT,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Table structure for table `bi_user` */

DROP TABLE IF EXISTS `bi_user`;

CREATE TABLE `bi_user` (
  `_id` VARBINARY(12) NOT NULL,
  `salt` json DEFAULT NULL,
  `email` json DEFAULT NULL,
  `sessionToken` json DEFAULT NULL,
  `updatedAt` json DEFAULT NULL,
  `ACL` json DEFAULT NULL,
  `password` json DEFAULT NULL,
  `objectId` json DEFAULT NULL,
  `signature` json DEFAULT NULL,
  `city` json DEFAULT NULL,
  `username` json DEFAULT NULL,
  `errMsg` json DEFAULT NULL,
  `createdAt` json DEFAULT NULL,
  `iv` json DEFAULT NULL,
  `emailVerified` json DEFAULT NULL,
  `nickName` json DEFAULT NULL,
  `mobilePhoneNumber` json DEFAULT NULL,
  `rawData` json DEFAULT NULL,
  `language` json DEFAULT NULL,
  `gender` json DEFAULT NULL,
  `province` json DEFAULT NULL,
  `encryptedData` json DEFAULT NULL,
  `avatarUrl` json DEFAULT NULL,
  `country` json DEFAULT NULL,
  `authData` json DEFAULT NULL,
  `userInfo` json DEFAULT NULL,
  `mobilePhoneVerified` json DEFAULT NULL,
  PRIMARY KEY (`_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table `order_analysis` */

DROP TABLE IF EXISTS `order_analysis`;

CREATE TABLE `order_analysis` (
  `date` DATETIME DEFAULT NULL,
  `usr_src` BIGINT(20) DEFAULT '1',
  `order_src` BIGINT(20) DEFAULT '1'
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
