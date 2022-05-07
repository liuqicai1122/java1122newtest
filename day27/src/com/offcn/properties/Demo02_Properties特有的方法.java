package com.offcn.properties;

import java.util.Properties;
import java.util.Set;

public class Demo02_Properties特有的方法 {
    public static void main(String[] args) {
        //创建对象
        Properties p=new Properties();
        //存数据
        //public Object setProperty(String key,String value):保存一对属性
        p.setProperty("username","root");
        p.setProperty("passwork","123456");
        //public String getProperty(String key):使用此属性列表中指定的键搜索属性值
        String username = p.getProperty("username");
        //public Set<String> stringPropertyNames()  : 所有键的名称集合
        Set<String> strings = p.stringPropertyNames();
        for (String key: strings) {
            String property = p.getProperty(key);
            System.out.println(key+"   "+property);
        }

    }
}
