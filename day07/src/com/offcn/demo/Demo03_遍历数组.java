package com.offcn.demo;

public class Demo03_遍历数组 {
    public static void main(String[] args) {
        //遍历数组 就是把数组中的每一个元素获取出来
        int[] arr1 = {3,4,1,6,34,64};
        //我们常规打印出数组内容是以下 一个一个打印
        System.out.println(arr1[0]);//3
        System.out.println(arr1[1]);//4
        //................
        //我们可以这样做  数组的长度  数组名.length 最大索引长度 数组名.length-1
        for (int i = 0;i<=arr1.length-1;i++){
            //数组的长度 决定了循环的次数
            System.out.println(arr1[i]);
        }
    }
}
