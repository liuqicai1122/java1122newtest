package com.offcn.innerclass;

public class Test02 {
    public static void main(String[] args) {
        //私有成员内部类 前提是被private修饰
        //我们的访问方式
        //外部类.内部类 内部类对象名=new 外部类().new 内部类();行不通
        //创建外部类
        Bod2 b2=new Bod2();
        b2.useHeart();
    }
}
