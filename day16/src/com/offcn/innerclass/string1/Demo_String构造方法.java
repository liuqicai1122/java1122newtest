package com.offcn.innerclass.string1;

public class Demo_String构造方法 {
    public static void main(String[] args) {
        //1.String():创建一个空的字符串 空参构造
        String str1=new String();
        //2.String(String str) 创建参数字符串的一个副本
        //(参数字符串是在常量中,构造方法创建的字符串是在堆内存中)
        String str2= new String("adwadeaf");
        System.out.println(str2);
        //3. String(byte[] arr) 将一个字节数组转成一个字符串
        byte[] b ={23,42,54,65};
        String str3=new String(b);
        System.out.println(str3);
        //4.String(byte[] arr,int offset,int length):将字节数组的一部分转成字符串
        //offset 开始的索引()包含
        //length 个数
        String str4=new String(b,2,2);
        System.out.println(str4);

        //5. String (char[] arr):将字符数组转成字符串
        char[] c={'a','n','w',2414};
        String str5=new String(c);
        System.out.println(str5);

        //6. String(char[] arr , int  offset,int length):将字符数组的一部分转成字符串
        String str6=new String(c,1,3);
        System.out.println(str6);
    }
}
