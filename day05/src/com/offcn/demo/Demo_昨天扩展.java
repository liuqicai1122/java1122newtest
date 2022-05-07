package com.offcn.demo;

public class Demo_昨天扩展 {
    public static void main(String[] args) {
        /*1 打印 一到100直接的整数 但数字中包含9的要跳过
        *2 每行输出5个满足条件的数 之间用空格分隔
        * */
        int flag = 0;
        for (int i = 1; i <=100 ; i++) {
            //System.out.println(i);
            int shi =i/10; //十位数字
            int ge = i%10; // 个位数字
            if (shi !=9 && ge !=9){
                //System.out.print(i); //去掉ln 不会自动换行
               // System.out.println(i);//自动换行
                System.out.print(i+" ");
                flag++;
                if (flag%5==0){
                    System.out.println();
                }
            }
        }


       }



}
