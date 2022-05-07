package com.offcn.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo_随机数练习2 {
    public static void main(String[] args) {
        Random ran= new Random();
        Scanner sc = new Scanner(System.in);
        int numRan=ran.nextInt(100)+1;
        int flag=0;
        for (; ;){
            flag++;
            if(flag>3){
                System.out.println("你的三次次数用完了,给你机会你不中用啊");
                break;
            }
            System.out.println("请输入你要猜的数字");
            int upNum=sc.nextInt();
            if (upNum == numRan){
                System.out.println("恭喜你这傻逼猜对了");
                break;
            }else if (upNum>numRan){
                System.out.println("你输入的数字大了,能小一点吗?憨憨");
            }else if (upNum<numRan){
                System.out.println("你输入的数字小了憨怂" );
            }


        }
    }
}
