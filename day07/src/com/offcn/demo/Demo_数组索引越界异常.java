package com.offcn.demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Demo_数组索引越界异常 {
    public static void main(String[] args) {
        //动态初始化数组
        int [] arr = new int[3];
        //赋值
        arr[0]=2;
        arr[1]=5;
        arr[2]=6;
        //打印每个数组的数
        System.out.println(arr[0]);//2
        System.out.println(arr[1]);//5
        System.out.println(arr[2]);//6
        getArrayElementByIndex(arr,5);///程序执行到这就停了 并且报错 因为超出了索引范围了但我们定义了避免程序不
        //运行的方法
    }


        //为了避免异常出现 但是不能删除 还要程序全部运行我们要写一个方法解决
            public static void getArrayElementByIndex(int[]arr , int index){
                    if(index>=0 && index<=arr.length-1){
                        System.out.println(arr [index]);
                    }else {
                        System.out.println("索引"+index+"在数组中不存在,无法找到指定的元素,返回默认值0");
                    }



           }
}
