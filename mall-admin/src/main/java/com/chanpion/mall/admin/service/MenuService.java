package com.chanpion.mall.admin.service;

import com.chanpion.mall.admin.dao.MenuDAO;
import com.chanpion.mall.admin.entity.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/17 13:25
 */
@Service
public class MenuService {

    @Resource
    private MenuDAO menuDAO;


    public List<Menu> getMenuTree() {
        List<Menu> rootMenus = menuDAO.findByPid(0L);
        return getMenuTree(rootMenus);
    }

    private List<Menu> getMenuTree(List<Menu> menus) {
        menus.forEach(menu -> {
                    List<Menu> menuList = menuDAO.findByPid(menu.getId());
                    if (menuList != null && !menuList.isEmpty()) {
                        menu.setChildren(getMenuTree(menuList));
                    }
                }
        );
        return menus;
    }
}
