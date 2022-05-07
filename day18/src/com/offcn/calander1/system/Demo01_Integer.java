package com.offcn.calander1.system;

public class Demo01_Integer {
    public static void main(String[] args) {
        int i=99;
        //i是一个基本数据类型
        //Integer(int value)
        //构造一个新分配的Integer对象,他表示指定的int值
        Long ii= new Long(99);
        //给我一个Integer ii 我们可以把它转成int byte short  long double float String

        //Integer(String s)
        //构造一个新分配的Integer对象,他表示String参数所指示的int值
        //String s 只能是整数的字符串 符合int的取值范围
        String str1="2121";
        Integer iii=new Integer(str1);
        System.out.println(iii);

        //把包装类 还原成基本数据类型
        //xxxValue重载方法
        double i2 = iii.doubleValue();
        System.out.println(i2);

        int i3 = iii.intValue();
        System.out.println(i3);


    }
}
