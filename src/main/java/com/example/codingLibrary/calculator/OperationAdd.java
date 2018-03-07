package com.example.codingLibrary.calculator;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/26 14:41
 * OperationAdd
 **/

/***
 * 加法
 */
public  class OperationAdd extends Operation {
    public double getResult() {
        return this.getNumberA() + this.getNumberB();
    }
}