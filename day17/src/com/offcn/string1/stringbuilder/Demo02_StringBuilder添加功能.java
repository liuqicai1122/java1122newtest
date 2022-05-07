package com.offcn.string1.stringbuilder;

public class Demo02_StringBuilder添加功能 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("agew");
       // System.out.println(sb);//agew
        //1.添加append()可以将任意数据类型 转成字符 添加到生成器中
        StringBuilder append = sb.append(32);
        sb.append('l');
        sb.append("傻逼");
        sb.append(false);
        System.out.println(sb);

        //2.insert(int index,任意数据类型):可以将任意数据类型,添加到指定的位置
        //说明:1. index的范围是0到当前的缓冲区大小 2.插入数据后,数据本身的索引就是参数中指定的index
        sb.insert(0,"傻BI");
        System.out.println(sb);
        sb.insert(2,"嘿嘿嘿");
        System.out.println(sb);
    }
}