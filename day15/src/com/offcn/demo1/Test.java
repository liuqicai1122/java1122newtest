package com.offcn.demo1;

public class Test {
    public static void main(String[] args) {
        Bird i= new Bird_Kind1();
        i.attack();
        Bird ii=new Bird_Kind2();
        ii.attack();
        DemoTest.get();

        System.out.println(DemoTest.get());

    }
}
