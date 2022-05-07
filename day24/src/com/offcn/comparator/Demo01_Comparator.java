package com.offcn.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo01_Comparator {
    public static void main(String[] args) {
        //我们再去使用TreeSet(Comparator<?super E> comparator)
        //构造一个新的空 TreeSet ,他根据指定 比较器进行排序
            TreeSet<Student>ts =new TreeSet<>(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    int i = o1.getAge() - o2.getAge();
                    int i1 = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                    return i1;
                }
            });
        ts.add(new Student("怪侠",18));
        ts.add(new Student("小王",18));
        ts.add(new Student("王力宏",99));
        ts.add(new Student("二狗子",34));
        ts.add(new Student("小王",18));
        ts.add(new Student("小王",16));
        System.out.println(ts);
    }
}



