package com.ai.ms.service.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jason on 2019/2/12.
 */

@Controller
public class ReportPageController {

    @RequestMapping(value = "/report", method = RequestMethod.GET)
    public String getReportPage(){
        return "report";
    }

}
