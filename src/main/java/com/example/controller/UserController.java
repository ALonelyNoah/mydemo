package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index.action")
    public ModelAndView index(){
        System.out.println("Now is at index.html.");

        return new 	ModelAndView("redirect:index.html");
    }

    //注册
    @RequestMapping("register.action")
    public ModelAndView register(User user){
        System.out.println(user.getUsername()+"---"+user.getPassword());
        userRepository.save(user);
        return new ModelAndView("redirect:/index.action");

    }

    //登录
    @RequestMapping("login.action")
    public ModelAndView login(User user){
        User loginUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        System.out.println("Now logining...");
        if(loginUser==null){
            System.out.println("not found");
            return new ModelAndView("redirect:/index.action");
        }else{
            return new ModelAndView("redirect:welcome.html");
        }

    }
}
