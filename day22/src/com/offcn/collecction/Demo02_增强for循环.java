package com.offcn.collecction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02_增强for循环 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("王力宏真牛逼");
        col.add("遥远的中国有一条宏,他的名字就叫做力宏");
        col.add("吴亦凡也牛逼的很");
        //集合遍历的第一种方式
    /*    Iterator<String> it = col.iterator();
        while (it.hasNext() ){
            String next = it.next();
            System.out.println(next);
        }*/
        //增强for循环遍历格式
        //数据类型:集合里面的元素的数据类型
        //for(数据类型  变量名:集合名){}
        for (String str:col) {
            System.out.println(str);
        }
        int[] arr={12,32,43,21,321};
        for (int num: arr){
            System.out.println(num);
        }

    }
}
