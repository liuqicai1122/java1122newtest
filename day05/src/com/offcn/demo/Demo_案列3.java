package com.offcn.demo;

import java.util.Scanner;

public class Demo_案列3 {
    public static void main(String[] args) {
        /*模拟用户登录界面,正确用户名为123,密码 456
        通过键盘录入  登录所需的用户名和密码 如果数据输入正确 ,则登录成功
        *如果输入数据有误,支持 无限输入 直到登录成功为止
        *
        * */
        int     username=123;
        int     pass=456;
        Scanner sc=new Scanner(System.in);
        for(; ;){

            System.out.println("请输入用户名");
            int inName=sc.nextInt();
            System.out.println("请输入密码");
            int     inPass=sc.nextInt();
            if(inName==username && inPass==pass){
                System.out.println("恭喜您登录成功");
                break;
            }else {
                System.out.println("您输入的用户名或密码有误,请重新输入");

            }
        }
        System.out.println("欢迎来到");




    }
}
