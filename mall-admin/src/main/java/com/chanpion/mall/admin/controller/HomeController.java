package com.chanpion.mall.admin.controller;

import com.chanpion.mall.admin.model.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author April Chen
 * @date 2020/3/30 15:08
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public BaseResponse index() {
        return new BaseResponse("home page");
    }
}
