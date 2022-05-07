package com.offcn.demo;

import java.util.Scanner;//导包

public class Demo_if_else {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /* if(布尔类型表达式){
        为真的时候执行
        }else {
        为假的时候执行
        }
        *注意事项:语体一和语体2 都要提前准备好,
        但是他们两个不可能同时进行

        *
        * */
            //小王参加考试,考试成绩>=60 为及格 成绩<60不及格
         int num =sc .nextInt();
        if (num>=60){
            System.out.println("小王的成绩及格");
        }else {
            System.out.println("小王成绩不及格");
        }
    }
}
