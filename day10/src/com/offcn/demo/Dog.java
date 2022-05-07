package com.offcn.demo;

public class Dog {
    private int id;
    private String name;
    private int age;
    private String color;

    public void pao() {
        System.out.println("这个名叫" + name + "的狗会跑");
    }

    public void jiao() {
        System.out.println("这个" + name + "会叫");
    }

    public int getSum(int a, int b) {//两个数相加的方法
        int Sum = a + b;
        return Sum;
    }
    //创建set get 方法 给第一个对象id 赋值 取值的方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //我们构造有参 必须要先构造一个无参
    public Dog(){};
    public Dog(int id ,String name, int age,String color){
                this.id=id;
                this.name=name;
                this.age=age;
                this.color=color;
    };
}