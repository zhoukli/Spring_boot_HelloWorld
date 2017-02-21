package com.spring.boot.controller;

import com.spring.boot.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhoukaili on 17/2/20.
 */

@Controller
public class TestController {
//    @Autowired
//    WiselySettings wiselySettings;
////    @Autowired
////    Wisely2Settings wisely2Settings;
//
//
//    @RequestMapping("/test")
//    public @ResponseBody
//    String test(){
//        System.out.println(wiselySettings.getGender()+"---"+wiselySettings.getName());
////        System.out.println(wisely2Settings.getGender()+"==="+wisely2Settings.getGender());
//        return "ok";
//    }

    @Autowired
    BlogProperties blogProperties;
    @RequestMapping("/test2")
    public @ResponseBody
    String test1(){
        System.out.println(blogProperties.getName());
        return blogProperties.getName();
    }
}