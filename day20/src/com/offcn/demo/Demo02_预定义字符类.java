package com.offcn.demo;

public class Demo02_预定义字符类 {
    public static void main(String[] args) {
        //1. . 代表可以匹配任何一个字符
        //String regex=".";
        String str1="哈哈";
        boolean boo1 = str1.matches("..");
        System.out.println(boo1);//true
        //2.\d 匹配的[0-9]
        boolean boo2 = "1a".matches("\\d.");
        System.out.println(boo2);//true
        //3. \D  除了[0-9]都可以
        boolean boo3 = "A".matches("\\D");
        System.out.println(boo3);//true
        //4. \s  空白字符串[  \t\n\x0b\f\r]
        boolean boo4 = "\t".matches("\\s");
        System.out.println(boo4);//true
        //5. \S 除了空白字符串[  \t\n\x0b\f\r]
        boolean boo5 = "d".matches("\\S");
        System.out.println(boo5);//true

        //6. \w 单词字符   单词字符:[a-zA-Z_0-9]
        boolean boo6 = "9".matches("\\w");
        System.out.println(boo6);//tru
    }
}
