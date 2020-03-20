package com.chanpion.mall.admin.dao;

import com.chanpion.mall.admin.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/16 17:09
 */
@Repository
public interface UserDAO {

    /**
     * 插入一条用户记录
     *
     * @param user 用户
     * @return 保持的用户
     */
    User insert(User user);

    /**
     * findByName
     *
     * @param username 用户名
     * @return 用户
     */
    User findByUsername(String username);

    /**
     * 查询所有用户
     *
     * @return 用户列表
     */
    List<User> findAll();
}
