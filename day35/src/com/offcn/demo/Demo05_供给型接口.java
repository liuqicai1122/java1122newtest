package com.offcn.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Demo05_供给型接口 {
    public static void main(String[] args) {
        //1 客户1 :5个数据 都是30到80之间的随机数
        //真正决定数据是否符合要求,就要看Supplier函数式接口的实现类对象

        Supplier<Integer> sup=()-> new Random().nextInt(51)+30;
        ArrayList<Integer> list = uesSupplier(5, sup);
        System.out.println(list);
        //客户2  8个数据 1-100之间的随机数
        Supplier<Integer> sup1=()->{
            Random ran=new Random();
            while (true){
                //生成1-100之间的随机数
                int i = ran.nextInt(100) + 1;
                //判断是否符合要求
                if (i%2 ==0){
                    return  i;
                }
            }
        };
        ArrayList<Integer> list1 = uesSupplier(8, sup1);
        System.out.println(list1);

    }
    public static ArrayList<Integer>   uesSupplier(int count, Supplier<Integer> sup){
        ArrayList<Integer> list=  new ArrayList<>();
        //进行遍历
        for (int index =1; index<= count; index++) {
            //sup.get() 数据类型和本身的泛型保持一致
            list.add(sup.get());
        }
        return list;
    }
}
