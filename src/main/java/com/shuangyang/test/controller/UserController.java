package com.shuangyang.test.controller;

import com.shuangyang.test.bean.User;
import com.shuangyang.test.service.UserService;
import com.shuangyang.test.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 罗高杨 on 2017-7-11.
 */
@Controller
public class UserController {
  @Autowired
  private UserService userService;
  
  @Autowired
  private UserServiceImpl userServiceImpl;

  @RequestMapping("/user")
  @ResponseBody
  public List<User> findUsers(){
    List<User> list = null;
    try {
      list = userServiceImpl.findUsers();
    }catch (Exception e){
    	e.printStackTrace();
    }
    System.out.println(list.toString());
    
    return list;
  }
}
