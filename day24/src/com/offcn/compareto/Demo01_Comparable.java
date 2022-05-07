package com.offcn.compareto;

import java.util.TreeSet;

public class Demo01_Comparable {
    public static void main(String[] args) {
                TreeSet <Student>ts =new TreeSet<>();
                ts.add(new Student("怪侠",18));
                ts.add(new Student("小王",18));
                ts.add(new Student("王力宏",99));
                ts.add(new Student("二狗子",34));
                ts.add(new Student("小王",18));
                ts.add(new Student("小王",16));
        System.out.println(ts);
    }
}
