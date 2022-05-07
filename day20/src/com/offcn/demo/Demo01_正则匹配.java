package com.offcn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01_正则匹配 {
    public static void main(String[] args) {
            //Pattern类  这个类没有构造方法,里面有静态方法,还有非静态方法
        //static Pattern    compile(String  regex)
        Pattern pat1 = Pattern.compile("abc");
            //Matcher m= p.matcher(要匹配的字符串)
        Matcher mat1 = pat1.matcher("abc");
            //m.matches()返回true表示匹配,返回false表示不匹配
        boolean boo = mat1.matches();
        System.out.println(boo);//true

        //Pattern.matches(正则,字符串)
       /* boolean abc = Pattern.matches("123", "abc");
       System.out.println(abc);//false*/


       //在String中 有一个方法
        //常用的方法
        //str.matches(正则)
        boolean boo1 = "abc".matches("abcd");
        System.out.println(boo1);


    }
}
