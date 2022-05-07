package com.offcn.demo.collection;

import java.util.ArrayList;
import java.util.Collection;

public interface Demo01_Collection {
    public static void main(String[] args) {
        //Collection 是一个接口,不能直接创建对象
        //想要创建对象 我们只能父类的 引用指向子类对象
        Collection col=new ArrayList();
        //  添加   add() 可以添加任意功能
        //注意集合中没有基本数据类型 我们写的基本数据类型 已经自动封箱成基本数据所对应的引用类型
        col.add("哈哈哈");
        col.add(1);
        col.add(true);
        col.add(new Student(123,"憨怂"));
        System.out.println(col);
    }
}
