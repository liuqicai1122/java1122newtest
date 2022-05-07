package com.coffcn.homework;

import java.util.ArrayList;
import java.util.Collection;

public class HomeWork1 {
    public static void main(String[] args) {
       // String[] name={"A","B","C","D","E","F","G"};
       // String[] scores={"A,数学,89","A,语文,86","B,英语,98","C,英语,67","G,数学,60"};
        //求name 中 谁全部缺考//提示 使用removeAll方法
        Collection name= new ArrayList();
        name.add("A");
        name.add("B");
        name.add("C");
        name.add("D");
        name.add("E");
        name.add("F");
        name.add("G");
        Collection scores= new ArrayList();
        scores.add("A");
        scores.add("B");
        scores.add("C");
        scores.add("G");
        boolean b = name.removeAll(scores);
        System.out.println(name);
    }
}
