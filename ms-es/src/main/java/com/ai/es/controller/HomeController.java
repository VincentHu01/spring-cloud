package com.ai.es.controller;

import com.ai.es.domain.Stock;
import com.ai.es.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    StockService stockService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "this is home";
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public String select(){
        System.out.println("get request");
        Stock stock =stockService.select();
        System.out.println(stock.getCode());
        System.out.println(stock.getName());
        return "OKOKOk";
    }
}
