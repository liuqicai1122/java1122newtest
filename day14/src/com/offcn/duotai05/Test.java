package com.offcn.duotai05;

import sun.awt.geom.AreaOp;

public class Test {
    public static void main(String[] args) {
        Plant p= new Plant();
        Benz c = new Benz();
        p.give(c);
        Bmw b= new Bmw();
        p.give(b);
        Ferrari f=new Ferrari();
        p.give(f);

    }
}
