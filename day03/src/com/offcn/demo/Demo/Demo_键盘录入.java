package com.offcn.demo.Demo;
//1. 导包
// 我们使用的    Scanner就在 java.util文件中
import  java .util.Scanner;



public class Demo_键盘录入 {
    public static void main(String[] args) {
        //2. 创建对象 ，我们需要使用这个Scanner 我们就要给他创造出来
        Scanner sc=new Scanner(System.in);
        //3。调用一个方法 nextInt();会返回一个int类型的数据
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

    }


}
