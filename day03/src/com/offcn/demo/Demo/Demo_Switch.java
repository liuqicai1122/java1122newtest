package com.offcn.demo.Demo;

import java.util.Scanner;

public class Demo_Switch {
    public static void main(String[] args) {
        /*switch(表达式){
        case 常量值1:
        输出语句1;
        break ;
        case 常量值2:
        输出语句2;
        break;
        ''''
        default:
        输出语句 n+1
        break;
       }
        *switch 中常用的关键词 switch case break default
        表达结果是一个具体的数值        要分别与下面case后面的常量对比 对应成功 就执行相关语句
        如果都对应不上 就执行default里面的语句
        switch 表达的值只可以是 byte int short char enum枚举 jdk7 开始  可以是字符串

        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入1-7数字");
          int num=    sc . nextInt();
          switch (num ){
              case 1:
                  System.out.println("星期一");
                  break;
              case 2:
                  System.out.println("星期二");
                  break;
               case  3:
               System.out.println("星期3");
               break;
              case 4:
                  System.out.println("星期四");
                  break;
                case 5:
                System.out.println("星期五");
                break;
              case 6:
              System.out.println("星期6");
              break;
              case 7:
                  System.out.println("星期天");
                  break;
              default:
                  System.out.println("憨怂");
                  break;
          }


    }
}
