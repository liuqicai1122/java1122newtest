package com.offcn.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02_Map的第二种遍历方式 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("河北","石家庄");
        map.put("河南","郑州");
        map.put("湖南","长沙");
        map.put("菏泽","曹县");
        map.put("菏泽","巨野");
        System.out.println(map);
        //Map的第二种遍历方式
        // entrySet() 将我们map中的key和value存放到Entry内部类中`
        //我们又把内部类entry存放到set集合里
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //通过遍历集合,获取的是一个一个的Entry对象
        for (Map.Entry<String,String> entry: entries){
           // System.out.println(entry);
            //对象我们获取到了,我们获取key和value值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"===="+value);

        }

    }

}
