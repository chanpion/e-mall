package com.chanpion.mall.admin.controller;

import com.chanpion.mall.admin.entity.User;
import com.chanpion.mall.admin.model.BaseResponse;
import com.chanpion.mall.admin.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/28 14:29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/register")
    public BaseResponse register(User user) {
        if (StringUtils.isBlank(user.getUsername())) {
            return new BaseResponse(-1, "用户名不能为空！");
        }
        if (StringUtils.isBlank(user.getPassword())) {
            return new BaseResponse(-1, "密码不能为空！");
        }
        if (userService.findByName(user.getUsername()) != null) {
            return new BaseResponse(-1, "用户名已存在！");
        }
        userService.create(user);
        return new BaseResponse();
    }

    @RequestMapping("/list")
    public BaseResponse list() {
        List<User> users = userService.findAll();
        return new BaseResponse(users);
    }
}
