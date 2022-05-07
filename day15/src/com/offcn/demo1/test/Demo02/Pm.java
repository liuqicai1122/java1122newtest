package com.offcn.demo1.test.Demo02;

public class Pm extends  Employee {

    @Override
    public void work() {
        System.out.println("控制进度");
    }

    @Override
    public void show() {
        System.out.println("姓名为"+name+"工号为"+number+"工资为"+wage+"奖金为"+bonus);
    }

    public Pm(String name, int number, int wage, int bonus) {
        super(name, number, wage, bonus);
    }

    public Pm() {
    }
}
