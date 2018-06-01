package com.client.controller;

import com.client.model.City;
import com.client.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RestController  //该注解相当于:@RequestMapping+@ResponseBody
@RequestMapping("/")
public class HelloController {

    @Autowired
    private CityService service;

    @RequestMapping("find")
//    @ResponseBody
    public String findAll(ModelMap model){

        List<City> all = service.findAll();
        model.addAttribute("all",all);
        return "hello";
    }

    @RequestMapping("hello1")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}