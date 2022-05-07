package com.offcn.map;

import java.util.LinkedHashMap;

public class Demo07_LinkedHashMap {
    public static void main(String[] args) {
        //HapMap没有索引, key不能重复,无序
        //LinkedHashMap 有序
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(4,"哈哈哈");
        lhm.put(6,"哈哈哈");
        lhm.put(1,"哈哈哈");
        lhm.put(6,"嘤嘤嘤");
        lhm.put(2,"哈哈哈");
        System.out.println(lhm);
    }
}
