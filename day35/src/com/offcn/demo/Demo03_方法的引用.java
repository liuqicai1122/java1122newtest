package com.offcn.demo;

public class Demo03_方法的引用 {
    public static void main(String[] args) {
        MyInterface5 mys5= x-> System.out.println(x);
        mys5.show("ahahha");
        //方法的引用
        // 函数式接口 名称 = 对象名:方法名称;
        MyInterface5 mys5_1=System.out::println;
        mys5_1.show("哈哈哈哈哈啊哈哈");
        MyInterface5 mys_2=MyTest::fun;
        mys_2.show("22");


    }
}
@FunctionalInterface
interface MyInterface5{
    public  abstract void show(String s);
}
//MyTest 是一个类  很巧 里面有一个方法 和MyInterface5中的show方法很相似
//相似到 除了方法名不同, 返回值无关 参数列表保持一致
class  MyTest{
    public  static  int fun(String x){
        System.out.println("我是"+x);
        return  0;
    }
    public  int fun2 (String x){
        System.out.println("我是"+x);
        return 0;
    }
}