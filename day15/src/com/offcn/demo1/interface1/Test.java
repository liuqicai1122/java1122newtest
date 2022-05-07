package com.offcn.demo1.interface1;

import com.offcn.demo1.interface2.MyInterface3;
import com.offcn.demo1.interface2.MyInterfaceImpl111;

public class Test {
    public static void main(String[] args) {
        //接口不能直接创建对象
        //MyInterface  mil=new MyInterface();报错 接口不能直接创建对象
        MyInterfaceImpl mii1=new MyInterfaceImpl();
        System.out.println(mii1.NAME);//
        //接口和承接有些类似 有实现类也能调用接口的内容 但不会直接出现 说明 接口中的变量
        //默认修饰符是static
        //mii1.NAME="LII";注意我们这里报错 说明 接口的变量前缀默认是 final 说明已经成为了最终值
        //已经变成一个常量了
        System.out.println(mii1.num);//10
        System.out.println(MyInterfaceImpl.NAME);//我们直接用实现方法名调用接口属性 因为static
        System.out.println(MyInterfaceImpl.num);

    }
}
