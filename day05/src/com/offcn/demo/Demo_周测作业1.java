package com.offcn.demo;

public class Demo_周测作业1 {
    public static void main(String[] args) {
        //输入1到100之间可以同时被5和7整除的数字的数量
        int flag=0;//计数
        for (int i=1 ; i<=100; i++){
            if(i%5 ==0 && i%7 ==0){//筛选出来满足结果的数
               flag++; //计数
                System.out.println(flag);
            }

        }

    }

}
