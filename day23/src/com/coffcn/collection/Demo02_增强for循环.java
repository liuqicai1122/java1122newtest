package com.coffcn.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02_增强for循环 {
    public static void main(String[] args) {
            //for each
        //增强for循环底层采用的是   迭代器对象
        //for (数据类型 变量名 : 集合名/数组名){
        //   一般这里我们以打印元素为主
        // }
       //先去变量集合
        Collection<String>col1= new ArrayList<>();
        col1.add("hello");
        col1.add("小红");
        col1.add("99");
        col1.add("false");

        for (String obj: col1) {
            System.out.println(obj);
        }
        System.out.println("=============================");
        //增强for循环也可以
        int[] arr={12,214,412,421};
        for (int num :arr) {
            System.out.println(num);
        }
    }
}
