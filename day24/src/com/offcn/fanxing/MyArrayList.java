package com.offcn.fanxing;

import java.util.ArrayList;

public class MyArrayList<E> {
    //泛型类的定义
    //权限修饰符 class 类名
    //<泛型的声明名称>:泛型的声明名称是由26个大写的英文字母组成
    //泛型的声明名称:作用  后期再去使用这个MyArraysList对象的时候,我们可以定义E 当成任意数据类型
    //泛型的具体的确认类型的时机,是使用这个类创建对象的时候
        ArrayList<E> list=new ArrayList<>();
        public void add(E e) {
            list.add(e);
        }

}
