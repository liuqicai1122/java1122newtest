package com.offcn.demo.Demo;
import  java.util.Scanner;
public class Demo_DAFWAF {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i = sc.nextInt();
        int num1 = i/10000;  //万位


        int num2 = i/1000%10; //千位

        System.out.println("千万位数字相加:"+(num1+num2))
        ;



    }
}
