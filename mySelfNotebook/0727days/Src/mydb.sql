/*
 Navicat Premium Data Transfer

 Source Server         : mysql8
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 27/07/2019 17:24:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for authors
-- ----------------------------
DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of authors
-- ----------------------------
INSERT INTO `authors` VALUES (1, 'authora', 'male');
INSERT INTO `authors` VALUES (2, 'authorb', 'female');

-- ----------------------------
-- Table structure for bookandauthor
-- ----------------------------
DROP TABLE IF EXISTS `bookandauthor`;
CREATE TABLE `bookandauthor`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `bookId` int(10) UNSIGNED NULL DEFAULT NULL,
  `authorId` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_Book_BookAndAuthor`(`bookId`) USING BTREE,
  INDEX `fk_Author_BookAndAuthor`(`authorId`) USING BTREE,
  CONSTRAINT `fk_Author_BookAndAuthor` FOREIGN KEY (`authorId`) REFERENCES `authors` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_Book_BookAndAuthor` FOREIGN KEY (`bookId`) REFERENCES `books` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bookandauthor
-- ----------------------------
INSERT INTO `bookandauthor` VALUES (1, 1, 1);
INSERT INTO `bookandauthor` VALUES (2, 1, 2);
INSERT INTO `bookandauthor` VALUES (3, 2, 2);
INSERT INTO `bookandauthor` VALUES (4, 3, 1);
INSERT INTO `bookandauthor` VALUES (5, 3, 2);

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `isbn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pressId` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_isbn`(`isbn`) USING BTREE,
  INDEX `fk_Press_Book`(`pressId`) USING BTREE,
  CONSTRAINT `fk_Press_Book` FOREIGN KEY (`pressId`) REFERENCES `presses` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, 'booka', 'bookaisbn', 2);
INSERT INTO `books` VALUES (2, 'bookb', 'bookbisbn', 1);
INSERT INTO `books` VALUES (3, 'bookc', 'bookcisvn', 1);

-- ----------------------------
-- Table structure for passports
-- ----------------------------
DROP TABLE IF EXISTS `passports`;
CREATE TABLE `passports`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `serialno` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `expire` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of passports
-- ----------------------------
INSERT INTO `passports` VALUES (1, 'lisipassport', 10);
INSERT INTO `passports` VALUES (2, 'zhangsanpassport', 20);

-- ----------------------------
-- Table structure for peoples
-- ----------------------------
DROP TABLE IF EXISTS `peoples`;
CREATE TABLE `peoples`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passportId` int(255) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_passportId`(`passportId`) USING BTREE,
  CONSTRAINT `fk_Passport_People` FOREIGN KEY (`passportId`) REFERENCES `passports` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of peoples
-- ----------------------------
INSERT INTO `peoples` VALUES (1, 'zhangsan', 2);
INSERT INTO `peoples` VALUES (2, 'lisi', 1);

-- ----------------------------
-- Table structure for presses
-- ----------------------------
DROP TABLE IF EXISTS `presses`;
CREATE TABLE `presses`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of presses
-- ----------------------------
INSERT INTO `presses` VALUES (1, 'aa', 'aaaddress');
INSERT INTO `presses` VALUES (2, 'bb', 'bbaddress');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `salary` double(10, 2) NOT NULL,
  `regtime` timestamp(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'zhangsan', 11, 1.10, '2019-07-26 19:50:33');
INSERT INTO `users` VALUES (2, 'lizhangsi', 12, 1.20, '2019-07-25 19:50:51');

SET FOREIGN_KEY_CHECKS = 1;
