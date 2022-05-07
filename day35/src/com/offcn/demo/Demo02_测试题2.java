package com.offcn.demo;

import java.util.*;

public class Demo02_测试题2 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();//录入
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);//转成一个一个的字符
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);//如果存在 则在value在原来基础上加1
            } else {
                map.put(c, 1);//如果不存在 则首次存入
            }
        }


        Set<Map.Entry<Character, Integer>> entries = map.entrySet();//遍历集合

        int i=0;
        for (Map.Entry<Character, Integer> mmm : entries) {

                i=i+ mmm.getValue() * mmm.getValue();

        }
        System.out.println("字符串"+next+"总价值为"+i);

    }
}
