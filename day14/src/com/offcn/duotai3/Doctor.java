package com.offcn.duotai3;

public class Doctor extends  Person{
    int num=100;

    @Override
    public void eat() {
        System.out.println("医生吃饭讲究,喜欢养生类食物");
    }
    public void save(){
        System.out.println("医生会救人");
    }
}
