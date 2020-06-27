package com.ai.ms.gateway.controller;

import com.ai.ms.gateway.entity.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        return "ok";
    }


    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody LoginUser user){
        System.out.println("username: "+user.getUsername());
        System.out.println("password: "+user.getPassword());
        return "ok";
    }

}
