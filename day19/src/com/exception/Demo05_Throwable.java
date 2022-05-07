package com.exception;

import java.util.Scanner;

public class Demo05_Throwable {
    public static void main(String[] args) {
        //Throwable是所有异常和错误的爹
        //Throwable 构造一个将null作为其详细信息的新throwable
        Throwable t1=new Throwable();
        //Throwable (String message)构造带指定详细信息的新throwable
        Throwable t2=new Throwable("是所有异常和错误的爹");

        //1.    toString()输出该异常的类名
        //如果构造传入的有String message同样也会打印出来
     //   String s = t2.toString();
       // System.out.println(s);

        System.out.println(10/0);

        //2.getMessage()输出异常的信息 ,需要通过构造方法传入异常方法(列如病态信息)
        String message = t2.getMessage();
        System.out.println(message);//是所有异常和错误的爹

        //3. printStackTrace()打印信息
        //t2.printStackTrace();
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();

    }
}
