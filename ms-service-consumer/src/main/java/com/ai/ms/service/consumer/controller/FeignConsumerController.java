package com.ai.ms.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason on 2019/2/8.
 */

@RestController
public class FeignConsumerController {

    @Autowired
    private ConsumerFeignClient consumerFeignClient;

    @GetMapping("/getDemoService")
    public String findHome(){
        return consumerFeignClient.getDemo();
    }

}
