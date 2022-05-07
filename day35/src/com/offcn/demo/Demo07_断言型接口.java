package com.offcn.demo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo07_断言型接口 {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(12);
        list.add(243);
        list.add(21);
        list.add(45);
        list.add(532);
        list.add(43);
        list.add(89);
        list.add(44);
        //客户1  要求容器所有数 都能被2 整数
        Predicate<Integer> pre= x-> x%2==0;
        ArrayList<Integer> list1 = usePredicate(list, pre);
        System.out.println(list1);

        //客户2 要求所有数据都不大于100
        Predicate<Integer> pre1= x-> x<=100;
        ArrayList<Integer> list2 = usePredicate(list, pre1);
        System.out.println(list2);

        //客户3 要求所有数据都小于100 并且都是奇数
        Predicate<Integer> pre2= x-> x<=100 && x%2!=0;
        ArrayList<Integer> list3 = usePredicate(list, pre2);
        System.out.println(list3);

        //客户4 要求所有数据 或者小于100 或者是偶数
       // Predicate<Integer> pre3= x-> x<=100 || x%2==0;
        //ArrayList<Integer> list4 = usePredicate(list, pre3);
        //System.out.println(list4);
        Predicate<Integer> pre3= x->  x%2==0;
        ArrayList<Integer> list4 = usePredicate(list, pre1.or(pre3));
        System.out.println(list4);

    }

    //定义一个方法 需要客户提供一个容器 ArrayList<Integer>,
    //根据客户需求   将容器中符合条件的数据筛选出来 将筛选出的数据放置在新容器中返回给客户
    public  static ArrayList<Integer> usePredicate(ArrayList<Integer>list, Predicate<Integer> pre){
        ArrayList<Integer> list1= new ArrayList<>();
        //遍历用户提供的数据 ,进行筛选 把符合要求的添加到list1里面
        for (Integer num:list) {
            if (pre.test(num)){
                //符合就添加
                list1.add(num);
            }
        }
            return list1;
    }
}
