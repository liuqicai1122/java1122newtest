package com.offcn.this1;

public class Teacher {
    private  String name;
    private  int age;

    public Teacher(){
        this ("憨怂",15);
    };
    public Teacher(String name, int age) {
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
}
