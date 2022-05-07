package com.offcn.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_获取 {
    public static void main(String[] args) {


        Collection col = new ArrayList();
        //添加 添加 任意数据类型
        col.add("hello");
        col.add("world");
        col.add("12");
        col.add("13");
        col.add("14");
        System.out.println(col);

        //获取
        //获取元素的个数 size()
        int size = col.size();
        System.out.println(size);
    }
}
