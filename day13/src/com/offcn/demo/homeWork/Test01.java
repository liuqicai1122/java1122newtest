package com.offcn.demo.homeWork;

public class Test01 {
    public static void main(String[] args) {
        Demo01 i= new Demo01();
        System.out.println(i.circleChang(5));
       // System.out.println(i.circleArea(5));这个会报错 因为无返回值类型 不能用SOUT打印
        Demo01.circleArea(5);
        System.out.println(Demo01.circleChang(4));


    }
}
