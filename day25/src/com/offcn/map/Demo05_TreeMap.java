package com.offcn.map;

import java.util.TreeMap;

public class Demo05_TreeMap {
    public static void main(String[] args) {
        //TreeMap可以让 key值 按照自然的顺序排序
        TreeMap<String,String> tm=new TreeMap<>();
        tm.put("bbbb","嘤嘤嘤");
        tm.put("ccccccc","呜呜呜呜");
        tm.put("aaaa","嘻嘻嘻嘻");
        System.out.println(tm);
    }
}
