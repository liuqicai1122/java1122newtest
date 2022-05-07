package com.offcn.calander1.digui;

public class Demo03_案列2 {
    public static void main(String[] args) {

            int i= 5;
        System.out.println(jieCheng(i));
    }
    //求阶乘
    public static  int jieCheng(int n){
        if(n==1){
            return 1;
        }
        return n*jieCheng(n-1);
    }
}
