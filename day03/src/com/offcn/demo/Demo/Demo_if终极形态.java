package com.offcn.demo.Demo;

import java.util.Scanner;

public class Demo_if终极形态 {
    public static void main(String[] args) {

        /*if(布尔表达式){
        }else if(布尔表达式){
        }....
       else
        * */
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num=sc.nextInt();
        if (num==1){
            System.out.println("今天是星期一");
        }else if(num==2){
            System.out.println("今天是星期二");
        }else if (num==3){
            System.out.println("今天是星期三");
        }else if(num==4) {
            System.out.println("今天是星期4");
        }else if(num==5) {
            System.out.println("今天是星期5");
        }else if(num==6){
            System.out.println("今天是星期6");
        }else if (num==7){
            System.out.println("今天是星期天");
        }else {
            System.out.println("您输入的数字有误" );
        }


    }


}
