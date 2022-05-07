package com.offcn.duotai3;

public class Test {
    public static void main(String[] args) {
        //向上转型 缩小对象的作业范畴,只能访问父类中的资源
        Person p1=new Teacher();
        //向上转型的时候,  成员变量只找父类
        System.out.println(p1.num);//666
        //成员方法 先看子类有没有重写 没有重写 找父类 父类 没有的报错
        p1.eat();//老师吃饭随意 啥都吃 好养活
        System.out.println("==============================");
        //向下转型 有前提      必须有向上转型的支持
        //格式     子类类型 变量名 =(子类类型)父类变量名
        Teacher t1= (Teacher)p1;
        System.out.println(t1.num);//666
        System.out.println(t1.num2);//999
        t1.eat();
        t1.teach();


        Person p2= new Doctor();
        Doctor d=(Doctor) p2;
        //多态对象 instanceof指定的数据类型,返回值为布尔类型的数据
        System.out.println(d instanceof  Person);//true
        System.out.println(d instanceof  Doctor);//true
        System.out.println(d instanceof  Teacher);//false
        System.out.println(p2 instanceof Doctor);//true
        System.out.println(p2 instanceof Teacher);//false

        if(p2 instanceof Teacher){
            Teacher t=(Teacher)p2;
        }else {
            System.out.println("数据类型不匹配 ,不能向下转型");
        }
    }
}
