package com.zm.controller;

import com.zm.model.User;
import com.zm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //用户service
    @Resource
    private UserService userService;

    @RequestMapping("/show")
    public ModelAndView show(ModelAndView modelAndView ,String id){
        System.out.println(id);
        User user = userService.getUserById(id);
        modelAndView.getModel().put("user" , user);
        modelAndView.setViewName("user");
        return modelAndView;
    }

}
