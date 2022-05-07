package com.offcn.string1;

public class HomeWork1 {
    //定义 字符串“Hi If you want to change your life , you must work hard !”, c
    //将该字符串中,含有两个字母的单词获取出来,并计算多少个
    public static void main(String[] args) {
        String str =new String("Hi If you want to change your life , you must work hard !");
        String[] str1 = str.split(" ");
        int count=0;
        for (int index = 0; index <=str1.length-1 ; index++) {
            String str2= str1[index];
            if (str2.length()==2){
                System.out.println(str2+"  ");
                count++;
            }
        }
        System.out.println("含两个字母的单词一共有"+count+"个");
    }

}