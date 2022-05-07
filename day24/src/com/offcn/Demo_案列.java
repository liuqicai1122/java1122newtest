package com.offcn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class Demo_案列 {
    public static void main(String[] args) {
        //我们想要 获取到字符串每一个数据
        String str="3,9,5,6,1,7";
        //通过截取,将字符串中的每一个数据存到数组里面
        String[] s=str.split(",");
        System.out.println(Arrays.toString(s));
        //创建TreeSet集合
        TreeSet<Integer> ts=new TreeSet<>();
        //遍历数组
        for (int index = 0; index <=s.length-1 ; index++) {
            //数组中每一个元素
            String i=s[index];
            //将数组中每一个元素添加到set集合里面
            //我们需要将String类型的数字转换成Integer
            ts.add(Integer.parseInt(i));
        }
        System.out.println(ts);
    }
}
