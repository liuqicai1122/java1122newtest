package com.offcn.demo;

public class Demo_案列4求和 {
    public static void main(String[] args) {

        int num=0;


        for (int i = 1; i <=100 ; i++) {
           // System.out.println(i);
            num = i + num;
           // System.out.println(num);
        }
        System.out.println(num);

    }
}
