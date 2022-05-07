package com.offcn.demo;

import java.util.Scanner;

public class Demo_计数面积 {

    public static void main(String[] args) {
        System.out.println("计算面积");
        System.out.println("1.矩形    2.三角形   3.圆      4.退出");
        System.out.println("请选择数字对应功能:1.矩形 2.三角形 3.圆 4.退出");
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         switch (num){
             case 1:
                 System.out.println("您选择了矩形");
                 System.out.println("请输入矩形的宽");
                 int s =sc.nextInt();
                 System.out.println("请输出矩形的长");
                 int n = sc.nextInt();
                 System.out.println("矩形的面积为:"+ s*n);
                 break;
             case 2:
                 System.out.println("您选择了三角形");
                 System.out.println("请输入三角形的底");
                s =sc.nextInt();
                 System.out.println("请输入三角形的高");
                 n = sc.nextInt();
                 System.out.println("三角形的面积为:"+(s*n)/2);
                 break;
             case 3:
                     System.out.println("您选择了圆形");
                 System.out.println("请输入圆形的半径");
                 s =sc.nextInt();
                 System.out.println("圆形的面积为:"+(3.14*s*s));
                     break;
             case 4:
                 System.out.println("退出");
                 break;

         }
    }
}
