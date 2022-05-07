package com.offcn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo01_Collections {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(14);
        System.out.println(list);
        //sort(List<T> list);对list集合进行默认排序
        Collections.sort(list);
        System.out.println(list);
        //addAll(Collections<T>,T...e) 向集合中添加可变参数元素
        Collections.addAll(list,23,432,12,12);
        System.out.println(list);
        //fill(List<E>list ,E e):将list集合中所有元素都填充为元素e
       // Collections.fill(list,69);
        //System.out.println(list);
        //int  frequency(Collection<E> c ,E e):返回集合c中的元素e的个数
        int num = Collections.frequency(list, 12);
        System.out.println(num);
        //max , min 获取最大值或者最小值
        Integer max = Collections.max(list);
        System.out.println(max);
        //replaceAll(list<E> list,E oldVal, E newVal):将集合list中的所有指定老元素oldVal都替换成新元素
        //newVal
        Collections.replaceAll(list,12,100);
        System.out.println(list);
        //reverse(List<E> list): 将参数集合list进行反转
        Collections.reverse(list);
        System.out.println(list);
        //synchronizedXxx方法系列:将一个线程不安全的集合传入方法<返回一个线程安全的集合
        List<Integer> integers = Collections.synchronizedList(list);
        System.out.println(integers);
    }
}
