package com.offcn.fanshe;

public class Person {
    private String name;
    private  int age;
    //权限修饰符大小   private 默认的 受保护的protected public
    //构造
    //被public修饰的空参构造

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

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

   Person(int age) {
        this.age = age;
    }

   private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
