package com.offcn.calander1.digui;

public class Demo02_递归案列1 {
    public static void main(String[] args) {
        //输出int a 到 int b
        aToB(5,10);

    }
    public static  void aToB(int a ,int b){
        if(a<b){
            aToB(a,b-1);
        }
        System.out.println(b);
    }

}
