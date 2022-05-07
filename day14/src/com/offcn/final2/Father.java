package com.offcn.final2;
//final 修饰类 表示为最终的类 不能被继承
public  final class Father {
    public void add(final int num1,final int num2){
        System.out.println(num1+num2);
        //final 修饰形参不能在方法中  直接进行赋值
        //num1=300
        //num2=321 这些都会报错
    }
}