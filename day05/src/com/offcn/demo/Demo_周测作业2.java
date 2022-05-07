package com.offcn.demo;

import java.util.Scanner;

public class Demo_周测作业2 {
    public static void main(String[] args) {
        /*用户输入一个月份和一个年份 输出该月有多少天
         * 提示;需要判断输入的年份是一个平年还是闰年(以下俩条件需要同时满足)
         * 1 能被4整除而不能被100整除
         * 2 能被100整除也能被400整除
         * 平年和闰年 1 3 5 7 8 10 12各位31天, 4 6 9 11各为30天
         * 平年2月 28天 闰年 2月29天            *
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个月份");//我们先定义好变量
        int num = sc.nextInt();
        System.out.println("请您输入一个年份");
        int i = sc.nextInt();
          //将相同的月份都列举出来
            switch (num) {
                case 1:
                    System.out.println("31");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 7:
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 12:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 6:
                    System.out.println("30");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 2://二月份是特别的 我们把满足闰年的列出来
                    if((i%4==0 && i%100 != 0) ||(i%100==0 && i%400==0) ){
                        System.out.println("29");
                    }else{
                        System.out.println("28");//不满足闰年的2月份输出28
                    }
                    break;
            }


    }


}


