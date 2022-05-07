package com.offcn.duotai3;

public class Teacher extends Doctor{

    int num2=999;

    @Override
    public void eat() {
        System.out.println("老师吃饭就比较随意,啥都能吃,好养活");
    }
    public void teach(){
        System.out.println("老师可以教书育人");
    }
}
