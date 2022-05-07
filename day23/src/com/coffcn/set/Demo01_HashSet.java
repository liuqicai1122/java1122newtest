package com.coffcn.set;

import java.util.HashSet;

public class Demo01_HashSet {
    public static void main(String[] args) {
        //set集合统一的特性:无序没有索引,不可重复
        HashSet hs=new HashSet();
        hs.add("hello");
        hs.add("true");
        hs.add(3.14);
        hs.add(3.14);
        System.out.println(hs);
    }
}
