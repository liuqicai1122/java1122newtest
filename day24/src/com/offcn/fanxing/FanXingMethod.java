package com.offcn.fanxing;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Arrays;

public class FanXingMethod {
    //泛型方法
    //格式:
    //修饰符<泛型的声明> 返回值类型 方法名(){
    // }
    //定义一个方法的功能:可以将任意类型数组中的两个指定索引位置进行交换
    //将int类型数组中的两个指定的索引位置交换
    public static  void changeArrayIndex(int [] arr,int index1,int index2){
                     int i=arr[index1];
                     arr[index1]=arr[index2];
                        arr[index2]=i;
        System.out.println(Arrays.toString(arr));
    }
    public static <A> void changeArrayIndex(A[] arr,int index1,int index2){
                    A i= arr[index1];
                    arr[index1]=arr[index2];
                    arr[index2]=i;
        System.out.println(Arrays.toString(arr));

    }
}
