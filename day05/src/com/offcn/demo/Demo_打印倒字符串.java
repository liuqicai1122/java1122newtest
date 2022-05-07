package com.offcn.demo;

public class Demo_打印倒字符串 {
    public static void main(String[] args) {
        /*作业4: 打印倒直角三角形
         *****
         ****
         ***
         **
         *
        * */

        for (int i= 5; i>=1;i--){
            for(int x=1;x <= i; x++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
