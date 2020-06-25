package com.ai.msdev.controller;

import com.ai.msdev.domain.Stock;
import com.ai.msdev.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@Component
public class HomeController {

    @Autowired
    StockService stockService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        System.out.println("ok");
        return "this is home";
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public String select(){
        System.out.println("get request --");
        List<Stock> stock =stockService.select();
        System.out.println(stock.size());
        System.out.println(stock.get(0).getCode());
        System.out.println(stock.get(0).getName());
        System.out.println(stock.get(1).getCode());
        System.out.println(stock.get(1).getName());
        return "OKOKOk";
    }

    @GetMapping(value = "encode")
    @ResponseBody
    public String encode(@RequestParam("text") String text){
        System.out.println("text: "+text);
        return text;
    }
}
