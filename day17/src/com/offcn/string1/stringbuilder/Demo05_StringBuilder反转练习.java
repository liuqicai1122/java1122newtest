package com.offcn.string1.stringbuilder;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Demo05_StringBuilder反转练习 {
    public static void main(String[] args) {
        String   str="gawwaegw";
            Demo05_StringBuilder反转练习 i= new Demo05_StringBuilder反转练习();
        System.out.println(i.reverseStr(str));
        System.out.println(reverseStr(str));
    }

    //练习 定义一个方法,接收一个String类型的字符串,返回该字符的反转形式
    //J举列 接收字符串为abc 反转为cba
    //要求使用StringBuilder进行反转
    public static StringBuilder  reverseStr(String str){
        //怎么样将str转化成stringbuilder
        StringBuilder sb= new StringBuilder(str);
        //调用StringBuilder反转方法
        sb.reverse();
        return  sb;
      //  return sb+"";
        //return  String.valueOf(sb);
    }
}
