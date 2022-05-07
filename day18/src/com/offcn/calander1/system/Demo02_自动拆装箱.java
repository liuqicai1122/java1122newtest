package com.offcn.calander1.system;

public class Demo02_自动拆装箱 {
    public static void main(String[] args) {
        //从jdk1.5开始我们就有了 自动拆装箱
        //10是基本数据类型
        //a是引用数据类型

        //手动装箱:把基本数据类型 包装成引用数据类型
        Integer i = new Integer(100);
        //手动拆箱 xxxValue() 把引用数据类型,转成基本数据类型
        int ii = i.intValue();
        int i1 = ii + 1;
        //装箱
        Integer iii = new Integer(i1);
        System.out.println(iii);

        //自动装箱
        Integer a = 10;
        //a是引用数据类型 引用数据类型不能做运算
        /* a=a+2;
        *   a+2  a是引用数据类型 a需要先变成基本数据类型 10+2=12  自动拆箱
        *           a=12 12是基本数据类型 a是引用数据类型 自动装箱
        * */

        a=a+2;
        System.out.println(a);//12  Integer 引用类型形式

    }
}
