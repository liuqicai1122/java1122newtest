package com.offcn;

import javax.swing.*;
import java.util.Random;

public class Demo_昨天的作业三 {
    public static void main(String[] args) {
        //定义一个长度为10的数组arr 数组元素为1-99(范围包括1和99)之间任意随机数,且保证10个数不重复
        //定义一个int类型长度为5的数组
        int[] arr = new int[10];
        //创建随机数对象
        Random ran = new Random();
        for (int index = 0; index <arr.length-1 ; index++) {
            //生成随机数 存到数组中
            //考虑 如果随机生成了 两个99 什么的
            int ranNum=ran.nextInt(99)+1;
            boolean flag=true;
            for (int index1 = 0; index1 <index ; index1++) {
                if (ranNum == arr[index1]){
                        flag=false;
                        index--;
                        break;
                }
            }if(flag){}
            arr[index]=ranNum;
        }for (int i = 0; i<arr.length-1;i++){
            System.out.println(arr[i]+" ");

        }
    }


}
