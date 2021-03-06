package com.lgq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lgq
 * @create 2020-12-19-16:15
 */

@Controller
public class RestFulController {

    //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable  int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg",""+res);
        return "redirect:/hello";
    }

    @RequestMapping("/hello")
    public String test2(Model model){
        return "hello";
    }
}
