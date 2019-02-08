package com.ai.ms.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jason on 2019/2/8.
 */

@Controller
public class HomePageController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String getHomePage(){
        return "hello, this is homepage ...";
    }

    @RequestMapping(value = "/getDemo")
    @ResponseBody
    public String getDemo(){
        return "hello, this is a demo from microservice";
    }
}
