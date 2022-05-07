package com.offcn.string1.stringbuilder;

public class Demo06_StringBuilder字符串比较 {
    public static void main(String[] args) {
        /*  == 既可以比较基本数据类型也可以比较引用数据类型
          ==比较基本数据类型的时候,比较的是具体的值
        *==比较引用数据类型的时候,比的是地址值
        *equals:只能比较引用数据类型
        重写之前,比较的是地址值
        重写之后,比较的是具体的内容
        * */
        String str1="abc";
        String str2="ab";
        String str3=new String("abc");
        //比较的是地址值
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false

        //equals()在String中  比较的是具体的内容
        /*equals()  是Object的方法,String 中的equals()重写了Object中的方法
        1 首先比较的是地址值:如果地址值相同,证明是同一个对象直接返回true
        *2.如果地址不同,判断两个字符串的长度是否相同,不相同返回值false
        *3.相同 比较字符串中的每个字符,全部相同,返回true

        * */
        System.out.println(str1.equals(str3));//true
        Object obj=new Object();
        obj.equals(str1);//return (this==obj)
        System.out.println(obj.equals(str1));//false
    }
}
