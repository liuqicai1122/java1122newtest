package com.offcn.fanshe;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo06_获取成员方法并执行 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Book> bookClass = Book.class;
        //获取public  修饰的成员方法
        //一个获取全部public 修饰的方法
        //Method[]    getMethods()
        //返回所有公共成员方法对象的数组,包括继承的
        Method[] methods = bookClass.getMethods();
        System.out.println(Arrays.toString(methods));
        System.out.println(" _________________________________");
        //获取单个public修饰的方法
        //Method  getMethod(String methodName,Class<?>...parameterTypes)
        //返回单个成员方法对象
        Method setName = bookClass.getMethod("setName", String.class);
        System.out.println(setName);
        Method getName = bookClass.getMethod("getName");
        System.out.println(getName);
        Method toString = bookClass.getMethod("toString");
        System.out.println(toString);

        System.out.println("-----------------------------------");
        //获取全部成员方法
        //Method[]   getDeclaredMethods()
        //    返回所有成员方法对象的数组,不包括继承的
        Method[] declaredMethods = bookClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        //获取单个私有    方法
        Method play = bookClass.getDeclaredMethod("play");
        System.out.println(play);

        //通过getDeclaredMethod() 获取父类的成员方法
        //会报错  只能获得当前的类的全部成员方法
        //Method toString1 = bookClass.getDeclaredMethod("toString");
        //System.out.println(toString);
    }
}
