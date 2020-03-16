-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS user;
CREATE TABLE user (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `avatar` varchar(255)  NULL DEFAULT NULL,
  `createTime` datetime NULL DEFAULT NULL,
  `email` varchar(255)  NULL DEFAULT NULL,
  `enabled` bigint(20) NULL DEFAULT NULL,
  `password` varchar(255)  NULL DEFAULT NULL,
  `username` varchar(255)  NULL DEFAULT NULL,
  `lastPasswordResetTime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_kpubos9gc2cvtkb0thktkbkes`(`email`),
  UNIQUE INDEX `username`(`username`)
) ;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createTime` datetime NULL DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `remark` varchar(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `alias` varchar(255)  NULL DEFAULT NULL,
  `createTime` datetime NULL DEFAULT NULL,
  `name` varchar(255) NULL DEFAULT NULL,
  `pid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createTime` datetime NULL DEFAULT NULL,
  `iFrame` bit(1) NULL DEFAULT NULL,
  `name` varchar(255)  NULL DEFAULT NULL,
  `component` varchar(255)  NULL DEFAULT NULL,
  `pid` bigint(20) NOT NULL,
  `sort` bigint(20) NOT NULL,
  `icon` varchar(255)  NULL DEFAULT NULL,
  `path` varchar(255)  NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for users_roles
-- ----------------------------
DROP TABLE IF EXISTS `users_roles`;
CREATE TABLE `users_roles`  (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`)
)ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for roles_permissions
-- ----------------------------
DROP TABLE IF EXISTS `roles_permissions`;
CREATE TABLE `roles_permissions`  (
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`, `permission_id`),
  CONSTRAINT `FK4hrolwj4ned5i7qe8kyiaak6m` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKboeuhl31go7wer3bpy6so7exi` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
)ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for menus_roles
-- ----------------------------
DROP TABLE IF EXISTS `menus_roles`;
CREATE TABLE `menus_roles`  (
  `menu_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`menu_id`, `role_id`),
  CONSTRAINT `FKcngg2qadojhi3a651a5adkvbq` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKq1knxf8ykt26we8k331naabjx` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
)ROW_FORMAT = Compact;
