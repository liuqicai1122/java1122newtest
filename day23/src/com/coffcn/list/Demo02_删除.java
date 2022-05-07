package com.coffcn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02_删除 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小红");
        list.add("小白");
        list.add("小黑");
        list.add("小绿");
        list.add("小傻逼");
        //所说的有序,是存取有序
        System.out.println(list);
        //增强for循环
       // ConcurrentModificationException
       /* for (String str:list) {
                list.remove(str);
        }*///报错
        //并发修改异常
       /* Iterator<String> it = list.iterator();
            while (it.hasNext()){
                String next = it.next();
                list.remove(next);
            }*/
            //普通的for循环
       /* int size = list.size()-1;
        for (int index = 0; index <size ; index++) {
            //删除获取的元素
            String s = list.get(0);
            list.remove(s);
        }*///正向思维
        //逆向思维
        for (int i = list.size()-1; i >=0 ; i--) {
            String s = list.get(i);
            list.remove(s);
        }
        System.out.println(list);

    }
}
