package com.offcn.demo;

public class Demo_案列5 {
    public static void main(String[] args) {
        //打印    1到100中非4倍数用     continue
        for (int num=1; num<=100; num++ ){
            if(num%4==0){
                continue;
            }
            System.out.println(num);
        }

    }
}
