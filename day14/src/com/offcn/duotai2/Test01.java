package com.offcn.duotai2;

public class Test01 {
    public static void main(String[] args) {
        /*多态发生的前提 就是 1 要有继承 2有方法的重写
        3父类的引用指向子类的对象
        *
        * */
        //Person p1 父类的引用 指向子类的对象 对象 是new
        Person p1 = new Teacher();
        Person p2= new Doctor();
    }
}
