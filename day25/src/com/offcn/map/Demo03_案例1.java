package com.offcn.map;

import com.sun.org.apache.xml.internal.resolver.readers.TR9401CatalogReader;

import java.util.HashMap;
import java.util.Map;

//案例1：编写一个方法，完成英译汉翻译功能。
//dog--->狗
//cat--->猫
//pig--->猪
//monkey--->猴
//cow---> 牛
public class Demo03_案例1 {
    public static void main(String[] args) {
        translate("fw");
        translate("dog");
    }

    public static void translate(String world) {
        Map<String, String> map = new HashMap<>();
        map.put("dog", "狗");
        map.put("cat", "猫");
        map.put("pig", "猪");
        map.put("monkey", "猴");
        map.put("cow", "牛");
        String s = map.get(world);
        if (map.containsKey(world)) {
            System.out.println("该单词翻译为"+s);
        } else {
            System.out.println("没有这个单词的翻译");
        }
    }

}

