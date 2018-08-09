package com.kyle.olddriver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kyle.LJ
 * @Title: homeController
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/3上午10:25
 */

@Controller
public class homeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }


}
