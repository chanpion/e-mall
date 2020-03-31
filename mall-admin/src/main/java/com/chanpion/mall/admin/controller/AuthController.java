package com.chanpion.mall.admin.controller;

import com.chanpion.mall.admin.auth.EncryptUtil;
import com.chanpion.mall.admin.auth.JwtUtil;
import com.chanpion.mall.admin.model.BaseResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.subject.Subject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author April Chen
 * @date 2020/3/28 13:55
 */
@RestController
public class AuthController {


    @RequestMapping("/login")
    public BaseResponse login(String username, String password, @RequestParam(required = false, defaultValue = "false") Boolean rememberMe, HttpServletResponse response) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            return new BaseResponse(-1, "账号不存在！");
        } catch (IncorrectCredentialsException e) {
            return new BaseResponse(-1, "密码错误！");
        } catch (LockedAccountException e) {
            return new BaseResponse(-1, "账号被锁定！");
        } catch (DisabledAccountException e) {
            return new BaseResponse(-1, "账号被禁用");
        } catch (UnauthenticatedException e) {
            return new BaseResponse(-1, "未授权");
        } catch (AuthenticationException e) {
            return new BaseResponse(-1, e.getMessage());
        }
        String encryptPassword = EncryptUtil.encrypt(password, username);
        String jwtToken = JwtUtil.sign(username, encryptPassword);
        response.setHeader(JwtUtil.JWT_TOKEN_HEADER, jwtToken);
        Cookie cookie = new Cookie((JwtUtil.JWT_TOKEN_HEADER), jwtToken);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new BaseResponse();
    }

    @GetMapping(value = "/logout")
    public ResponseEntity<Void> logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.getPrincipals() != null) {
            //todo
        }
        SecurityUtils.getSubject().logout();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/toLogin")
    public BaseResponse toLogin(){
        return new BaseResponse("to login");
    }
}
