package com.lgq.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lgq
 * @create 2020-12-19-13:48
 */

@Controller //自动被spring扫描到了，就不需要手动配置bean了，且不需要再继承Controller接口
public class HelloController {

    @RequestMapping("/hello") //让url的/hello请求
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","hello springMVC");
        //返回视图
        return "hello"; //会被视图解析器处理，加上前缀后缀，跳到hello.jap页面
    }

}


