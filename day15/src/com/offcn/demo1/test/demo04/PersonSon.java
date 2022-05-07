package com.offcn.demo1.test.demo04;

public class PersonSon extends Person  implements BianCheng,Compose {
    @Override
    public void show() {
        System.out.println( name+"会编程");
    }

    @Override
    public void YinYue() {
        System.out.println(name+"会作曲");
    }

    public PersonSon() {
    }
    public PersonSon(int age,String sex,double length,String name){
        this.age=age;
        this.length=length;
        this.sex=sex;
        this.name=name;
    }
}
