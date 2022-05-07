package com.offcn.string1.stringbuilder;

public class Demo01_StringBuilder {
    public static void main(String[] args) {
        //1.空参构造   StringBuilder()
        //构造一个不带任何字符的字符串生成器,其初始容量为16个字符.
        StringBuilder sb=new StringBuilder();
        //我们可以通过capacity() 返回值类型是int类型
        int capacity = sb.capacity();
        System.out.println(capacity);//16

        //2.StringBuilder(int capacity):创建一个生成器,初始容量为capacity大小
        StringBuilder  sb1=new StringBuilder(128);
        System.out.println(sb1.capacity());//128


        //3.StringBuilder(String str):创建一个生成器,初始值是str这些字符 初始大小为str.length+16
        StringBuilder sb2=new StringBuilder("aaaaa");
        System.out.println(sb2.capacity());//21

        //length获取的是真实存在的字符串中的字符的个数
        int length = sb.length();
        System.out.println(length);//0
        int length1 = sb2.length();
        System.out.println(length1);//5


    }
}
