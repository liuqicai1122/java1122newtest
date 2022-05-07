package com.offcn.demo1.test.Demo02;

public class Qa extends Employee{
    public Qa(String name, int number, int wage,int bonus) {
        super(name, number, wage, bonus);
    }

    public Qa() {
    }

    @Override
    public void work() {
        System.out.println("软件测试");
    }

    @Override
    public void show() {
        System.out.println("姓名为"+name+"工号为"+number+"工资为"+wage);
    }

}
