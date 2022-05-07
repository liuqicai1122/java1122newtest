package com.offcn.demo02;

public class San extends Shape {
    int di=4;
    int gao=2;
            public San(int di, int gao){
                super();
                this.di=di;
                this.gao=gao;
            }
    @Override
    public double aaArea() {
        double i=di*gao*1/2;
        return i;
    }
}
