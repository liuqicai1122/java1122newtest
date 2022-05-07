package com.offcn.demo;
import java.util.Scanner;
import  java.util.Random;
public class Demo_随机数练习 {
    public static void main(String[] args) {
        /*猜数字小游戏 系统产生一个1到100之间的随机数,请猜出这个数  是多少3次机会
        *1系统生成
        *2 用户输出
        * 3比较
        * 4做其他功能
        * */
        //创建随机数对象
        Random ran = new Random();
        //调用方法生成一个一到100之间的数
        int numRan=ran.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int flag=0;
        while (true) {
            flag++;
            if (flag > 3) {
                System.out.println("您的机会已经用完了");
                break;


            }

            System.out.println("请输入要猜的数字");
            int inNum = sc.nextInt();
            if (inNum == numRan) {
                System.out.println("恭喜你这b猜对了");
                break;
            } else if (inNum < numRan) {
                System.out.println("您猜的数字小了,往大猜点");
            } else if (inNum > numRan) {
                System.out.println("您猜的数字大了,往小猜点");

            }



        }
    }

}


