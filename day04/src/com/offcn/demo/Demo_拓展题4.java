package com.offcn.demo;

import java.util.Scanner;

public class Demo_拓展题4 {
    public static void main(String[] args) {
        //(1)打印1到100之内的整数，但数字中包含9的要跳过
        //	(2)每行输出5个满足条件的数，之间用空格分隔

        Scanner sc = new Scanner(System.in);
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 9 && i / 10 % 10 != 9) {
                System.out.print(i + "\t");
                x++;
                if (x % 5 == 0) {
                    System.out.println();

                }
            }
        }
    }
}
