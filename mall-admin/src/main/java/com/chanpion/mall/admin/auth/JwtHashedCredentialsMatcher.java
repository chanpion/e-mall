package com.chanpion.mall.admin.auth;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

/**
 * @author April Chen
 * @date 2020/3/30 15:22
 */
public class JwtHashedCredentialsMatcher extends HashedCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo info) {
        if (authenticationToken instanceof JwtToken) {
            String token = (String) authenticationToken.getCredentials();
            String username = (String) info.getPrincipals().getPrimaryPrincipal();
            String password = info.getCredentials().toString();
            return JwtUtil.verify(token, username, password);
        }
        return super.doCredentialsMatch(authenticationToken, info);
    }
}
