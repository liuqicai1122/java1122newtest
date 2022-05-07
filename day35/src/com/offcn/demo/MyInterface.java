package com.offcn.demo;
//在接口中只有一个抽象方法   就是函数式接口\
@FunctionalInterface//验证该接口是否只有一个抽象方法
public interface MyInterface {
        //接口里面有哪些内容
    //1 常量 没有变量  public static final
    //2 抽象 方法  public abstract
    //3 1.8之后 有静态方法 默认方法
        public  abstract  void fun();
}
