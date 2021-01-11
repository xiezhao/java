--liquibase formatted sql
--changeset whx:1.1
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for test_user_tab
-- ----------------------------
DROP TABLE IF EXISTS `test_user_tab`;
CREATE TABLE `test_user_tab` (
                                 `userId` int(11) NOT NULL AUTO_INCREMENT,
                                 `userAccount` varchar(16) NOT NULL,
                                 `password` varchar(32) NOT NULL,
                                 `userStatus` tinyint(1) NOT NULL DEFAULT '1',
                                 `addTime` datetime NOT NULL,
                                 PRIMARY KEY (`userId`)
)


