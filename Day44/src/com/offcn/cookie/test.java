package com.offcn.cookie;

public class test {
    public static void main(String[] args) {
        String s = new String("hello");
        String s2=new String("hello");
        System.out.println(s==s2);//false
        System.out.println(s.equals(s2));//true
        System.out.println("hello"=="hello");//true
    }
}
