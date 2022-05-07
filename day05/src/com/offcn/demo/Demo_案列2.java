package com.offcn.demo;

public class Demo_案列2 {
    public static void main(String[] args) {
        //输出1到100之间能被3整除的前5个数
        //前5个数 从这 我们知道程序是不会走到最后的
        //需要提前结束 break
        int flag=0;
        for (int i=1 ; i<=100; i++){
            if (i%3==0){
                System.out.println(i);
                flag++;
            }
            if(flag ==5){
                break;
            }
        }
    }
}
