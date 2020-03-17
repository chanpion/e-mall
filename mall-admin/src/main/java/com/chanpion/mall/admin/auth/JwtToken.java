package com.chanpion.mall.admin.auth;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author April Chen
 * @date 2020/3/17 11:05
 */
public class JwtToken extends UsernamePasswordToken {
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }
}
