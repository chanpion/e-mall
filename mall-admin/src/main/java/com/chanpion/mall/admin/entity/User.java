package com.chanpion.mall.admin.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author April Chen
 * @date 2020/3/16 17:11
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
