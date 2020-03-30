package com.chanpion.mall.admin.service.impl;

import com.chanpion.mall.admin.auth.EncryptUtil;
import com.chanpion.mall.admin.dao.UserDAO;
import com.chanpion.mall.admin.entity.User;
import com.chanpion.mall.admin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/28 14:29
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    public User create(User user) {
        String encryptPassword = EncryptUtil.encrypt(user.getPassword(), user.getUsername());
        user.setPassword(encryptPassword);
        long id = userDAO.insert(user);
        user.setId(id);
        return user;
    }

    @Override
    public User findByName(String username) {
        return userDAO.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
