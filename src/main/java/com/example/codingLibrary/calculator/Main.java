package com.example.codingLibrary.calculator;

/**
 * @author 王强
 * @version 创建时间：2017/07/27 12:17
 * Main
 **/
public class Main {
    public static void main(String[] args) {
        Operation operation = OperationEnumFactory.getOperation("+");
        operation.setNumberA(10);
        operation.setNumberB(20);
        double result = operation.getResult();
        System.out.println(result);
    }
}