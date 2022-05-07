package com.coffcn.homework;

import java.util.ArrayList;
import java.util.HashSet;

public class HomeWork3 {
    public static void main(String[] args) {
        //把如下元素存入List集合
        //   "aaa" "bbb"  "aaa"   "abc"  "xyz" "123" "xyz"
        //
        //  去掉重复元素
        ArrayList list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add("xyz");
        HashSet set=new HashSet();
        for (Object obj: list){
            set.add(obj);
        }
        System.out.println(set);
    }
}
