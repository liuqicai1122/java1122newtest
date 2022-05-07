package com.offcn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWorld01 {
    public static void main(String[] args) {
        //1)统计每个单词出现的次数
        //	(2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
        //	(3)打印格式：
        //		to=3  think=1  you=2
        String str="If you want to change your fate I think you must come to the ujiuye to learn java";
        Map<String,Integer> map =new HashMap<>();
        String[] s = str.split(" ");
        for (int index = 0; index <=s.length-1 ; index++) {
            String s1 = s[index];
            if (map.containsKey(s1)){
                Integer integer = map.get(s1)+1;
                map.put(s1,integer);
            }else{
                map.put(s1,1);
            }
        }
        //System.out.println(map);
        //遍历
        Set<String> str1 = map.keySet();
        for (String str2:str1) {
            Integer integer = map.get(str2);
            System.out.println(str2+"="+integer);
        }


    }

 }

