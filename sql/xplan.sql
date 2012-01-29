/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50150
Source Host           : localhost:3306
Source Database       : xplan

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2011-11-29 11:49:18
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `xp_user`
-- ----------------------------
DROP TABLE IF EXISTS `xp_user`;
CREATE TABLE `xp_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户名-主键说明',
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xp_user
-- ----------------------------
