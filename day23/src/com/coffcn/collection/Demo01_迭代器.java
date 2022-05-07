package com.coffcn.collection;

import com.coffcn.homework.HomeWork2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo01_迭代器 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(1);
        col.add("hello");
        col.add(false);
        //获取迭代器对象
        Iterator it = col.iterator();
        boolean b = it.hasNext();
        System.out.println(b);
        Object obj1 = it.next();
        System.out.println(obj1);
        Object b1 = it.next();
        System.out.println(b1);

        while(it.hasNext()){
            Object next = it.next();
            System.out.println(next);




        }
    }
}
