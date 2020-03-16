package com.chanpion.mall.admin.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author April Chen
 * @date 2020/3/16 19:58
 */
@Data
public class Role {
    private Long id;
    private String name;
    private String description;
    private Date createTime;
    private Date updateTime;
}
