package com.offcn.demo;

import java.util.Scanner;

public class Demo_年份联系 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入年份");
        int num=sc .nextInt();
        if((num%4==0  &&  num%10!=0) || (num%400==0)){
            System.out.println("这个年份为闰年");
        }else{
            System.out.println("这个年份不是闰年");
        }


    }



}
