package com.offcn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04_存对象 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Person(12,"傻逼","女"));
        col.add(new Person(134,"憨怂","男"));
        System.out.println(col);

    }
}
