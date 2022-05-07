package com.offcn;

import java.lang.reflect.Array;
import java.util.*;

public class HomeWorld02 {
    public static void main(String[] args) {
        List <String>list=new ArrayList<>();
        list.add("张三丰,北京");
        list.add("李四丰,上海");
        list.add("王二小,北京");
        list.add("小明,河北");
        list.add("小毛,北京");
        list.add("王五,北京");
        //要求：求出每个地区有多少人，都是谁？
        Map<String,String> hm=new HashMap<>();
       // HashMap<String,Integer> hm1=new HashMap<>();
        int count=1;
        for (String str:list) {
            String[] sp = str.split(",");
            if (hm.containsKey(sp[1])){
                hm.put(sp[1],hm.get(sp[1])+" "+sp[0]);
            }else {
                hm.put(sp[1], sp[0]);
            }

        }
        System.out.println(hm);
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> bb:entries) {
            String value = bb.getValue();
            String[] s = value.split(" ");
           System.out.println(bb.getKey()+"有"+s.length+"人"+"他们是"+bb.getValue());

        }

    }
}
