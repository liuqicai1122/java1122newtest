package com.offcn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02_判断 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        //添加 添加可以添加任意的数据类型
        col.add("hello");
        col.add("world");
        col.add("12");
        col.add("13");
        col.add("14");
        System.out.println(col);
        //判断  isEmpty()  如果此    collection不包含元素,则返回true  有返回值
        boolean bool1 = col.isEmpty();
        System.out.println(bool1);//false

        //boolean contains(Object o)  如果此 collection包含指定的元素 则返回true
        boolean bool2 = col.contains("hello");
        System.out.println(bool2);//true

        //containAll(Collection <?>c) 如果此Collection 包含  指定collection 中所有的元素,则返回true
        ArrayList list= new ArrayList();
        list.add("12");
        list.add("13");
        list.add("12");
        list.add(12);
        list.add(13);
        boolean b = col.containsAll(list);
        System.out.println(b);//false
        //含有但是不全含有 所有 false
        //retainAll(Collection<?>c) 仅保留此 collection中那些指定collection的元素的操作
        boolean b1 = col.retainAll(list);
        System.out.println(b1);
        //只有有相同的元素 就是正确的 主要来判断两个集合是否有相同元素


    }
}
