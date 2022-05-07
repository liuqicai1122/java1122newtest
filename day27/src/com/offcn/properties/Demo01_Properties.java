package com.offcn.properties;

import java.util.Properties;

public class Demo01_Properties {
    public static void main(String[] args) {
        //这里告诉大家 Properties本质是map集合 就是map家族里面的一类
        //Properties 本质是一个map集合
        //是Hashtable 的一个子类 key和value不允许null
        Properties p=new Properties();
        p.put("12","23");
        p.put("123","213");
        System.out.println(p);
        for (Object key:p.keySet() ) {
            Object value = p.get(key);
            System.out.println(key+"     "+value);
        }

    }
}
