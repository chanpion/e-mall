package com.chanpion.mall.admin.auth;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author April Chen
 * @date 2020/3/17 11:07
 */
@Slf4j
public class JwtFilter extends AuthenticatingFilter {

    /**
     * 允许匿名访问
     */
    private boolean anonymous = false;

    public JwtFilter() {
        this(false);
    }

    public JwtFilter(boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest =  WebUtils.toHttp(request);
        String jwtToken = httpServletRequest.getHeader(JwtUtil.JWT_TOKEN_HEADER);
        if (StringUtils.isBlank(jwtToken)) {
            Cookie[] cookies = httpServletRequest.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(JwtUtil.JWT_TOKEN_HEADER)) {
                    jwtToken = cookie.getValue();
                    break;
                }
            }
        }
        if (StringUtils.isNotBlank(jwtToken) && !JwtUtil.isTokenExpired(jwtToken)) {
            return new JwtToken(jwtToken,request.getRemoteHost());
        }
        return null;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if (anonymous || isLoginRequest(request, response)) {
            return true;
        }
        Subject subject = getSubject(request, response);
        if (subject.getPrincipal() != null) {
            return true;
        }
        try {
            return executeLogin(request, response) && super.isAccessAllowed(request, response, mappedValue);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        super.saveRequestAndRedirectToLogin(request, response);
        return false;
    }

}
