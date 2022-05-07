package com.offcn.calander1.digui;

public class Demo04_案列3 {
    public static void main(String[] args) {
                int  i=shuLie(6);
        System.out.println(i);

    }

    // 斐波那契数列  1,1,2,3,5,8,13,21,34..求第n个值
    public  static  int shuLie(int n){
        if(n==1 || n==2){
            return 1;
        }
        return shuLie(n-1)+shuLie(n-2);
    }
}
