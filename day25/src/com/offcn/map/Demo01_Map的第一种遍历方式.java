package com.offcn.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01_Map的第一种遍历方式 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("河北","石家庄");
        map.put("河南","郑州");
        map.put("湖南","长沙");
        map.put("菏泽","曹县");
        map.put("菏泽","巨野");
        System.out.println(map);
        //遍历的第一种方式
        //kyeSet 把key值取出来 放到Set集合里面
        Set<String> strings = map.keySet();
        for (String key: strings) {
            //遍历set集合,取出set集合里面的每一个key值
            //System.out.println(str);
            //我们可以通过key值获取value值
            String value = map.get(key);//get(key) 根据key值获取对应的value值
            System.out.println(key+"====="+value);
        }

    }
}
