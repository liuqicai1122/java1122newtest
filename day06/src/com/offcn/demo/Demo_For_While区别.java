package com.offcn.demo;

public class Demo_For_While区别 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            System.out.println("我爱学习");
            
        }
    //for 循环之后 初始化变量就不能重复使用 因为在for里面定义的 只能在for作用域使用
            int num =1;
            while (num<=10){
                System.out.println("hello world");
             num++;
            }
        System.out.println(num);
    //while 死循环
        // while(true){
        //
        // }


    }
}
