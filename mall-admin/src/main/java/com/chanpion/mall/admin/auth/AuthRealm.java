package com.chanpion.mall.admin.auth;

import com.chanpion.mall.admin.dao.UserDAO;
import com.chanpion.mall.admin.entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/3/16 19:26
 */
public class AuthRealm extends AuthorizingRealm {
    @Resource
    private UserDAO userDAO;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String username = (String) principalCollection.getPrimaryPrincipal();
        User user = userDAO.findByUsername(username);
        //todo  find roles and permissions
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        User user = userDAO.findByUsername(username);
        if (user == null) {
            return null;
        }
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUsername());
        return new SimpleAuthenticationInfo(username, user.getPassword(), credentialsSalt, getName());
    }

    @Override
    public boolean isPermitted(PrincipalCollection principals, String permission) {
        String username = (String) principals.getPrimaryPrincipal();
        return "admin".equals(username) || super.isPermitted(principals, permission);
    }


    @Override
    public boolean hasRole(PrincipalCollection principal, String roleIdentifier) {
        String username = (String) principal.getPrimaryPrincipal();
        return "admin".equals(username) || super.hasRole(principal, roleIdentifier);
    }
}
