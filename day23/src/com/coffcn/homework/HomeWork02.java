package com.coffcn.homework;

import java.lang.reflect.Array;
import java.util.*;

public class HomeWork02 {
    public static void main(String[] args) {
        //分析以下需求，并用代码实现：
        //	(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
        //	(2)编写方法对List集合进行排序
        //	(2)然后利用迭代器遍历集合元素并输出
        //	(3)如：15 18 20 40 46 60 65 70 75 91
        Random ran = new Random();
        TreeSet<Integer> ts = new TreeSet<>();
        while (true) {
            int ranNum = ran.nextInt(100) + 1;
            ts.add(ranNum);
            if (ts.size() == 10) {
                break;
            }
        }
        System.out.println(ts);
        TreeSet<Integer> list = new TreeSet<>();
        list.addAll(ts);
        System.out.println(list);
       /* System.out.println(hash);
        int arr[] = new int[10];
        TreeSet<Integer> list = new TreeSet<>();
        list.addAll(hash);
        System.out.println(list);
        for (int index = 0; index <= list.size() - 1; index++) {
            arr[index] = list.get(index);
        }*/

        /*Paixu(arr);
        for (int i:arr) {
            System.out.println(i);
        }
        //删除原来集合所有元素
        list.removeAll(list);
        System.out.println(list);
        for (int i:arr) {
            list.add(i);
        }
       System.out.println(list);
    }

    public  static  void Paixu(int [] num){
        Arrays.sort(num);}*/
    }
}
