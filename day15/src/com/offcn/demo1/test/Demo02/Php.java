package com.offcn.demo1.test.Demo02;

public class Php extends  Employee{
    /*private String name;
    private  int number;
    private  int wage;
    private  int bonus*/
    public Php(String name, int number, int wage, int bonus) {
      /*  this.name=name;
        this.number=number;
        this.wage=wage;
        this.bonus=bonus;*/
      super(name, number, wage, bonus);
    }

    @Override
    public void work() {
        System.out.println("软件开发");
    }

    @Override
    public void show() {
        System.out.println( "姓名为"+name+"工号为"+number+"工资为"+wage+"奖金为"+bonus);

    }
}
