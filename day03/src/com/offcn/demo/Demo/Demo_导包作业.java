package com.offcn.demo.Demo;
 import java.util.Scanner;

public class Demo_导包作业 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入5位数数字");
            int i = sc .nextInt();
                int h = i/10000;
                int j = i/1000%10;
                int k = i/100%10;
                int l = i/10%10;
                int g =i%10;
        System.out.println("五位整数各个位上的和为"+ (h+j+k+l+g));

    }

}
