/*
Navicat MySQL Data Transfer

Source Server         : ddpress
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : my_db

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-05-16 18:07:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for my_blog
-- ----------------------------
DROP TABLE IF EXISTS `my_blog`;
CREATE TABLE `my_blog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `content` text,
  `description` varchar(255) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `upt_time` datetime DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `comment_count` int(11) DEFAULT NULL,
  `like_count` int(11) DEFAULT NULL,
  `categories` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_blog
-- ----------------------------
INSERT INTO `my_blog` VALUES ('1', '第一篇日志', '/images/blog/01.jpg', '第一篇日志内容', '第一篇日志简介', '2016-05-07 10:54:59', '2016-05-07 10:55:05', '北京', '10', '100', '随笔');
INSERT INTO `my_blog` VALUES ('2', '第二篇日志', '/images/blog/01.jpg', null, '第二篇日志简介', '2016-05-05 10:57:19', '2016-05-05 10:57:19', '北京', '1', '3', '随笔');
INSERT INTO `my_blog` VALUES ('3', '第三篇日志', '/images/blog/01.jpg', '', '第三篇日志简介', '2016-05-03 10:57:19', '2016-05-03 10:57:19', '北京', '200', '4', '随笔');
INSERT INTO `my_blog` VALUES ('4', '第四篇日志', '/images/blog/01.jpg', '', '第四篇日志简介', '2016-05-03 10:57:19', '2016-05-03 10:57:19', '北京', '200', '4', '随笔');
INSERT INTO `my_blog` VALUES ('5', '第五篇日志', '/images/blog/01.jpg', '', '第五篇日志简介', '2016-05-03 10:57:19', '2016-05-03 10:57:19', '北京', '200', '4', '哈哈');
INSERT INTO `my_blog` VALUES ('6', '第六篇日志', '/images/blog/01.jpg', '', '第六篇日志简介', '2016-05-03 10:57:19', '2016-05-03 10:57:19', '北京', '200', '4', '哈哈');
INSERT INTO `my_blog` VALUES ('7', '第七篇日志', '/images/blog/01.jpg', '', '第七篇日志简介', '2016-05-03 10:57:19', '2016-05-03 10:57:19', '北京', '200', '4', '哈哈');

-- ----------------------------
-- Table structure for my_categories
-- ----------------------------
DROP TABLE IF EXISTS `my_categories`;
CREATE TABLE `my_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_categories
-- ----------------------------
INSERT INTO `my_categories` VALUES ('1', '技术');
INSERT INTO `my_categories` VALUES ('2', '家庭');
INSERT INTO `my_categories` VALUES ('3', '趣闻');
INSERT INTO `my_categories` VALUES ('4', '随笔');

-- ----------------------------
-- Table structure for my_comment
-- ----------------------------
DROP TABLE IF EXISTS `my_comment`;
CREATE TABLE `my_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blog_id` bigint(20) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `reply_state` int(11) DEFAULT NULL,
  `reply_content` varchar(255) DEFAULT NULL,
  `reply_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_comment
-- ----------------------------
INSERT INTO `my_comment` VALUES ('1', '1', '很好', null, 'ptghb@163.com', '哈哈', '2016-05-16 11:37:43', '1', '谢谢', '2016-05-16 11:38:55');

-- ----------------------------
-- Table structure for my_exp
-- ----------------------------
DROP TABLE IF EXISTS `my_exp`;
CREATE TABLE `my_exp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `year` varchar(4) DEFAULT NULL,
  `mmdd` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of my_exp
-- ----------------------------
INSERT INTO `my_exp` VALUES ('1', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2013', '0807');
INSERT INTO `my_exp` VALUES ('2', '官方微博', '推出了HTML5 CSS3 官方微博', '2013', '0528');
INSERT INTO `my_exp` VALUES ('3', 'HTML5 CSS3 发展历程 上线', '虽然功能还未健全，但是我们已迫不及待的让它去接受广大用户的火眼金睛', '2013', '0524');
INSERT INTO `my_exp` VALUES ('4', '初期讨论', '在集体探讨下，发现目前的HTML5 CSS3 发展历程已经不能满足需求，集体讨论=，这时候，韩老师之前的设计稿被端上了会议桌。', '2013', '0508');
INSERT INTO `my_exp` VALUES ('5', '灵感迸发', '某天晚上的凌晨三点一刻，预想建立这样一个功能的网站，专为网页设计师。', '2012', '0701');
INSERT INTO `my_exp` VALUES ('6', 'HTML5 CSS3 发展历程 上线', '虽然功能还未健全，但是我们已迫不及待的让它去接受广大用户的火眼金睛', '2012', '0524');
INSERT INTO `my_exp` VALUES ('7', '初见成效', '代码笔记第一版上线', '2012', '0301');
INSERT INTO `my_exp` VALUES ('8', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2011', '0807');
INSERT INTO `my_exp` VALUES ('9', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2011', '0807');
INSERT INTO `my_exp` VALUES ('10', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2011', '0807');
INSERT INTO `my_exp` VALUES ('11', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2011', '0807');
INSERT INTO `my_exp` VALUES ('12', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2011', '0807');
INSERT INTO `my_exp` VALUES ('13', 'HTML5 CSS3 发展历程 发布', '随着用户的访问量增大,功能不能满足需求，我们进行了重大更新，对设计和功能都进行大幅度的升级,增加了原创，欣赏版块', '2011', '0807');

-- ----------------------------
-- Table structure for my_msg
-- ----------------------------
DROP TABLE IF EXISTS `my_msg`;
CREATE TABLE `my_msg` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of my_msg
-- ----------------------------
INSERT INTO `my_msg` VALUES ('2', 'ptghb@qq.com', '1', '1', '1', '0', '2016-05-13 16:59:03');

-- ----------------------------
-- Table structure for my_photo
-- ----------------------------
DROP TABLE IF EXISTS `my_photo`;
CREATE TABLE `my_photo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `group_name` varchar(20) DEFAULT NULL,
  `img_path` varchar(255) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `upt_time` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_photo
-- ----------------------------
INSERT INTO `my_photo` VALUES ('1', '图一', '图一', '2016-05-11', '/images/portfolio/01.jpg', '2016-05-11 13:14:31', '2016-05-11 13:14:34', '1');
INSERT INTO `my_photo` VALUES ('2', '图二', '图二', '2016-04-11', '/images/portfolio/02.jpg', '2016-04-11 13:14:31', '2016-04-11 13:14:34', '1');
INSERT INTO `my_photo` VALUES ('3', '图三', '图三', '2016-03-11', '/images/portfolio/03.jpg', '2016-03-01 13:14:31', '2016-03-01 13:14:34', '1');
INSERT INTO `my_photo` VALUES ('4', '图四', '图四', '2016-02-11', '/images/portfolio/04.jpg', '2016-02-01 13:14:31', '2016-02-01 13:14:34', '1');

-- ----------------------------
-- Table structure for truth_or_dare
-- ----------------------------
DROP TABLE IF EXISTS `truth_or_dare`;
CREATE TABLE `truth_or_dare` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `upt_time` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of truth_or_dare
-- ----------------------------
INSERT INTO `truth_or_dare` VALUES ('1', '1', '你是处吗', '5', '1', '2016-05-07 16:16:58', '2016-05-07 16:17:03', null);
INSERT INTO `truth_or_dare` VALUES ('2', '0', '模仿叫床', '3', '1', '2016-05-07 16:17:36', '2016-05-07 16:17:39', null);
INSERT INTO `truth_or_dare` VALUES ('3', '1', '你第一次是什么时候', '2', '1', '2016-05-07 16:56:28', '2016-05-07 16:56:31', null);

-- ----------------------------
-- Table structure for truth_or_dare_for_user
-- ----------------------------
DROP TABLE IF EXISTS `truth_or_dare_for_user`;
CREATE TABLE `truth_or_dare_for_user` (
  `id` bigint(20) NOT NULL COMMENT '与总表相同',
  `user_id` bigint(20) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `upt_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of truth_or_dare_for_user
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tel` varchar(11) DEFAULT NULL,
  `weixin` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '登陆类型',
  `add_time` datetime DEFAULT NULL,
  `upd_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '测试', 'sfasgfaf', null, null, null, null, null);

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL COMMENT '与user表id同',
  `sex` varchar(4) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `location` varchar(40) DEFAULT NULL,
  `signature` varchar(255) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `upt_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_t
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES ('1', '测试', 'sfasgfaf', '24');
