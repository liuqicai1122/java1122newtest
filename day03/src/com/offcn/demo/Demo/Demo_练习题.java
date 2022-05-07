package com.offcn.demo.Demo;

public class Demo_练习题 {
    public static void main(String[] args) {
        //1.取出一个整数各个位置的数字
        int x =32145;
        //去万位的数字
        System.out.println(x/10000);//3
        //取千位
        System.out.println(x/1000%10);//2
        //取百位
        System.out.println(x/100%10);//1
        //取十位
        System.out.println(x/10%10);//4
        //取个位
        System.out.println(x%10); //5
        //2. 浮点数 取出小数部分
        double num=3.4214214;
        //先去除小数点
        int ww= (int) num;
        System.out.println(ww); //3
            double num2 ;
                num2 = num - ww;
        System.out.println(num2);


    }
}
