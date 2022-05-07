package com.offcn.demo;

public class TestDog {
    public static void main(String[] args) {
        //我们创建对象
        Dog i= new Dog();//我们先用set get 取值第一个对象 id
        i.setId(23214);
        System.out.println(i.getId());
        i.setAge(32);
        System.out.println(i.getAge());
        i.setColor("彩色");
        System.out.println(i.getColor());
        i.setName("小花");
        System.out.println(i.getName());
        //好了我们接下来对第二个对象 name 使用有参构造方法赋值
        //我们创建一个新对象
       Dog iii =new Dog(231,"小黑黑",12,"粉色");
        System.out.println(iii.getAge());
        System.out.println(iii.getName());
        System.out.println(iii.getId());
        System.out.println(iii.getColor());//ok

    }
}
