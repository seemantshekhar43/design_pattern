package com.seemantshekhar.design_pattern;

public class Calculator {

//    public int calculate(int a, int b, String operationType){
//        switch (operationType){
//            case "ADD": return a+b;
//            case "SUBTRACT": return a-b;
//            case "MULTIPLY": return a*b;
//            default: return -1;
//        }


    public int calculate(int a, int b, Operation operation){
        return operation.operate(a, b);
    }
}
