package com.chanpion.mall.admin.auth;

import org.apache.shiro.authc.HostAuthenticationToken;

/**
 * @author April Chen
 * @date 2020/3/17 11:05
 */
public class JwtToken implements HostAuthenticationToken {
    private final String token;
    private String host;

    public JwtToken(String token) {
        this(token, null);
    }

    public JwtToken(String token, String host) {
        this.token = token;
        this.host = host;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public String getHost() {
        return host;
    }
}
