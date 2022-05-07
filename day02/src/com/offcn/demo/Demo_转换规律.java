package com.offcn.demo;

public class Demo_转换规律 {
    public static void main(String[] args) {
        byte x=123;
        byte x2=122;
        int x3=x+x2;
        System.out.println(x3);
        /*类型转换的时候小数据类型会自动转换为大数据类型
            byte+int=int
            byte+byte=int
            byte+short=int short+short=int short+int=int
            int+int=int(不超过int范围的前提，超过就是Long)
        *
        * */
        int c=100;
        int c1=122;
        int c2=c+c1;
        System.out.println(c2);
        System.out.println(c2);
            //小数运算结果是double
        float e=2.3214f;
        float e2=3.41241f;
        double e3=e+e2;
        System.out.println(e3);

    }
}
