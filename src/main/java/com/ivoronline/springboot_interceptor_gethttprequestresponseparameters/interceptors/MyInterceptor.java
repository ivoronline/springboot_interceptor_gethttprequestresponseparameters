package com.ivoronline.springboot_interceptor_gethttprequestresponseparameters.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {

  //====================================================================
  // PRE HANDLE
  //====================================================================
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    System.out.println("MyInterceptor: preHandle()       ");
    System.out.println(request.getMethod    ());          //GET
    System.out.println(request.getProtocol  ());          //HTTP/1.1
    System.out.println(request.getServerName());          //localhost
    System.out.println(request.getServerPort());          //8080
    System.out.println(request.getParameter("username")); //myuser
    return true;
  }

  //====================================================================
  // AFTER COMPLETION
  //====================================================================
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
    System.out.println("MyInterceptor: afterCompletion() ");
    System.out.println(response.getStatus());
  }

}
