package com.offcn.demo;

public class Demo_Do_While {
    public static void main(String[] args) {
        /*先做事 后循环
        *初始表达式;
        * do{循环体语句;
        * 循环体语句的变化;
    * }while(布尔表达式 )
        *执行步骤:
        * 先去执行do{}里面的循环语句 循环体语句也会变化
        * 之后执行 布尔表达式 为真 继续执行循环体语句,初始化语句的变化
        * 当布尔表达式为假的 整个 do..while循环停止
        *总结 当我们的 布尔表达式 第一次执行的时候为true 效果与for 和while循环结果
        * 一致  布尔表达式第一次结果为false do   ... while   会执行一次循环语句
        *
        * */
        for (int i = 0; i >=4 ; i++) {
            System.out.println( i);
        }
            int i =0;
        do{
            System.out.println(i);
            i++;
        }while (i>=4);




    }
}
