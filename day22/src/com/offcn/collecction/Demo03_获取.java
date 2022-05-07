package com.offcn.collecction;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_获取 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        //添加   添加可以添加的任意类型
        col.add("gawgwa");
        col.add("憨怂");
        col.add("傻逼");
        //获取
        //获取元素的个数size()
        int size = col.size();
        System.out.println(size);
        //在collection中没有直接提供获取元素的方式

    }
}
