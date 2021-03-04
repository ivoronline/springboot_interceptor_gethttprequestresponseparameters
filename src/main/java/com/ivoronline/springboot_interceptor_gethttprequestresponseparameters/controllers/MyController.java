package com.ivoronline.springboot_interceptor_gethttprequestresponseparameters.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    System.out.println("Controller:");
    return "Hello from Controller";
  }

}
