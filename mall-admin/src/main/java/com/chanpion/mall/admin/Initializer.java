package com.chanpion.mall.admin;

import com.chanpion.mall.admin.dao.MenuDAO;
import com.chanpion.mall.admin.service.MenuService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Object menuTree = menuService.getMenuTree();
        System.out.println(menuTree);

    }
}
