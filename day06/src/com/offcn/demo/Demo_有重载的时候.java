package com.offcn.demo;

public class Demo_有重载的时候 {
    public static void main(String[] args) {
        String str1= getSum(321,"fafwa");
        System.out.println(str1);
        System.out.println(getSum(342,532));

    }//两个整数相加
    public static int getSum(int x ,int y){ return x+y;}
    //三个整数相加
    public static int getSum(int x , int y ,int z){return x+y+z;}
    //对两个小数相加
    public static double getSum(double x,double y ){return x+y ;}
    //顺序不同 指的是数据类型不同的时候
    public static String getSum (int x , String y){return x + y;}
    public static  String  getSum(String x , int y){ return  x+y;}
}
