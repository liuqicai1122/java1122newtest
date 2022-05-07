package com.offcn.demo;

public class Demo_输出图形 {
    //输出99乘法表
    //我 们需要使用嵌套循环,一行一行的是外循环
    public static void main(String[] args) {


        for (int i =1; i<=9; i++){
            for(int num=1 ;num<= i; num++){

                System.out.print(num+"*"+i+"="+(num*i)+"  ");
            }
            System.out.println();

        }

    }
}
