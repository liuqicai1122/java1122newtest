package com.offcn.demo;

public class Demo_循环案列1嵌套 {
    public static void main(String[] args) {

        //跳绳 一共跳5组 每组跳10个
        //5组就是外循环 10个就是内循环
        for(int i = 1; i<=5; i++){
            for (int num =1 ; num<=10;num++)
                System.out.println("第"+i+"组跳了"+num+"下");

        }
        /*int i =1 循环开始了 判断 i<=5 true
        执行循环语句 就是另外内层循环 要符合循环执行流程

        *int num= 1  内层循环开始 num<=10 为true
        *执行以下语句 第一组跳了 第一下
       之后num ++ 2<=10
       接着执行语句第一组跳了2下
        *直到num为11 为false 执行外层循环 i++ i=2 <= 5
        返回内层 执行 第一遍出来结果就是 第二组跳了 第1下....
        * */
    }


}
