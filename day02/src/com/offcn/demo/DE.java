package com.offcn.demo;

public class DE{
    public static void main(String[] args) {
        /*
        * 基本数据类型
        *  四大类 整数 小数  字符 布尔
        * 整数 byte  short  int long
        *  小数float doule
        *  字符 char
        * 布尔 boolean
        *
        *
        */
   //整数
        System.out.println(100);
        System.out.println(0b0101010);//二进制 0b 开头
         System.out.println(0x101112);//十六进制 10-15 A B C D
        // 浮点 小水
        System.out.println(3.22);
        //布尔类型
        System.out.println(true);
        byte a = 99;
        System.out.println(a);
       //不要超过byte 取值范围 128
        short ii = 333;
        System.out.println(ii);
        //shout 取值范围是正负30000多
        long iii = 555555555;
        System.out.println(iii);//long整数中取值最大
        //浮点类型
        //单精度 float
        // 双精度 doule 最经常使用的 也是最大的
        //f浮点类型永远比整数类型大
            //布尔类型不参与比较
        //  char是个很神奇的存在 和short范围一样 而且可以和整数直接运算
        int i = 2421421;

        System.out.println(i
        );

    }


}
