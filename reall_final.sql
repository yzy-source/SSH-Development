/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2017-07-25 19:49:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `admin_password` varchar(255) CHARACTER SET utf8 NOT NULL,
  `job` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('zxl', '1', 'boss', '1');
INSERT INTO `admin` VALUES ('yzy', '12', 'boss', '2');
INSERT INTO `admin` VALUES ('zyy', '123', 'boss', '3');
INSERT INTO `admin` VALUES ('hzz', '1234', 'boss', '4');

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `b_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `Country` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`b_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES ('canmake', '日本');
INSERT INTO `brand` VALUES ('mac', '美国');
INSERT INTO `brand` VALUES ('sana', '日本');
INSERT INTO `brand` VALUES ('tom ford', '美国');
INSERT INTO `brand` VALUES ('城野医生', '日本');
INSERT INTO `brand` VALUES ('娥佩兰', '日本');
INSERT INTO `brand` VALUES ('欣兰', '台湾');
INSERT INTO `brand` VALUES ('苏菲娜', '台湾');
INSERT INTO `brand` VALUES ('高姿', '日本');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `username` varchar(255) CHARACTER SET utf8 NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `telephone` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `isvip` tinyint(1) NOT NULL DEFAULT '0',
  `vip_id` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `credit` int(11) DEFAULT '0',
  `degree` int(11) DEFAULT '0',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('zxl', '123', '5c220', '1', '15111111111', '0', '', '0', '0');
INSERT INTO `customer` VALUES ('zyy', '1234', '5c238', '2', '15222222222', '0', null, '0', '0');
INSERT INTO `customer` VALUES ('yzy', '12345', '5b518', '3', '15333333333', '0', null, '0', '0');
INSERT INTO `customer` VALUES ('hzz', '123456', '5a210', '4', '15444444444', '0', null, '0', '0');

-- ----------------------------
-- Table structure for messagebox
-- ----------------------------
DROP TABLE IF EXISTS `messagebox`;
CREATE TABLE `messagebox` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `msg_time` datetime DEFAULT NULL,
  PRIMARY KEY (`msg_id`),
  KEY `FK_MP` (`product_id`),
  KEY `FK_comment` (`uid`),
  CONSTRAINT `messagebox_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `customer` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `messagebox_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of messagebox
-- ----------------------------
INSERT INTO `messagebox` VALUES ('1', '1', '1', '很好用，强退', '2017-07-25 19:47:14');
INSERT INTO `messagebox` VALUES ('2', '1', '2', '喜欢~', '2017-07-25 19:47:42');
INSERT INTO `messagebox` VALUES ('3', '2', '2', '对干皮很友好~', '2017-07-25 19:48:06');
INSERT INTO `messagebox` VALUES ('4', '3', '2', '真的真的很好用的一款产品呀~', '2017-07-25 19:48:40');

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `order_time` datetime DEFAULT NULL,
  `total_money` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `total_amount` int(11) DEFAULT NULL,
  `issure` int(11) DEFAULT '0',
  `address` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `FK_CO` (`uid`),
  CONSTRAINT `orderinfo_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `customer` (`uid`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of orderinfo
-- ----------------------------
INSERT INTO `orderinfo` VALUES ('1', '1', '2017-07-22 00:00:00', '100', '20', '0', '5c220');
INSERT INTO `orderinfo` VALUES ('2', '1', '2017-07-22 00:00:00', '120', '3', '0', '5c218');
INSERT INTO `orderinfo` VALUES ('3', '1', '2017-07-22 00:00:00', '300', '4', '0', '5a220');

-- ----------------------------
-- Table structure for po
-- ----------------------------
DROP TABLE IF EXISTS `po`;
CREATE TABLE `po` (
  `product_ids` int(11) NOT NULL,
  `oids` int(11) NOT NULL,
  `po_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`po_id`),
  KEY `FK_PO2` (`oids`),
  KEY `FK_PO` (`product_ids`),
  CONSTRAINT `po_ibfk_1` FOREIGN KEY (`oids`) REFERENCES `orderinfo` (`oid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `po_ibfk_2` FOREIGN KEY (`product_ids`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of po
-- ----------------------------
INSERT INTO `po` VALUES ('1', '1', '1');
INSERT INTO `po` VALUES ('1', '2', '2');
INSERT INTO `po` VALUES ('1', '3', '4');

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `product_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `price` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `send_addr` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `vip_price` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `detail_info` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `primecost` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `web_price` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `hot_level` int(11) DEFAULT NULL,
  `sell_amount` int(11) DEFAULT '0',
  PRIMARY KEY (`product_id`),
  KEY `FK_belong` (`b_name`),
  KEY `product_name` (`product_name`),
  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`b_name`) REFERENCES `brand` (`b_name`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES ('薏仁水', '75', 'w_1', '70', '500ml', '1', '娥佩兰', '化妆水', '65', '88', '5', '0');
INSERT INTO `products` VALUES ('sofina妆前乳', '110', 'w_1', '100', '25ml', '2', '苏菲娜', '妆前乳', '78', '189', '5', '0');
INSERT INTO `products` VALUES ('DMC欣兰冻膜', '178', 'w_1', '170', '500g', '3', '欣兰', '面膜', '160', '199', '4', '0');
INSERT INTO `products` VALUES ('肌美精3D面膜', '65', 'w_2', '60', '5片', '4', '高姿', '面膜', '52', '95', '5', '0');
INSERT INTO `products` VALUES ('城野医生毛孔收敛水', '125', 'w-2', '115', '100ml', '5', '城野医生', '化妆水', '100', '139', '5', '0');
INSERT INTO `products` VALUES ('sana豆乳化妆水', '78', 'w_2', '73', '200ml', '6', 'sana', '化妆水', '60', '95', '4', '0');
INSERT INTO `products` VALUES ('sana豆乳乳液', '78', 'w_2', '73', '150ml', '7', 'sana', '乳液', '60', '95', '4', '0');
INSERT INTO `products` VALUES ('sana叶绿素美背喷雾', '90', 'w_2', '85', '300ml', '8', 'sana', '喷雾', '74', '118', '3', '0');
INSERT INTO `products` VALUES ('canmake透亮美肌粉饼', '95', 'w_3', '90', '69g', '9', 'canmake', '粉饼', '76', '119', '5', '0');
INSERT INTO `products` VALUES ('5色眼影14色', '89', 'w_3', '85', '31g', '10', 'canmake', '眼影', '69', '84', '5', '0');
INSERT INTO `products` VALUES ('唇膏', '60', 'w_3', '55', '16g', '11', 'canmake', '口红', '50', '62', '5', '0');
INSERT INTO `products` VALUES ('mac chili', '168', 'w_4', '165', '3g', '12', 'mac', '口红', '150', '170', '5', '0');
INSERT INTO `products` VALUES ('mac see sheer', '168', 'w_4', '165', '3g', '13', 'mac', '口红', '150', '170', '4', '0');
INSERT INTO `products` VALUES ('tf16【绝版色】', '345', 'w_4', '335', '3g', '14', 'tom ford', '口红', '320', '365', '5', '0');
INSERT INTO `products` VALUES ('tf9', '345', 'w_4', '335', '3g', '15', 'tom ford', '口红', '320', '365', '5', '0');
INSERT INTO `products` VALUES ('tf白管3', '345', 'w_4', '335', '3g', '16', 'tom ford', '口红', '320', '365', '4', '0');

-- ----------------------------
-- Table structure for recordlist
-- ----------------------------
DROP TABLE IF EXISTS `recordlist`;
CREATE TABLE `recordlist` (
  `Operation_type` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Operation_time` datetime DEFAULT NULL,
  `ChangeNumber` int(11) DEFAULT NULL,
  `RL_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `w_id` int(11) NOT NULL,
  PRIMARY KEY (`RL_id`),
  KEY `FK_AR` (`admin_id`),
  KEY `FK_RP` (`product_id`),
  KEY `w_id` (`w_id`),
  CONSTRAINT `w_id` FOREIGN KEY (`w_id`) REFERENCES `warehouse` (`w_id`),
  CONSTRAINT `recordlist_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `recordlist_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of recordlist
-- ----------------------------

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `store_id` int(11) NOT NULL AUTO_INCREMENT,
  `w_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `storeNum` int(11) DEFAULT NULL,
  `product_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`store_id`),
  KEY `FK_Relationship_8` (`product_id`),
  KEY `FK_Relationship_9` (`w_id`),
  KEY `product_name` (`product_name`),
  CONSTRAINT `store_ibfk_1` FOREIGN KEY (`w_id`) REFERENCES `warehouse` (`w_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_ibfk_3` FOREIGN KEY (`product_name`) REFERENCES `products` (`product_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES ('1', '1', '1', '12', '薏仁水');
INSERT INTO `store` VALUES ('2', '1', '3', '9', 'DMC欣兰冻膜');
INSERT INTO `store` VALUES ('3', '1', '2', '2', 'sofina妆前乳');
INSERT INTO `store` VALUES ('4', '2', '6', '5', 'sana豆乳化妆水');
INSERT INTO `store` VALUES ('5', '3', '5', '5', '城野医生毛孔收敛水');
INSERT INTO `store` VALUES ('6', '4', '10', '10', '5色眼影14色');

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `location` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `ware_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `w_phone` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `w_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES ('天津', '1', '123', '1');
INSERT INTO `warehouse` VALUES ('北京', '2', '234', '2');
INSERT INTO `warehouse` VALUES ('东京', '3', '345', '3');
INSERT INTO `warehouse` VALUES ('大阪', '4', '456', '4');
DROP TRIGGER IF EXISTS `mes`;
DELIMITER ;;
CREATE TRIGGER `mes` BEFORE INSERT ON `messagebox` FOR EACH ROW BEGIN 
   set new.msg_time=CURRENT_TIMESTAMP();
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `operate`;
DELIMITER ;;
CREATE TRIGGER `operate` BEFORE INSERT ON `recordlist` FOR EACH ROW BEGIN 
   set new.Operation_time=CURRENT_TIMESTAMP();
END
;;
DELIMITER ;
