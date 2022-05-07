package com.offcn.demo.Demo;

public class Demo_char在分支中的应用 {

    public static void main(String[] args) {

        //列如实现简单的加减乘除
        double num1 = 10;
        double num2= 5;
        char n= '*';
        switch (n){
            case '+':
                System.out.println("两个数相加为"+ (num1+num2));
                break;
            case '-':
                System.out.println("两个数相减为"+(num1-num2));
                break;
            case '*':
                System.out.println("两个数相乘为"+(num1*num2));
                break;
            case '/':
                System.out.println("两个数相除为"+(num1/num2));
                break;
                //if 和 switch相同点
            //if语句和switch语句都可以表达分支结构
            //不同点 1 if语句  相对灵活 更加强大 switch相对弱小 所有switch都可以被if语句取代
            //  if 语句更多的是一些连续性判断 ,而switch   语句更多表现的是离散型匹配
            //if语句  每次都需要获取表达式的值 而switch]只需要获取一次  然后直接找匹配就可以
            //因此swich效率更高一些.


        }

    }
}
