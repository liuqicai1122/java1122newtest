package com.offcn.this1;

public class PersonTest {
    public static void main(String[] args) {
        Person i =new Person();
        // p.name="张三";
        //间接赋值 //用方法的方式 对象名.方法名(参数列表)
        i.setName("大傻逼");
        System.out.println(i.getName());
        i.setAge(14);
        System.out.println(i.getAge());
        Teacher teacher= new Teacher();
        System.out.println(teacher.getName());
    }
}