package com.offcn.demo;

import java.util.Scanner;

public class Demo_案列5和7 {
    public static void main(String[] args) {
        //键盘输入一个数n 求n的阶乘
            int sum=1;
        Scanner sc =new Scanner( System.in) ;
        System.out.println("请输入一个数字");
            int num=sc.nextInt();


        for ( num = num; num >0 ; num--) {
           // System.out.println(num);
            sum = sum*num;

        }
        System.out.println(sum);



        //案列7  输出1到100之间能被3整除的数
        for (int x= 3; x<100  ; x +=3) {
            System.out.println(x);

        }


    }


}
