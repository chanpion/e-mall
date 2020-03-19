package com.chanpion.mall.admin.controller;

import com.chanpion.mall.admin.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/3/17 15:58
 */
@RestController
@RequestMapping(value = "/api/menus", method = {RequestMethod.GET, RequestMethod.POST})
public class MenuController {

    @Resource
    private MenuService menuService;

    @RequestMapping("/tree")
    public Object getMenuTree() {

        return new ResponseEntity<>(menuService.getMenuTree(), HttpStatus.OK);
    }

//    @RequestMapping("/build")
    public Object getMenus() {
        return new ResponseEntity<>(menuService.getMenuTree(), HttpStatus.OK);
    }
}
