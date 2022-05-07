package com.offcn.fanshe;

public class Test {
    //我们想要玩反射首先 要找到对应的 Class类对象
    //  java给我们提供了三种获取Class对象的方法
    //1 对象名.getClass()
    public static void main(String[] args) throws ClassNotFoundException {
        Student s=new Student();
        // ? extends Student 意思是Class类对象    中的数据类型 是Student 或是它的子类

        Class<? extends Student> aClass = s.getClass();

        //2. 类名.class 最常用 不需要创建对象

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
        //3 通过  Class.forName(String className)
        //加上包名类名
        Class<?> aClass1 = Class.forName("com.offcn.fanshe.Student");
        //我们通过 3中方 获取到的Class类对象 本身就是同一个对象
        System.out.println(aClass==studentClass);//true
        System.out.println(studentClass==aClass1);//true
    }

}
