package com.offcn.demo;

import java.util.Scanner;

public class Demo_if语句 {
    public static void main(String[] args) {
        //分支语句
        /* if (布尔表达式){
         *}
         *布尔类型表达式结果只能是true false
         * */
        //小毛参加考试,如果小毛成绩及格(>=60),则输出小毛考试成绩及格
        Scanner sc = new Scanner(System.in);//创建对象
        System.out.println("请输入小毛的成绩");
        int score = sc.nextInt();//调用方法
        if (score >= 60) {
            System.out.println("小毛的成绩及格");
        }
        if (score >= 60) System.out.println("小毛太秀了,重要及格了");
        System.out.println("奖励一拨");
        //以上是我们 不常用的形式 如果我们IF语句只有一行 {} 是可以省略的
        //以后我们书写的时候都要添加 {}  不添加 系统只会判定一行
        // 练习  假设修正 找出一下最大值
        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int max = num1;
        if (num2 > max) {
            max = num2;
            if (num3 > max) {
                max = num3;
            }
            System.out.println("三个数中的最大值:" + max);
        }
    }
}
