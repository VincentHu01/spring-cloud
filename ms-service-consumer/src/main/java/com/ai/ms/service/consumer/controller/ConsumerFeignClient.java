package com.ai.ms.service.consumer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jason on 2019/2/8.
 */

@FeignClient(name = "ms-service")
public interface ConsumerFeignClient {

    @RequestMapping(value = "/getDemo",method = RequestMethod.GET)
    public String getDemo();
}
