package com.offcn.map;

import java.util.*;

public class Demo04_案列2 {
    //例如，录入aaaabbccddd!@#@#$@#$%cc66ff
    //打印出来：a有4个，b有2个，c有4个，d有3个，!有1个，@有3个，$有2个，%有1个，6有2个，f有2个
    //public class Demo04_Map{
    //	/*
    //键盘录入一个字符串，统计每个字符出现的次数
    //例如，录入aaaabbccddd!@#@#$@#$%cc66ff
    //打印出来：a有4个，b有2个，c有4个，d有3个，!有1个，@有3个，$有2个，%有1个，6有2个，f有2个
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();

        for (int index = 0; index <s.length()-1 ; index++) {

            //h获取字符串中每一个字符
            char ch= s.charAt(index);
            if (map.containsKey(ch)){
                    //把字符存到map集合里面,验证这个字符在map中存不存在
                Integer integer = map.get(ch)+1;
                //如果存在 value自增1
                        map.put(ch,integer);
            }else{
                //这里是 这个字符在map集合中存不存在 第一次存在就存
                map.put(ch,1);
            }
        }
        Set<Character> characters = map.keySet();
        for (Character c: characters) {
            Integer integer = map.get(c);
            System.out.println(c+"有"+integer+"个");

        }


    }




}
