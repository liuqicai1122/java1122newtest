package com.offcn.innerclass.string1;

public class Demo_String判断方法 {
    public static void main(String[] args) {
        String str1="abcd";
        String  str2="abcd";
        String str3=new String("abcd");
        //1.equals(Object  obj):判断调用者和参数对象描述的字符串内容是否相同
        //equals 比的是字符串的内容
        //会有返回值类型 boolean
        boolean bool=str1.equals(str2);
        System.out.println(bool);//true
        System.out.println(str1.equals(str3));//true
        //2.equalsIgnoreCase(String otherStr):忽略大小写判断两个字符串内容是否相同
        String str4="HELLoworld";
        String str5="helloworld";
        System.out.println(str4.equalsIgnoreCase(str5));//true

        //3.contains(String str):判断调用者是否包含了str 这个子串
        //一个内容长的字符串,调用这个方法,方法参数列表里面是短的字符串
        String str6="helloworld";
        String str7="wor";
        System.out.println(str6.contains(str7));//true

        //4.startsWith(String prefix):判断调用者是否以prefix开头;
        System.out.println(str6.startsWith("hell"));//true

        //5.endsWith(String suffix):判断调用者是否以suffix结尾
        System.out.println(str6.endsWith("ld"));//true

        //6.isEmpty():判断    调用者是否是空串
        String str9="";
        boolean boo4=str9.isEmpty();
        System.out.println(boo4);


    }
}
