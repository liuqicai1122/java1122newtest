package com.offcn.collecction;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01_Iterator {
    public static void main(String[] args) {
        //Iterator 与集合的遍历有关
        Collection<String> col =new ArrayList<>();
        col.add("山西雨化田");
        col.add("大哥王力宏");
        //我们打印引用数据类型的时候如果内容不是地址 就是重写了toString;
        System.out.println(col);

        //多态
        Iterator<String> it = col.iterator();
        //String str1 = it.next();
        //System.out.println(str1);//山西雨化田
        //Iterator 有两个方法
        //判断是否有元素
        /*boolean boo1 = it.hasNext();
        System.out.println(boo1);
        boolean boo2 = it.hasNext();
        System.out.println(boo2);
        boolean boo3 = it.hasNext();
        System.out.println(boo3);*///这些由于没有next取值 所有判断的都是第一个 山西雨化田
        //如果有元素取值
        /*String str1 = it.next();
        System.out.println(str1);
        String str2 = it.next();
        System.out.println(str2);
        //取完了
        boolean b = it.hasNext();
        System.out.println(b);//false
        boolean b1 = it.hasNext();
        System.out.println(b1);//false
*/
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }


    }

}
