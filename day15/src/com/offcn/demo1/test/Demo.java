package com.offcn.demo1.test;

public class Demo {
     final int a = 10;
}

class Test{
    public static void main(String[] args) {
        Demo d = new Demo();
        d = new Demo();

        System.out.println(d.a);
    }








}
