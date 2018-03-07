package com.example.codingLibrary.calculator;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/26 14:51
 **/
public class OperationMul extends Operation {
    public double getResult() {
        return this.getNumberA() * this.getNumberB();
    }
}