package com.offcn.demo;

public class Demo_案列1 {
    public static void main(String[] args) {
        //案列1 打印1到10个数 遇到4的倍数程序自动退出
        //退出就是结束程序的意思
        for (int i =1 ; i<=10; i++){
            System.out.println(i);
            if (i%4==0){
                 break;
            }
        }

    }
}
