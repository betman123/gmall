package com.atguigu.gamll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello spring world";
    }
}
