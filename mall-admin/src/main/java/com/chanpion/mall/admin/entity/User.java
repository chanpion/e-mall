package com.chanpion.mall.admin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @author April Chen
 * @date 2020/3/16 17:11
 */
@Data
public class User {
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private String email;
    private Date createTime;
    private Date updateTime;
}
