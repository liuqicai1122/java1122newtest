package com.offcn.demo.Demo;

public class Demo06_练习 {
    public static void main(String[] args) {
        //常量优化机制
        byte num1 = 2;
        byte num2 = 4;
        //此时的 num 1  和num2 为变量 不为常量
        // byte  b3= num1 +num2 这是不对的 因为 应该是 int b3   更麻烦 并且更加占用内存
        //我们可以这样做
        byte num3 = 2+ 4;
            //这就是常量保护机制     常量是最简单的数据，当我们程序编译出来直接可以判定   能不能用
        // 如果 num1 和2 是 100 超出byte num3范围 将自动提示错误
        System.out.println(num3);

    }




}
