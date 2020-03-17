package com.chanpion.mall.admin.service;

import com.chanpion.mall.admin.dao.MenuDAO;
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

}
