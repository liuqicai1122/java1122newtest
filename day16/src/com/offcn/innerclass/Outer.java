package com.offcn.innerclass;

public class Outer {
    //外部类的成员变量
    private int num=10;
    //内部类
    class Inner{
        //内部类成员变量
        private int num =100;
        public void show(){
            //内部类方法中的局部变量
            int num=1000;
            System.out.println(num);//1000
            System.out.println(this.num);//100
            //外部类.this.成员变量  外部类的成员变量
            System.out.println(Outer.this.num);//10
        }
    }
}
