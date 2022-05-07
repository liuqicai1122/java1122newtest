package com.offcn.demo;

public class Demo05_案列4 {
    public static void main(String[] args) {
        //打印1到10中的偶数 使用continue
        //continue不会结束循环 只会跳过 循环 也要符合条件
        for(int num =1; num<=10; num++){
            if(num %2 !=0){
                continue;
            }
            System.out.println(num);
        }

    }
}
