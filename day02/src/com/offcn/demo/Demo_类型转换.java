package com.offcn.demo;

public class Demo_类型转换 {
    public static void main(String[] args) {
        //自动转换数据 小数据到大数据是安全的
        byte x= 111;
        int x2=x;
        System.out.println(x2);
        //强制类型转换 大数据转小数据 不安全
        int x3=4444;
        byte x4=(byte)x3;
        System.out.println(x4);
        //强制类型转换 格式  小数据类型 变量名= (小数据类型）变量名
            int x5=123;
        byte x6=(byte)x5;
        System.out.println(x6
        );

    }
}
