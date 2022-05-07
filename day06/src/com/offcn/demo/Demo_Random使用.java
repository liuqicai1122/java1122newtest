package com.offcn.demo;
import  java. util.Random;
public class Demo_Random使用 {
    public static void main(String[] args) {
        /*Random 的使用方式和Scanner步骤一样
        *
        * */
        //第二步 创建Random 随机数对象
        Random ran= new Random();
        //第三步 调用随机数的方法
            int ranNum=ran .nextInt(10);//随机数范围  {0 -10)
        System.out.println(ranNum);
        //获取1到100之间的随机数 包括100
        int ranNum1=ran.nextInt(100)+1;
        System.out.println(ranNum1);
        // 1到5
        int ranNum2=ran .nextInt(5)+1;
    }
}
