package com.offcn.demo;

import java.util.Scanner;

public class Demo_扩展作业1 {
    public static void main(String[] args) {
        /*（if 语句）键盘输入一个整数，表示一个人的年龄。
如果小于6 岁，则输出“儿童”，
 6 岁到13 岁，输出 “少儿”；
 14 岁到18 岁，输出 “青少年”；
 18 到35 岁，输 出“青年”；
 35 岁到50 岁，输出 “中年”；
 50 岁以上输出 “中老年
        *
        * */
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个人的年龄");
                int i=sc.nextInt();
            if(i>=6&& i<=13) {
                System.out.println("儿童");
            }else if(i>=14&i<=18){
                System.out.println("青年");
            }else if (i>=35&i<=50){
                System.out.println("中年");
            }else if (i>50&i<140) {
                System.out.println("中老年");
            }else {
                System.out.println("您输入有误,请重新输入");
            }

        }


    }


