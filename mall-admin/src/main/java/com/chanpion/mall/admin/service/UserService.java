package com.chanpion.mall.admin.service;

import com.chanpion.mall.admin.entity.User;

import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/28 14:29
 */
public interface UserService {

    /**
     * 创建用户
     *
     * @param user 用户信息
     * @return 创建的用户
     */
    User create(User user);

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return 用户
     */
    User findByName(String username);

    /**
     * 查询所有用户
     *
     * @return 用户列表
     */
    List<User> findAll();
}
