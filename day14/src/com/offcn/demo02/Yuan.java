package com.offcn.demo02;

public class Yuan extends Shape {
   int r=4;
        public Yuan(int r){
            super();
            this.r=r;
        }
    @Override
    public double aaArea() {
        Double area = Math.PI * r * r;
        return area;
    }
}