package com.coffcn.set;

import java.util.HashSet;

public class Demo03_存字符串 {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("aa");
        hs.add("中国");
        hs.add("中国");
        hs.add("aa");
        hs.add("666");
        System.out.println(hs);//[aa, 666, 中国]
    }
}
