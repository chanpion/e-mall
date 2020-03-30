-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'https://i.loli.net/2018/12/31/5c297270b20e2.jpg', '2018-08-23 09:11:56', 'zhengjie@tom.com', 1, '14e1b600b1fd579f47433b88e8d85291', 'admin', '2018-11-23 10:12:36');
INSERT INTO `user` VALUES (3, 'https://i.loli.net/2018/12/30/5c2871d6aa101.jpg', '2018-12-27 20:05:26', 'test@qq.com', 1, '085de60f32b004402326e5ee425a6167', 'test', NULL);

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '2018-11-23 11:04:37', '超级管理员', '超级管理员');
INSERT INTO `role` VALUES (2, '2018-11-23 13:09:06', '普通用户', '普通用户');

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '超级管理员', '2018-12-03 12:27:48', 'ADMIN', 0);
INSERT INTO `permission` VALUES (2, '用户管理', '2018-12-03 12:28:19', 'USER_ALL', 0);
INSERT INTO `permission` VALUES (3, '用户查询', '2018-12-03 12:31:35', 'USER_SELECT', 2);
INSERT INTO `permission` VALUES (4, '用户创建', '2018-12-03 12:31:35', 'USER_CREATE', 2);
INSERT INTO `permission` VALUES (5, '用户编辑', '2018-12-03 12:31:35', 'USER_EDIT', 2);
INSERT INTO `permission` VALUES (6, '用户删除', '2018-12-03 12:31:35', 'USER_DELETE', 2);
INSERT INTO `permission` VALUES (7, '角色管理', '2018-12-03 12:28:19', 'ROLES_ALL', 0);
INSERT INTO `permission` VALUES (8, '角色查询', '2018-12-03 12:31:35', 'ROLES_SELECT', 7);
INSERT INTO `permission` VALUES (10, '角色创建', '2018-12-09 20:10:16', 'ROLES_CREATE', 7);
INSERT INTO `permission` VALUES (11, '角色编辑', '2018-12-09 20:10:42', 'ROLES_EDIT', 7);
INSERT INTO `permission` VALUES (12, '角色删除', '2018-12-09 20:11:07', 'ROLES_DELETE', 7);
INSERT INTO `permission` VALUES (13, '权限管理', '2018-12-09 20:11:37', 'PERMISSION_ALL', 0);
INSERT INTO `permission` VALUES (14, '权限查询', '2018-12-09 20:11:55', 'PERMISSION_SELECT', 13);
INSERT INTO `permission` VALUES (15, '权限创建', '2018-12-09 20:14:10', 'PERMISSION_CREATE', 13);
INSERT INTO `permission` VALUES (16, '权限编辑', '2018-12-09 20:15:44', 'PERMISSION_EDIT', 13);
INSERT INTO `permission` VALUES (17, '权限删除', '2018-12-09 20:15:59', 'PERMISSION_DELETE', 13);
INSERT INTO `permission` VALUES (18, '缓存管理', '2018-12-17 13:53:25', 'REDIS_ALL', 0);
INSERT INTO `permission` VALUES (19, '新增缓存', '2018-12-17 13:53:44', 'REDIS_CREATE', 18);
INSERT INTO `permission` VALUES (20, '缓存查询', '2018-12-17 13:54:07', 'REDIS_SELECT', 18);
INSERT INTO `permission` VALUES (21, '缓存编辑', '2018-12-17 13:54:26', 'REDIS_EDIT', 18);
INSERT INTO `permission` VALUES (22, '缓存删除', '2018-12-17 13:55:04', 'REDIS_DELETE', 18);
INSERT INTO `permission` VALUES (23, '图床管理', '2018-12-27 20:31:49', 'PICTURE_ALL', 0);
INSERT INTO `permission` VALUES (24, '查询图片', '2018-12-27 20:32:04', 'PICTURE_SELECT', 23);
INSERT INTO `permission` VALUES (25, '上传图片', '2018-12-27 20:32:24', 'PICTURE_UPLOAD', 23);
INSERT INTO `permission` VALUES (26, '删除图片', '2018-12-27 20:32:45', 'PICTURE_DELETE', 23);
INSERT INTO `permission` VALUES (29, '菜单管理', '2018-12-28 17:34:31', 'MENU_ALL', 0);
INSERT INTO `permission` VALUES (30, '菜单查询', '2018-12-28 17:34:41', 'MENU_SELECT', 29);
INSERT INTO `permission` VALUES (31, '菜单创建', '2018-12-28 17:34:52', 'MENU_CREATE', 29);
INSERT INTO `permission` VALUES (32, '菜单编辑', '2018-12-28 17:35:20', 'MENU_EDIT', 29);
INSERT INTO `permission` VALUES (33, '菜单删除', '2018-12-28 17:35:29', 'MENU_DELETE', 29);
INSERT INTO `permission` VALUES (35, '定时任务管理', '2019-01-08 14:59:57', 'JOB_ALL', 0);
INSERT INTO `permission` VALUES (36, '任务查询', '2019-01-08 15:00:09', 'JOB_SELECT', 35);
INSERT INTO `permission` VALUES (37, '任务创建', '2019-01-08 15:00:20', 'JOB_CREATE', 35);
INSERT INTO `permission` VALUES (38, '任务编辑', '2019-01-08 15:00:33', 'JOB_EDIT', 35);
INSERT INTO `permission` VALUES (39, '任务删除', '2019-01-08 15:01:13', 'JOB_DELETE', 35);


-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, '2018-12-18 15:11:29', '0', '系统管理', NULL, 0, 1, 'system', 'system');
INSERT INTO `menu` VALUES (2, '2018-12-18 15:14:44', '0', '用户管理', 'system/user/index', 1, 2, 'peoples', 'user');
INSERT INTO `menu` VALUES (3, '2018-12-18 15:16:07', '0', '角色管理', 'system/role/index', 1, 3, 'role', 'role');
INSERT INTO `menu` VALUES (4, '2018-12-18 15:16:45', '0', '权限管理', 'system/permission/index', 1, 4, 'permission', 'permission');
INSERT INTO `menu` VALUES (5, '2018-12-18 15:17:28', '0', '菜单管理', 'system/menu/index', 1, 5, 'menu', 'menu');
INSERT INTO `menu` VALUES (6, '2018-12-18 15:17:48', '0', '系统监控', NULL, 0, 10, 'monitor', 'monitor');
INSERT INTO `menu` VALUES (7, '2018-12-18 15:18:26', '0', '系统日志', 'monitor/log/index', 6, 11, 'log', 'logs');
INSERT INTO `menu` VALUES (8, '2018-12-18 15:19:01', '0', '系统缓存', 'monitor/redis/index', 6, 12, 'redis', 'redis');
INSERT INTO `menu` VALUES (9, '2018-12-18 15:19:34', '1', 'SQL监控', NULL, 6, 14, 'sqlMonitor', 'http://localhost:8000/druid');
INSERT INTO `menu` VALUES (10, '2018-12-19 13:38:16', '0', '组件管理', NULL, 0, 50, 'zujian', 'components');
INSERT INTO `menu` VALUES (11, '2018-12-19 13:38:49', '0', '图标库', 'components/IconSelect', 10, 51, 'icon', 'icon');
INSERT INTO `menu` VALUES (12, '2018-12-24 20:37:35', '0', '实时控制台', 'monitor/log/msg', 6, 13, 'codeConsole', 'msg');
INSERT INTO `menu` VALUES (13, '2018-12-27 10:11:26', '0', '三方工具', '', 0, 30, 'tools', 'tools');
INSERT INTO `menu` VALUES (14, '2018-12-27 10:13:09', '0', '邮件工具', 'tools/email/index', 13, 31, 'email', 'email');
INSERT INTO `menu` VALUES (15, '2018-12-27 11:58:25', '0', '富文本', 'components/Editor', 10, 52, 'fw', 'tinymce');
INSERT INTO `menu` VALUES (16, '2018-12-28 09:36:53', '0', 'SM.MS图床', 'tools/picture/index', 13, 32, 'image', 'pictures');
INSERT INTO `menu` VALUES (17, '2018-12-28 15:09:49', '1', '项目地址', '', 0, 0, 'githu', 'https://github.com/elunez/eladmin');
INSERT INTO `menu` VALUES (18, '2018-12-31 11:12:15', '0', '七牛云存储', 'tools/qiniu/index', 13, 33, 'qiniu', 'qiniu');
INSERT INTO `menu` VALUES (19, '2018-12-31 14:52:38', '0', '支付宝工具', 'tools/aliPay/index', 13, 34, 'alipay', 'aliPay');
INSERT INTO `menu` VALUES (21, '2019-01-04 16:22:03', '0', '多级菜单', '', 0, 900, 'menu', 'nested');
INSERT INTO `menu` VALUES (22, '2019-01-04 16:23:29', '0', '二级菜单1', 'nested/menu1/index', 21, 999, 'menu', 'menu1');
INSERT INTO `menu` VALUES (23, '2019-01-04 16:23:57', '0', '二级菜单2', 'nested/menu2/index', 21, 999, 'menu', 'menu2');
INSERT INTO `menu` VALUES (24, '2019-01-04 16:24:48', '0', '三级菜单1', 'nested/menu1/menu1-1', 22, 999, 'menu', 'menu1-1');
INSERT INTO `menu` VALUES (27, '2019-01-07 17:27:32', '0', '三级菜单2', 'nested/menu1/menu1-2', 22, 999, 'menu', 'menu1-2');
INSERT INTO `menu` VALUES (28, '2019-01-07 20:34:40', '0', '定时任务', 'system/timing/index', 1, 6, 'timing', 'timing');


-- ----------------------------
-- Records of users_roles
-- ----------------------------
INSERT INTO `users_roles` VALUES (1, 1);
INSERT INTO `users_roles` VALUES (3, 2);

-- ----------------------------
-- Records of roles_permissions
-- ----------------------------
INSERT INTO `roles_permissions` VALUES (1, 1);
INSERT INTO `roles_permissions` VALUES (2, 3);
INSERT INTO `roles_permissions` VALUES (2, 8);
INSERT INTO `roles_permissions` VALUES (2, 14);
INSERT INTO `roles_permissions` VALUES (2, 19);
INSERT INTO `roles_permissions` VALUES (2, 23);
INSERT INTO `roles_permissions` VALUES (2, 30);
INSERT INTO `roles_permissions` VALUES (2, 36);

-- ----------------------------
-- Records of menus_roles
-- ----------------------------
INSERT INTO `menus_roles` VALUES (1, 1);
INSERT INTO `menus_roles` VALUES (2, 1);
INSERT INTO `menus_roles` VALUES (3, 1);
INSERT INTO `menus_roles` VALUES (4, 1);
INSERT INTO `menus_roles` VALUES (5, 1);
INSERT INTO `menus_roles` VALUES (6, 1);
INSERT INTO `menus_roles` VALUES (7, 1);
INSERT INTO `menus_roles` VALUES (8, 1);
INSERT INTO `menus_roles` VALUES (9, 1);
INSERT INTO `menus_roles` VALUES (10, 1);
INSERT INTO `menus_roles` VALUES (11, 1);
INSERT INTO `menus_roles` VALUES (12, 1);
INSERT INTO `menus_roles` VALUES (13, 1);
INSERT INTO `menus_roles` VALUES (14, 1);
INSERT INTO `menus_roles` VALUES (15, 1);
INSERT INTO `menus_roles` VALUES (16, 1);
INSERT INTO `menus_roles` VALUES (17, 1);
INSERT INTO `menus_roles` VALUES (18, 1);
INSERT INTO `menus_roles` VALUES (19, 1);
INSERT INTO `menus_roles` VALUES (21, 1);
INSERT INTO `menus_roles` VALUES (22, 1);
INSERT INTO `menus_roles` VALUES (23, 1);
INSERT INTO `menus_roles` VALUES (24, 1);
INSERT INTO `menus_roles` VALUES (27, 1);
INSERT INTO `menus_roles` VALUES (28, 1);
INSERT INTO `menus_roles` VALUES (1, 2);
INSERT INTO `menus_roles` VALUES (2, 2);
INSERT INTO `menus_roles` VALUES (3, 2);
INSERT INTO `menus_roles` VALUES (4, 2);
INSERT INTO `menus_roles` VALUES (5, 2);
INSERT INTO `menus_roles` VALUES (6, 2);
INSERT INTO `menus_roles` VALUES (9, 2);
INSERT INTO `menus_roles` VALUES (12, 2);
INSERT INTO `menus_roles` VALUES (13, 2);
INSERT INTO `menus_roles` VALUES (14, 2);
INSERT INTO `menus_roles` VALUES (16, 2);
INSERT INTO `menus_roles` VALUES (17, 2);
INSERT INTO `menus_roles` VALUES (18, 2);
INSERT INTO `menus_roles` VALUES (19, 2);
INSERT INTO `menus_roles` VALUES (21, 2);
INSERT INTO `menus_roles` VALUES (22, 2);
INSERT INTO `menus_roles` VALUES (23, 2);
INSERT INTO `menus_roles` VALUES (24, 2);
INSERT INTO `menus_roles` VALUES (27, 2);
INSERT INTO `menus_roles` VALUES (28, 2);
