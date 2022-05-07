package com.offcn.calander1.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo01_Arrays {
    public static void main(String[] args) {
        //Arrays 数组工具类 里面有很多可以直接处理数组数据的方法
        //列如 我们原来的遍历,自己写的.求最大值,最小值,升序排序
        int[] arr={1,23,4,532,5,2,42,};
        //我们通过自己写方法完成 但是现在我们只需要使用特定方法
        //遍历数组
        String s = Arrays.toString(arr);
        String str1 = s;
        System.out.println(str1);
        //排序
        Arrays.sort(arr);
        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        //copyof(数组,长度)数组拷贝
        int[] ints = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(ints));
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();

    }
}
