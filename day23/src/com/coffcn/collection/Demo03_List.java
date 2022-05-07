package com.coffcn.collection;

import java.util.*;

public class Demo03_List {
    public static void main(String[] args) {
        //  List是Collection的子接口
        //特性 有序有索引 可重复的
        //List  也是一个接口  不能直接创建对象
        List<String> list = new ArrayList<>();
        list.add("小红");
        list.add("小白");
        list.add("小黑");
        list.add("小傻逼");
        list.add("小红");
        //所说的有序是   存取有序
        System.out.println(list);
        //IndexOutOfBoundsException 不要超过集合的索引
        //System.out.println(list.get(4));

        //Object   set(int index,Object element);
        //给指定的索引 替换成新的元素,有返回值    返回的是被替换的元素
        String  str = list.set(2, "憨怂");
        System.out.println(list);
        System.out.println(str);
        //void add(int index,Object element)
        list.add(1,"小白白");
        System.out.println(list);// 重写了toString方法

        // Object   remove(int index)
        //删除指定索引处的元素.有返回值,返回的是被删除的元素
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);

        //int   indexOf(Object  o)
        int  index1 = list.indexOf("小红");
        System.out.println(index1);

        //int   lastIndexOf("小红")
        int index2 = list.lastIndexOf("小红");
        System.out.println(index2);
    }

}
