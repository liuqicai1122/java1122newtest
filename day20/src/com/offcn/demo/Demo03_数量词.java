package com.offcn.demo;

public class Demo03_数量词 {
    public static void main(String[] args) {
        //1. X? 一次 或一次都没有
        System.out.println("a".matches("a?"));
        //2.   X* 零次或多次(连续的)
        System.out.println("aaaaaa".matches("a*"));
        //3. x+ 一次或多次
        System.out.println("a".matches("a+"));
        //4. x{n}  恰好n次
        System.out.println("aaaa".matches("a{4}"));
        //5. x{n,} 最少n次
        System.out.println("aaaaaaaa".matches("a{4,}"));
        //6. x{n,m}至少n次,但是不超过m次  包含 m次
        System.out.println("aaaaa".matches("a{3,5}"));

    }
}
