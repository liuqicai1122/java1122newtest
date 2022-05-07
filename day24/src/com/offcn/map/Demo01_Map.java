package com.offcn.map;

import java.util.HashMap;
import java.util.Map;

public class Demo01_Map {
    public static void main(String[] args) {
        //Map是双列集合的顶层父类
        //map不允许key值重复,但是允许 value值重复
        //map也是无序的,没有索引
        //key值可以允许为null,但是只能有一个

        Map<String ,Integer> map=new HashMap<>();
        //put( K key, V value)向map中添加数据
        map.put(null,3);
        map.put(null,222);
        map.put("北京",12);
        map.put("上海",12);
        map.put("安阳",213);
        System.out.println(map);
        //putAll(Map<?extends K,? extends V>m)  向Map中添加另一个Map集合
        Map<String,Integer> map1=new HashMap<>();
        map1.put("郑州",88);
        map1.put("安阳",11);
        map.putAll(map1);
        System.out.println(map);
        //isEmpty() Map中是否包含数据
        boolean empty = map.isEmpty();
        System.out.println(empty);//false
        //size() Map中包含键值的个数
        int size = map.size();
        System.out.println(size);
        //clear()清空Map
       /* map.clear();
        System.out.println(map);*/
        //containsKey(key) 判断Map中是否包含key
        boolean boo2 = map.containsKey("北京");
        System.out.println(boo2);//true
        //containsValue(value) 判断Map中是否包含Value
        boolean b = map.containsValue(12);
        System.out.println(b);//true

    }
}
