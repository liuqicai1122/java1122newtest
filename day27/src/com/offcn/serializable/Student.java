package com.offcn.serializable;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    //Serializable 当成一个撮
    //它里面没有任何内容,但是实现这个接口,这个类就可以序列化
    //没有就不能序列化
        private  static  final  long serialVersionUID=-21321L;
    private String name;
    private  int age;
        private  int i;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
