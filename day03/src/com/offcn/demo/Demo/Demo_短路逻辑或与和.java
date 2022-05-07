package com.offcn.demo.Demo;

public class Demo_短路逻辑或与和 {
    public static void main(String[] args) {
        // & 普通的与  两边   代码无论真假都会执行
        //&& 短路逻辑 与  如果前面为假 后面的无论真假都不会执行
        int x = 5;
        int x1=6;
        int x2=7;
        int x3= 11;
        System.out.println(x<x1 & x2++> x3); //ture
        System.out.println(x>x1 && x2++ <x3);
        //短路逻辑 或 || 全假 为假  如果表达式的前面为真 后面不管真假都不在执行了
        //   作业  提高了代码运行效率 节省时间



    }
}
