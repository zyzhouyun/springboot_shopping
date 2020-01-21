/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.20-log : Database - schoolshopping
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`schoolshopping` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `schoolshopping`;

/*Table structure for table `orderandbill` */

DROP TABLE IF EXISTS `orderandbill`;

CREATE TABLE `orderandbill` (
  `orderId` int(11) NOT NULL,
  `billCode` int(11) NOT NULL,
  PRIMARY KEY (`orderId`,`billCode`),
  KEY `FK_Relationship_10` (`billCode`),
  CONSTRAINT `FK_Relationship_10` FOREIGN KEY (`billCode`) REFERENCES `sh_bill` (`billCode`),
  CONSTRAINT `orderandbill_ibfk_1` FOREIGN KEY (`orderId`) REFERENCES `sh_order` (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderandbill` */

insert  into `orderandbill`(`orderId`,`billCode`) values 
(1,1),
(14,21),
(1,29),
(2,30),
(2,31),
(3,32),
(3,33),
(4,34),
(4,35),
(5,36),
(5,37),
(6,38),
(6,39),
(14,48),
(8,49),
(9,49),
(10,49),
(11,49),
(12,50),
(13,50),
(13,51),
(16,52),
(15,53),
(10,54),
(11,54),
(12,55),
(13,55);

/*Table structure for table `sh_account` */

DROP TABLE IF EXISTS `sh_account`;

CREATE TABLE `sh_account` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT COMMENT '账户id',
  `userCode` int(11) DEFAULT NULL COMMENT '用户编号',
  `accMoney` float(8,2) NOT NULL COMMENT '余额',
  PRIMARY KEY (`accountId`),
  KEY `FK_Relationship_5` (`userCode`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='账户';

/*Data for the table `sh_account` */

insert  into `sh_account`(`accountId`,`userCode`,`accMoney`) values 
(1,1,10486.00),
(2,2,1000.00),
(3,3,1000.00),
(4,4,1000.00),
(5,5,1000.00),
(6,6,1070.00),
(7,7,1000.00),
(8,8,1000.00),
(9,9,514.20),
(10,10,86930.00);

/*Table structure for table `sh_address` */

DROP TABLE IF EXISTS `sh_address`;

CREATE TABLE `sh_address` (
  `addressId` int(11) NOT NULL AUTO_INCREMENT COMMENT '收货地址id',
  `userCode` int(11) DEFAULT NULL COMMENT '用户编号',
  `addressName` varchar(50) NOT NULL COMMENT '收货人姓名',
  `addressPhone` decimal(11,0) NOT NULL COMMENT '收货人电话',
  `addressInfo` varchar(100) NOT NULL COMMENT '收货地址信息',
  `addressStatus` int(11) DEFAULT '0',
  PRIMARY KEY (`addressId`),
  KEY `FK_Relationship_7` (`userCode`),
  CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`userCode`) REFERENCES `sh_user` (`userCode`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='收货地址';

/*Data for the table `sh_address` */

insert  into `sh_address`(`addressId`,`userCode`,`addressName`,`addressPhone`,`addressInfo`,`addressStatus`) values 
(1,1,'张三',12355665646,'江西省南昌市青山湖区中欧金球公寓',0),
(4,2,'赵六',14549944489,'四川成都',1),
(5,2,'如花',15456454566,'江西省上饶市',0),
(6,3,'翠花',13455454466,'江西省九江市',1),
(7,3,'二狗',13655948484,'江西省抚州市',1),
(8,3,'阿拉',17845464454,'上海市',0),
(9,2,'猫咪',19512151566,'南昌市',0),
(11,1,'天天',15579379332,'南昌市青山湖汇源二栋',1);

/*Table structure for table `sh_admin` */

DROP TABLE IF EXISTS `sh_admin`;

CREATE TABLE `sh_admin` (
  `adminId` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `adminName` varchar(50) NOT NULL COMMENT '管理员名称',
  `adminPhone` decimal(11,0) NOT NULL COMMENT '管理员手机号',
  `adminPwd` varchar(50) DEFAULT NULL COMMENT '管理员密码',
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员';

/*Data for the table `sh_admin` */

insert  into `sh_admin`(`adminId`,`adminName`,`adminPhone`,`adminPwd`) values 
(1,'admin',12345678910,'123');

/*Table structure for table `sh_bill` */

DROP TABLE IF EXISTS `sh_bill`;

CREATE TABLE `sh_bill` (
  `billCode` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编码',
  `userCode` int(11) DEFAULT NULL COMMENT '用户编号',
  `typeId` int(11) DEFAULT NULL COMMENT '商品类型',
  `billName` varchar(50) NOT NULL COMMENT '商品名称',
  `billState` decimal(8,0) DEFAULT '0' COMMENT '商品状态',
  `billdesc` varchar(200) DEFAULT NULL COMMENT '商品描述',
  `billImage` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `billMoney` float(8,2) DEFAULT NULL COMMENT '商品价格',
  `putawayDate` date DEFAULT NULL COMMENT '上架时间',
  `downDate` date DEFAULT NULL COMMENT '下架时间',
  `issueDate` date DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`billCode`),
  KEY `FK_Relationship_12` (`userCode`),
  KEY `FK_Relationship_8` (`typeId`),
  CONSTRAINT `FK_Relationship_12` FOREIGN KEY (`userCode`) REFERENCES `sh_user` (`userCode`),
  CONSTRAINT `FK_Relationship_8` FOREIGN KEY (`typeId`) REFERENCES `sh_billtype` (`typeId`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8 COMMENT='商品';

/*Data for the table `sh_bill` */

insert  into `sh_bill`(`billCode`,`userCode`,`typeId`,`billName`,`billState`,`billdesc`,`billImage`,`billMoney`,`putawayDate`,`downDate`,`issueDate`) values 
(1,1,1,'苹果手机壳',1,'量多','/img/zyc_pingguoshoujike.jpg',39.99,'2019-08-21',NULL,'2019-08-21'),
(5,5,1,'ThinkPad笔记本',0,'好的','/img/zyc_ThinkPad.jpg',3000.00,'2019-08-23',NULL,'2019-08-23'),
(6,6,1,'艾尼牌照相机',0,'步步','/img/zyc_ainipaizhaoxiangji.jpg',999.00,'2019-08-23',NULL,'2019-08-23'),
(7,5,1,'苹果耳机',0,'挺好','/img/zyc_pingguoerji.jpg',4000.00,'2019-08-23',NULL,'2019-08-23'),
(8,7,1,'机械键盘',0,'挺好','/img/zyc_jixiejianpan.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(9,8,1,'无线鼠标',0,'挺好','/img/zyc_wuxianshubiao.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(10,9,1,'华为数据线',0,'好的','/img/zyc_huaweishujuxian.jpg',10.00,'2019-08-23',NULL,'2019-08-23'),
(11,10,2,'吹风机',0,'好的','img/zyc_chuifengji.jpg',30.00,'2019-08-23',NULL,'2019-08-23'),
(12,6,2,'热水壶',0,'好的','/img/zyc_reshuihu.jpg',60.00,'2019-08-23',NULL,'2019-08-23'),
(13,4,2,'电插板',0,'好的','img/zyc_dianchaban.jpg',30.00,'2019-08-23',NULL,'2019-08-23'),
(14,6,2,'电工榨汁机',0,'好的','/img/zyc_diangongzhazhiji.jpg',70.00,'2019-08-23',NULL,'2019-08-23'),
(15,8,2,'风扇',0,'好的','/img/zyc_fengshan.jpg',25.00,'2019-08-23',NULL,'2019-08-23'),
(16,8,2,'电热水壶',0,'好的','/img/zyc_dianreshuihu.jpg',40.00,'2019-08-23',NULL,'2019-08-23'),
(17,9,3,'龙族1',0,'好的','/img/zyc_longzuyi.jpg',20.00,'2019-08-23',NULL,'2019-08-23'),
(18,9,3,'在人间',0,'好的','/img/zyc_zairenjian.jpg',10.00,'2019-08-23',NULL,'2019-08-23'),
(19,10,3,'西游记',0,'好的','/img/zyc_xiyouji.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(20,5,3,'红楼梦',0,'好的','/img/zyc_hongloumeng.jpg',60.00,'2019-08-23',NULL,'2019-08-23'),
(21,6,3,'三国演义',1,'好的','/img/zyc_sanguoyanyi.jpg',70.00,'2019-08-23',NULL,'2019-08-23'),
(22,6,3,'水浒传',0,'好的','/img/zyc_shuihuzhuan.jpg',80.00,'2019-08-23',NULL,'2019-08-23'),
(23,8,4,'腕力球',0,'好的','/img/zyc_wanliqiu.jpg',60.00,'2019-08-23',NULL,'2019-08-23'),
(24,8,4,'臂力棒',0,'好的','/img/zyc_bilibang.jpg',20.00,'2019-08-23',NULL,'2019-08-23'),
(25,4,4,'杠铃',0,'好的','/img/zyc_gangling.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(26,4,4,'红双喜牌乒乓球拍',0,'好的','/img/zyc_hongshuangxipaipingpangqiupai.jpg',10.00,'2019-08-23',NULL,'2019-08-23'),
(27,2,4,'篮球',0,'好的','/img/zyc_lanqiu.jpg',30.00,'2019-08-23',NULL,'2019-08-23'),
(28,6,4,'健腹轮',0,'好的','/img/zyc_jianfulun.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(29,5,3,'西游记（精装版）',1,'好的','/img/zyc_xiyoujijingzhuangban.jpg',60.00,'2019-08-23',NULL,'2019-08-23'),
(30,4,1,'苹果数据线',1,'好的','/img/zyc_pingguoshujuxian.jpg',30.00,'2019-08-23',NULL,'2019-08-23'),
(31,8,1,'苹果耳机',1,'好的','/img/zyc_pingguoerji_2.jpg',30.00,'2019-08-23',NULL,'2019-08-23'),
(32,8,4,'羽毛球拍',1,'好的','/img/zyc_yumaoqiupai.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(33,9,4,'足球',1,'好的','/img/zyc_zuqiu.jpg',50.00,'2019-08-23',NULL,'2019-08-23'),
(34,10,1,'华为手环',1,'好的','/img/zyc_huaweishouhuan.jpg',100.00,'2019-08-23',NULL,'2019-08-23'),
(35,9,1,'华为数据线',1,'好的','/img/zyc_huaweishujuxian_2.jpg',10.00,'2019-08-23',NULL,'2019-08-23'),
(36,5,2,'电磁炉',1,'好的','/img/zyc_diancilu.jpg',100.00,'2019-08-23',NULL,'2019-08-23'),
(37,7,3,'哑舍',1,'好的','/img/zyc_yashe.jpg',20.00,'2019-08-23',NULL,'2019-08-23'),
(38,4,1,'充电宝',1,'好的','/img/zyc_chongdianbao.jpg',60.00,'2019-08-23',NULL,'2019-08-23'),
(39,6,1,'小米手环',1,'好的','/img/zyc_xiaomishouhuan.jpg',140.00,'2019-08-23',NULL,'2019-08-23'),
(40,6,1,'小米耳机',0,'呃呃','/img/zyc_xiaomierji.jpg',69.00,'2019-09-17',NULL,'2019-09-17'),
(41,1,1,'asdadas',0,'1232qdasdasd','http://localhost:8080\\upload\\4bb76d636b094811b82a0271eefb385f.jpeg',1234.00,'2019-09-20',NULL,'2019-09-20'),
(42,1,1,'asdasdsa',0,'asdasdasdsdasds','http://localhost:8080\\upload\\95bd08cc2c40457f8395b3f646f678ca.jpg',1234.00,'2019-09-20',NULL,'2019-09-20'),
(44,1,1,'按时大苏打',0,'按时大苏打','http://localhost:8080\\upload\\0cce934c0f7b426db2d4d6d22eafd9cd.jpg',1234.00,'2019-09-20',NULL,'2019-09-20'),
(45,1,1,'阿萨大',0,'撒大苏打','http://localhost:8080\\upload\\1d9003c5ee3546ffb0dcdc8358975ba5.jpg',1234.00,'2019-09-20',NULL,'2019-09-20'),
(46,1,2,'asdasd',0,'asdasd','http://localhost:8080\\upload\\af59ce7fcadd46ffb71a1f756454bbed.jpeg',1234.00,'2019-09-20',NULL,'2019-09-20'),
(48,1,1,'yoga翻转笔记本',1,'哈哈哈，超级好用噢！','http://localhost:8080\\upload\\57cad9dae4c54dd69f1b80f8ff0fb1d3.jpg;http://localhost:8080\\upload\\4257ab78669047499df641726c709bfa.jpeg;http://localhost:8080\\upload\\90ba06b15ba84a6e9bac693adeed29c8.jpg;http://localhost:8080\\upload\\f32d9783918444adadeb705c891a76f0.jpeg;',13000.00,'2019-09-20',NULL,'2019-09-20'),
(49,1,1,'Apple平板电脑',1,'啊实打实大大','http://localhost:8080\\upload\\442f19750ab34e8f9597999895037732.jpg;http://localhost:8080\\upload\\4ff41daba8cf43e8af4ffcdb2fa02310.jpeg;http://localhost:8080\\upload\\e762d231d75e40a8ad968837220182af.jpg;http://localhost:8080\\upload\\135aad9218d14ff7af9bca99c1b6ee27.jpeg;http://localhost:8080\\upload\\6ad36ce2650545b79e50eedd54ed3cfd.jpeg;http://localhost:8080\\upload\\6f95f561909d4ebd864ee9ada1ad59e1.jpg;',12345.00,'2019-09-20',NULL,'2019-09-20'),
(50,1,1,'mini4',1,'9成新','http://localhost:8080\\upload\\5a67d6446a2549f089584a493bffa77c.jpeg;http://localhost:8080\\upload\\354a2d6c34d04e00a698f3ecc8518cdd.jpeg;http://localhost:8080\\upload\\92c80d85b8da45adaceab29376191179.jpeg;',1928.80,'2019-09-23',NULL,'2019-09-23'),
(51,1,1,'阿萨大大',1,'按时大苏打','http://localhost:8080\\upload\\3bd68e6fe4694718b1a9b39ea4d05e67.jpeg',363.00,'2019-09-23',NULL,'2019-09-23'),
(52,1,1,'阿萨大阿三打撒',1,'按时大苏打','http://localhost:8080\\upload\\3e940486a7224278a7cae8f1bb665046.jpeg',363.00,'2019-09-23',NULL,'2019-09-23'),
(53,1,1,'阿萨大的',1,'阿萨大大','http://localhost:8080\\upload\\d45261762da943909977066c9107b46c.jpeg',123.00,'2019-09-23',NULL,'2019-09-23'),
(54,1,1,'阿萨大的的',1,'阿萨大大','http://localhost:8080\\upload\\028bf01d877e4394a9857ef77e301c78.jpeg',123.00,'2019-09-23',NULL,'2019-09-23'),
(55,1,1,'阿萨大的的的',1,'阿萨大大','http://localhost:8080\\upload\\41c3086143de4df7867881f2d05d9798.jpeg',123.00,'2019-09-23',NULL,'2019-09-23'),
(56,1,1,'华为nove',0,'你比夜色更美','http://localhost:8080\\upload\\e0dbf60afd8a4ac2a7b8e3a2519d2fef.jpg',1800.00,'2019-09-24',NULL,'2019-09-24'),
(57,10,1,'haha',0,'挺好','http://localhost:8080\\upload\\24737afc248a4f0da5fc425a24026b03.jpg;http://localhost:8080\\upload\\192ffe1e27e1447da76397d9c30badd3.jpeg;http://localhost:8080\\upload\\12d2769e66ce4e0999e55629de847e5f.jpg;',666.00,'2019-09-30',NULL,'2019-09-30');

/*Table structure for table `sh_billtype` */

DROP TABLE IF EXISTS `sh_billtype`;

CREATE TABLE `sh_billtype` (
  `typeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `typeName` varchar(50) NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`typeId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='商品类别';

/*Data for the table `sh_billtype` */

insert  into `sh_billtype`(`typeId`,`typeName`) values 
(1,'闲置数码'),
(2,'闲置电器'),
(3,'闲置书籍'),
(4,'闲置运动');

/*Table structure for table `sh_buy` */

DROP TABLE IF EXISTS `sh_buy`;

CREATE TABLE `sh_buy` (
  `buyId` int(11) NOT NULL AUTO_INCREMENT COMMENT '求购id',
  `userCode` int(11) DEFAULT NULL COMMENT '用户编号',
  `buyInfo` varchar(200) NOT NULL COMMENT '求购内容',
  `buyDate` date DEFAULT NULL COMMENT '求购时间',
  PRIMARY KEY (`buyId`),
  KEY `FK_Relationship_6` (`userCode`),
  CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`userCode`) REFERENCES `sh_user` (`userCode`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='求购信息';

/*Data for the table `sh_buy` */

insert  into `sh_buy`(`buyId`,`userCode`,`buyInfo`,`buyDate`) values 
(1,1,'手机','2019-08-22'),
(2,2,'沐浴露','2019-08-25'),
(3,3,'辣条','2019-08-21'),
(4,4,'女仆装','2019-08-21'),
(5,5,'枕头急需','2019-09-19'),
(6,6,'篮球鞋','2019-09-19'),
(7,7,'无线鼠标','2019-09-19'),
(8,8,'鼠标垫','2019-09-19'),
(9,1,'\n\n                                sdf','2019-09-19'),
(10,1,'\n\n                                fd','2019-09-19');

/*Table structure for table `sh_cart` */

DROP TABLE IF EXISTS `sh_cart`;

CREATE TABLE `sh_cart` (
  `cartId` int(11) NOT NULL AUTO_INCREMENT,
  `billCode` int(11) DEFAULT NULL,
  `buyerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`cartId`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

/*Data for the table `sh_cart` */

insert  into `sh_cart`(`cartId`,`billCode`,`buyerId`) values 
(6,42,3),
(7,44,3),
(8,49,3),
(9,45,2),
(42,48,9),
(43,21,9),
(44,21,10),
(47,16,1),
(48,53,9),
(49,44,9),
(50,41,10);

/*Table structure for table `sh_comment` */

DROP TABLE IF EXISTS `sh_comment`;

CREATE TABLE `sh_comment` (
  `comId` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `userCode` int(11) DEFAULT NULL COMMENT '用户编号',
  `commentInfo` varchar(200) DEFAULT NULL COMMENT '评论信息',
  `comDate` date DEFAULT NULL COMMENT '评论时间',
  `billCode` int(11) DEFAULT NULL,
  PRIMARY KEY (`comId`),
  KEY `FK_Relationship_3` (`userCode`),
  CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`userCode`) REFERENCES `sh_user` (`userCode`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='评论';

/*Data for the table `sh_comment` */

insert  into `sh_comment`(`comId`,`userCode`,`commentInfo`,`comDate`,`billCode`) values 
(1,1,'卧槽，半价大甩卖，质量又好','2019-08-16',48),
(2,2,'卧槽，半价大甩卖，质量又好','2019-08-16',50),
(3,3,'我感觉不行','2019-08-16',51),
(4,4,'还可以吧','2019-08-16',51),
(5,5,'真心感觉不错，推荐买','2019-08-16',50),
(6,6,'价格贵就不说了，质量还差','2019-08-16',48),
(7,7,'良心商家','2019-08-16',6),
(8,8,'黑心商家','2019-08-16',6),
(9,9,'白心商家','2019-08-16',1),
(10,10,'红心商家','2019-08-16',50),
(11,1,'wsadasd','2019-09-20',50),
(12,1,'asdasdasd','2019-09-20',50),
(13,1,'haohaohao','2019-09-20',50),
(14,1,'asd123','2019-09-23',51),
(15,1,'12313','2019-09-23',51),
(16,1,'1234213','2019-09-23',51),
(17,1,'asd','2019-09-23',51),
(18,1,'asdadsad','2019-09-23',51),
(19,1,'真好','2019-09-30',57);

/*Table structure for table `sh_order` */

DROP TABLE IF EXISTS `sh_order`;

CREATE TABLE `sh_order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `userCode` int(11) DEFAULT NULL COMMENT '用户编号',
  `orderCode` decimal(8,0) NOT NULL COMMENT '订单编码',
  `orderMoney` float(8,2) DEFAULT NULL COMMENT '订单价格',
  `orderStatus` decimal(8,0) DEFAULT '0' COMMENT '订单状态',
  `ordertime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`orderId`),
  KEY `FK_Relationship_1` (`userCode`),
  CONSTRAINT `FK_Relationship_1` FOREIGN KEY (`userCode`) REFERENCES `sh_user` (`userCode`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='订单';

/*Data for the table `sh_order` */

insert  into `sh_order`(`orderId`,`userCode`,`orderCode`,`orderMoney`,`orderStatus`,`ordertime`) values 
(1,1,1,99.99,0,'2019-09-19 00:00:00'),
(2,1,2,60.00,0,'1970-01-30 00:00:00'),
(3,2,3,100.00,0,'1970-05-15 00:00:00'),
(4,2,4,110.00,0,'2019-06-01 00:00:00'),
(5,3,5,100.00,0,'1970-01-16 00:00:00'),
(6,3,6,200.00,0,'1970-01-31 00:00:00'),
(8,1,75088804,12345.00,0,'2019-09-27 09:30:41'),
(9,1,78993611,12345.00,0,'2019-09-27 09:32:39'),
(10,1,89895610,12468.00,0,'2019-09-27 09:40:47'),
(11,1,89630572,12468.00,0,'2019-09-27 14:23:43'),
(12,9,83454556,2051.80,0,'2019-09-27 15:33:40'),
(13,10,77761052,2414.80,0,'2019-09-27 15:35:27'),
(14,10,71899671,13070.00,0,'2019-09-27 15:47:02'),
(15,9,79449735,123.00,0,'2019-09-28 09:19:42'),
(16,9,87633255,363.00,0,'2019-09-28 09:24:27');

/*Table structure for table `sh_record` */

DROP TABLE IF EXISTS `sh_record`;

CREATE TABLE `sh_record` (
  `recordId` int(11) NOT NULL AUTO_INCREMENT COMMENT '充值id',
  `accountId` int(11) DEFAULT NULL COMMENT '账户id',
  `recordMoney` float(8,2) NOT NULL COMMENT '充值金额',
  `recordDate` date NOT NULL COMMENT '充值时间',
  PRIMARY KEY (`recordId`),
  KEY `FK_Relationship_11` (`accountId`),
  CONSTRAINT `FK_Relationship_11` FOREIGN KEY (`accountId`) REFERENCES `sh_account` (`accountId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='充值记录';

/*Data for the table `sh_record` */

insert  into `sh_record`(`recordId`,`accountId`,`recordMoney`,`recordDate`) values 
(1,1,100.00,'2019-08-21'),
(2,2,2000.00,'2019-08-21'),
(3,3,3000.00,'2019-08-21'),
(4,4,90000.00,'2019-08-21');

/*Table structure for table `sh_user` */

DROP TABLE IF EXISTS `sh_user`;

CREATE TABLE `sh_user` (
  `userCode` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `accountId` int(11) DEFAULT NULL COMMENT '账户id',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `userPhone` varchar(11) NOT NULL COMMENT '手机号',
  `userPwd` varchar(200) NOT NULL COMMENT '密码',
  `userCreateDate` date DEFAULT NULL COMMENT '注册时间',
  `userHeadPortrait` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `userGender` decimal(2,0) DEFAULT NULL COMMENT '用户性别',
  `userState` decimal(8,0) DEFAULT NULL COMMENT '用户状态',
  PRIMARY KEY (`userCode`),
  KEY `FK_Relationship_4` (`accountId`),
  CONSTRAINT `FK_Relationship_4` FOREIGN KEY (`accountId`) REFERENCES `sh_account` (`accountId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `sh_user` */

insert  into `sh_user`(`userCode`,`accountId`,`userName`,`userPhone`,`userPwd`,`userCreateDate`,`userHeadPortrait`,`userGender`,`userState`) values 
(1,1,'zhangsan','12355665456','123','2019-08-21','http://localhost:8080\\upload\\fea1eb86f1784bbb8073af7e82fe1879.jpg',0,0),
(2,2,'lisi','16515655665','123','2019-08-16',NULL,0,0),
(3,3,'wangwu','18899955456','123','2019-08-16',NULL,0,0),
(4,4,'zhaoliu','16564523177','123','2019-08-16',NULL,0,0),
(5,5,'ruhua','14549944489','123','2019-08-16',NULL,0,0),
(6,6,'cuihua','15456454566','123','2019-08-16',NULL,0,0),
(7,7,'ergou','13455454466','123','2019-08-16',NULL,0,0),
(8,8,'ala','13655948484','123','2019-08-16',NULL,0,0),
(9,9,'maomi','17845464454','123','2019-08-16',NULL,0,0),
(10,10,'dagou','11565546484','123','2019-08-21',NULL,0,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
