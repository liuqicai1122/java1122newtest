package com.offcn.demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {
    public static void main(String[] args) {
        JuiceMachine iii= new JuiceMachine();
        Fruits app= new Apple();
        Fruits  o= new Orange();
        iii.makeJuice(app);
        iii.makeJuice(o);

    }
}
