package com.offcn.demo;

import java.util.Scanner;

public class Demo_拓展作业2 {
    public static void main(String[] args) {
        /*、使用switch语句完成如下需求
   某学员考试名次决定奖励，奖励机制如下：
   第1名 参加麻省理工大学组织的1个月夏令营
   第2名 奖励苹果笔记本电脑一部
   第3名 奖励移动硬盘一个
   其他名次   没有奖励 （注：键盘输入获得名次。相应奖励，在控制台输出即可

        * */
        Scanner sc= new Scanner(System.in);
        System.out.println("同学请输入你的获奖名次");
         int num=sc .nextInt();
        switch (num){
            case 1 :
                System.out.println("参加麻神理工大学组织的一个月夏令营");
                break;
            case 2 :
                System.out.println("奖励苹果笔记本电脑一部");
              break;
            case 3:
                System.out.println("奖励移动硬盘一个");
            default:
                System.out.println("没有奖励");
        }
    }
}
