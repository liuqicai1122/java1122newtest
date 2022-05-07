package com.offcn.treeset;

import java.util.TreeSet;

public class Demo02_TreeSet存自定义数据类型 {
    public static void main(String[] args) {
        //总结:
        //我们的TreeSet在存基本数据和引用数据类型的时候(前提是jdk提供好的类型)
        //会去重  ,无索引,无序,  还会自动1排序
        //但是我们对自定义数据类型 使用TreeSet 自动排序 无法操作
        //会报错  cannot be cast to java.lang.Comparabl
        TreeSet<Student> ts=new TreeSet<>();
        ts.add(new Student("老李",23));
        ts.add(new Student("小狗",21));
        ts.add(new Student("老李",23));
        ts.add(new Student("老狗",123));
        System.out.println(ts);


    }


        }