package com.coffcn.set;

import java.util.HashMap;
import java.util.HashSet;

public class Demo02_存基本数据类型 {
    public static void main(String[] args) {
        //HashSet是没有任何排序规则
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(2312);
        hs.add("憨怂");
        hs.add("中");
        hs.add(true);
        System.out.println(hs);//[100, 憨怂, 2312, 中, true]
    }
}
