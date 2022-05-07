package com.offcn.demo1.test.demo03;

public class MyCircle implements Area{
    private  int r;
    final double  MATH=3.14;
    public MyCircle() {
    }

    public MyCircle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("圆的面积为"+r*r*MATH);
    }
}
