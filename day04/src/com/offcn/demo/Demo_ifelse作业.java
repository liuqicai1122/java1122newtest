package com.offcn.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Demo_ifelse作业 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄");
         int i   =sc .nextInt();

        if (i>=18){
            System.out.println("您可以通过");
        }
        System.out.println("请输入您的成绩");
        int num  =sc .nextInt();
        if (num>=90&& num<=100){
            System.out.println("您的成绩为优秀");
        }else if (num>=70&& num<90){
            System.out.println("您的成绩为良好");
        }else if (num>=60 && num<=70){
            System.out.println("您的成绩为及格");

            }else if  (num >=0 && num<60){
            System.out.println("您的成绩为 不及格");
        }else {
            System.out.println("您输出的成绩错误");
        }

        }

    }

