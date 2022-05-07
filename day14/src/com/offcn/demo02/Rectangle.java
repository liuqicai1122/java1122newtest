package com.offcn.demo02;

public class Rectangle extends Shape{
        int chang=4;
        int k=2;
            public Rectangle(int chang, int k){
                this.chang=chang;
                this.k=k;
            }
    @Override
    public double aaArea() {
        double i=chang*k;
        return i;
    }
}
