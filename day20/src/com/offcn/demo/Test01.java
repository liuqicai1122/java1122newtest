package com.offcn.demo;

public class Test01 {
    //编写一个方法 递归求阶乘
    public static void main(String[] args) {
        System.out.println(jieCheng(5));
    }
    public  static  int  jieCheng(int n){
        if(n==1){
            return 1;
        }return jieCheng(n-1)*n;
    }
}

