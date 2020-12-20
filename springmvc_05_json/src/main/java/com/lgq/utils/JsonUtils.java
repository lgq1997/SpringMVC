package com.lgq.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author lgq
 * @create 2020-12-20-12:27
 */
public class JsonUtils {

    public static String getJson(Object obj){
        return getJson(obj,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object obj,String dateFormate){
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);//关闭时间戳方式
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormate);
        mapper.setDateFormat(sdf);//使用自定义日期的格式

        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
