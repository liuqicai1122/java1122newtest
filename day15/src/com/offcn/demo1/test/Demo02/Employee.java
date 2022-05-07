package com.offcn.demo1.test.Demo02;

public  abstract class Employee {
  String name;
    int number;
     int wage;
    int bonus;

    public Employee(String name, int number, int wage, int bonus) {
        this.name = name;
        this.number = number;
        this.wage = wage;
        this.bonus = bonus;
    }

    public Employee() {
    }
    public  abstract  void work();
    public  abstract  void show();
}
