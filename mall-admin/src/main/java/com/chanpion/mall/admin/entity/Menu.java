package com.chanpion.mall.admin.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author April Chen
 * @date 2020/3/16 20:30
 */
@Data
public class Menu {
    private Long id;
    private String name;
    private String path;
    private Long pid;
    private String icon;
    private String component;
    private Date createTime;
    private Date updateTime;
    private List<Menu> children;
}
