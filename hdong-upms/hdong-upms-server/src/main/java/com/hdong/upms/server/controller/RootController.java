package com.hdong.upms.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hdong.common.base.BaseController;
/**
 * 拦截根目录请求，如果有session，直接进入主页，否则进入登录页面
 * @author Administrator
 *
 */
@Controller
public class RootController extends BaseController {
  public static boolean hasSession = false;
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String checkSession(HttpServletRequest request) {
    if(hasSession) {
      return "/index.jsp";
    }else {
      return "/sso/login.jsp";
    }
  }
}
