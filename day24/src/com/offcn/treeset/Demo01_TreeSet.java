package com.offcn.treeset;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.TreeSet;

public class Demo01_TreeSet {
    public static void main(String[] args) {
        //TreeSet() 空参构造:特性:可以根据元素的自然顺序进行排序
        //TreeSet里面的数据在存的时候,需要的是同一种数据类型
        //我们在使用TreeSet的时候一定要加泛型
        //无序 不重复 没有索引 可以自动排序默认的空参 有自然排序的规则
        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(23);
        ts1.add(24);
        ts1.add(23);
        ts1.add(42);
        ts1.add(41);
        System.out.println(ts1);
        TreeSet<String>ts2=new TreeSet<>();
        ts2.add("A");
        ts2.add("H");
        ts2.add("A");
        ts2.add("zhong");
        ts2.add("1");
        ts2.add("C");
        System.out.println(ts2);
    }
}
