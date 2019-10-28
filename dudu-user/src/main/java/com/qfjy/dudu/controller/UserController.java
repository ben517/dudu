package com.qfjy.dudu.controller;


import com.qfjy.dudu.pojo.User;
import com.qfjy.dudu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Autowired
    UserService userService;
    @Value("${server.port}")
    private String server_port;

    @RequestMapping("getuser")
    @ResponseBody
    public User getUser(@RequestParam("id") Integer id){

        User user = userService.selectByPrimaryKey(id);
        user.setProvince(server_port);
        System.out.println(user);
        return  user;
    }

}
