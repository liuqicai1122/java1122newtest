package com.offcn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01_删除 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        //添加 添加任意的数据类型
        col.add("hello");
        col.add("world");
        col.add("12");
        col.add("13");
        col.add("12");
        col.add("14");
        System.out.println(col);
        //删除
        //clear() 移除此collection中所有元素 全部清空
        //col.clear();
        //System.out.println(col);

        //boolean remove(Object o) 删除的是集合中的元素o,如果有删除成功,没有删除失败
        boolean remove = col.remove("12");
        System.out.println(remove);//true
        System.out.println(col);//[hello, world, 13, 12, 14] 按照顺序只删除一个


        //boolean removeAll(Collection<?> c) removeAll 里面需要传递一个参数
        ArrayList list=new ArrayList();
        list.add("12");
        list.add("13");
        list.add("14");
        list.add(12);

        boolean b = col.removeAll(list);
        //removeAll  效果是删除与后面集合里面相同的元素
        System.out.println(b);//true
        System.out.println(col);//[hello, world] 将list中有的元素全部删除
        System.out.println(list);//[12, 13, 14, 12]

    }

}
