package com.offcn.demo;

public class Demo01_测试接口的实现类对象 {
    //第一种 通过类的实现类对象 实现接口
    //第二种 匿名内部类实现
    public static void main(String[] args) {
    new MyInterface(){

        @Override
        public void fun() {

        }
    };
    //第三种 通过Lambda 表达式 本质是一个对象 是一个接口的实现类对象
        //Lambda  表达式格式:()->{方法体语句}
    //  参数列表 :是抽象方法的参数
        //->:Lambda 表达式 运算符
        // 方法体语句  抽象方法的实现语句
        MyInterface m=()->{
            System.out.println("我实现了");
        };
        m.fun();
    }
}
