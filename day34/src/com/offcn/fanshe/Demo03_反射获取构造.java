package com.offcn.fanshe;

import java.lang.reflect.Constructor;

public class Demo03_反射获取构造 {
    public static void main(String[] args) throws NoSuchMethodException {
        //第一步 反射 获取Class类对象
        Class<Person> personClass = Person.class;
        //Constructor<?>[] getConstructors()
        //  返回所有公共public构造方法对象的数组
        Constructor<?>[] constructors = personClass.getConstructors();
        //System.out.println(constructors);//打印的是地址
        for (Constructor c:constructors) {
            System.out.println(c);
        }
        //获取单个被public修饰的构造方法
        //Constructor getConstructor(Class<?>... parameterTypes)
        //  返回单个公共构造方法对象
        Constructor<Person> constructor = personClass.getConstructor(String.class);
        System.out.println(constructor+"+++++++++++++++++++++++++++");

        System.out.println("以下获取所有的构造方法" );
        //Constructor<?>[]  getDeclaredConstructors()
        //返回 所有构造1方法对象的数组
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor c:declaredConstructors) {
            System.out.println(c);
        }
            //*
        //获取单个的被private修饰的构造方法
        //Constructor   getDeclaredConstructor(Class<?>>... parameterTypes)
        //      返回 单个构造方法对象
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}
