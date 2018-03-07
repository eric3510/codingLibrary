package com.example.codingLibrary.annotation;

import javax.annotation.Resource;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/28 17:11
 * Testable
 **/
public class Testable {
    @Resource
    Model model;

    public static void main(String[] args) {
        Resource.AuthenticationType.valueOf("model");

    }
}