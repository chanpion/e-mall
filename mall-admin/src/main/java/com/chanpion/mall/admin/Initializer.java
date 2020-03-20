package com.chanpion.mall.admin;

import com.chanpion.mall.admin.dao.MenuDAO;
import com.chanpion.mall.admin.dao.UserDAO;
import com.chanpion.mall.admin.entity.User;
import com.chanpion.mall.admin.service.MenuService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/19 15:44
 */
@Component
public class Initializer implements ApplicationRunner {
    @Resource
    private MenuDAO menuDAO;

    @Resource
    private MenuService menuService;

    @Resource
    private UserDAO userDAO;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Object menuTree = menuService.getMenuTree();
        System.out.println(menuTree);

        List<User> users = userDAO.findAll();
        users.forEach(user -> System.out.println(user.toString()));

    }
}
