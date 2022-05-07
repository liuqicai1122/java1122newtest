package com.offcn.demo1.test.demo03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyRecaangle implements Area {
    private  int  length;
    private  int  wide;

    public MyRecaangle() {
    }

    public MyRecaangle(int length, int wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public void calculateArea() {
        System.out.println("该长方形的面积为"+length*wide);
    }
}
