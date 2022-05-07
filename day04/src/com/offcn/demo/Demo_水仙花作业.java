package com.offcn.demo;

import java.util.Scanner;

public class Demo_水仙花作业 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入数字");
        int i=sc.nextInt();
        int num1= i/100; //百
        int num2 = i/10%10; //shi
        int num3 = i%10;
        if (i==(num1*num1*num1+num2*num2*num2+num3*num3*num3)){
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是");
        }

    }
}
