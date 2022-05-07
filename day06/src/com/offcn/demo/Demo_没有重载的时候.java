package com.offcn.demo;

public class Demo_没有重载的时候 {
    public static void main(String[] args) {
        System.out.println(getSum1(4,5));
        System.out.println(getSum2(4,5,6));
        System.out.println(getSum3(3.14,3.14));

    }
    //两个整数相加
    public static int getSum1(int x,int y){return x+y;}
    //三个整数相加
    public static int getSum2(int x, int y, int z){return x + y +z;}
    //对两个小数相加
    public static double getSum3(double x,double y){return x + y ;}
}
