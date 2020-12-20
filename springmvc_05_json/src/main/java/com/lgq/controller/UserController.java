package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lgq.pojo.User;
import com.lgq.utils.JsonUtils;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lgq
 * @create 2020-12-19-22:07
 */

//@Controller
@RestController //表示这个类下边所有的方法都不走视图解析器
public class UserController {

    //测试返回一个对象字符串
    @RequestMapping(value = "/j1")
//    @ResponseBody //这个注解表示该方法不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User(23,"lgq","女");
        //把一个对象变成字符串
        String str = mapper.writeValueAsString(user);

        return str; //返回一个字符串给前端
    }

    //返回一个对象集合字符串
    @RequestMapping(value = "/j2")
    public String json2() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //对象的集合
        List<User> list = new ArrayList<>();
        User user1 = new User(23,"lgq1","女");
        User user2 = new User(23,"lgq2","女");
        User user3 = new User(23,"lgq3","女");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //把一个对象变成字符串
        String str = mapper.writeValueAsString(list);

        return str; //返回一个字符串给前端
    }


    //返回一个对象集合
    @RequestMapping(value = "/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();

        return JsonUtils.getJson(date); //返回一个字符串给前端
    }

    //使用fastjson
    @RequestMapping(value = "/j4")
    public String json4() throws JsonProcessingException {
        List<User> list = new ArrayList<>();
        User user1 = new User(23,"lgq1","女");
        User user2 = new User(23,"lgq2","女");
        User user3 = new User(23,"lgq3","女");
        list.add(user1);
        list.add(user2);
        list.add(user3);


        String res = JSON.toJSONString(list);

        return res; //返回一个字符串给前端
    }
}
