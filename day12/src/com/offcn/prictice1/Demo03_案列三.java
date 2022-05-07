package com.offcn.prictice1;

import java.util.Arrays;

public class Demo03_案列三 {
    public static void main(String[] args) {
        int [] arr ={4,2,42,124,53,123,434};
        //之后用我们的工具类 对数组进行操作
        //最大值
        MyArrays.getArrMax(arr);
        //最小值
        MyArrays.getArrMin(arr);
        //升序排序
        MyArrays.sort(arr);
        //求和
        MyArrays.getArrSum(arr);
        System.out.println(Arrays.toString(arr));
    }
}
