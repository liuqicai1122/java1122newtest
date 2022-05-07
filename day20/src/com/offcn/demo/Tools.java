package com.offcn.demo;

import java.math.BigDecimal;

public class Tools {
    //2、编写一个工具类，定义四个方法，
    // 加、减、乘、除操作。要求浮点精确运算。
    public static void main(String[] args) {
        System.out.println(jia(321, 312));//输入两个想输入的值
        System.out.println(jian(3.22 ,2.11));//输入两个想输入的值
        System.out.println(cheng(3.2, 4.2));//输入两个想输入的值
        System.out.println(chu(4.1, 2.2));//输入两个想输入的值

    }
            public  static BigDecimal jia(double i,double b){
                        BigDecimal ii=new BigDecimal(i);
                        BigDecimal bb=new BigDecimal(b);
                    BigDecimal big =ii.add(bb);
                     return  big;
            }
            public  static  BigDecimal jian(double i,double b){
                BigDecimal ii=new BigDecimal(i);
                BigDecimal bb=new BigDecimal(b);
                BigDecimal big=ii.subtract(bb);
                    return  big;
            }
            public  static  BigDecimal cheng(double i,double b){
                BigDecimal ii=new BigDecimal(i);
                BigDecimal bb=new BigDecimal(b);
              BigDecimal big=ii.multiply(bb);
                return big;
            }
            public  static  BigDecimal chu(double i,double b){
                BigDecimal ii=new BigDecimal(i);
                BigDecimal bb=new BigDecimal(b);
                BigDecimal big=ii.divide(bb,BigDecimal.ROUND_HALF_UP);
                return  big;
            }
}
