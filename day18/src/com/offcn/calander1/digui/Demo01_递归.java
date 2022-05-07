package com.offcn.calander1.digui;

public class Demo01_递归 {
    public static void main(String[] args) {
        //原来的逻辑打印0-9
        for (int i= 0; i<10;i++){
            System.out.println(i);
        }
        print0To9(9);

    }
    //使用递归
        public  static void print0To9(int n){
            if(n>0){
                print0To9(n-1);
            }
            System.out.println(n);
        }
}
