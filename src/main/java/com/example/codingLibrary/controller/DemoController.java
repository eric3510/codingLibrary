package com.example.codingLibrary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author 王强 Email : wangqiang@hushijie.com.cn
 * @version 创建时间：2018/3/7
 * DemoController
 */
@RestController
public class DemoController{
    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }
}
