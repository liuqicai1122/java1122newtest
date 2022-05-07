package com.offcn.demo1.test.Demo02;

public class Test {
    public static void main(String[] args) {
        Employee i= new Php("大傻逼",23,10000,5000);
        i.work();
        i.show();
        Qa ii= new Qa("憨怂",34,9000,4000);
        ii.work();
        ii.show();
        Pm iii= new Pm("老李",41,12000,6000);
        iii.work();
        iii.show();
    }
}
