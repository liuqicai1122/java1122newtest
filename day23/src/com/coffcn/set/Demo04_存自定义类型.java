package com.coffcn.set;

import java.util.HashSet;

public class Demo04_存自定义类型 {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        //我们想要自定义类型去重的时候 我们需要重写hashCode() 和equals() 不然不会去重的
            hs.add(new Student(23,"小王"));
            hs.add(new Student(23,"小王"));
            hs.add(new Student(12,"老王"));
            hs.add(new Student(123,"马牛逼"));
        System.out.println(hs);
    }
}
