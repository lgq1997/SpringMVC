package com.lgq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author lgq
 * @create 2020-12-19-21:08
 */

@Controller
public class EncodingController {

    @PostMapping("/e/t1")
    public String test1(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
