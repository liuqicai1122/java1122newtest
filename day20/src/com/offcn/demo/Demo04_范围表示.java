package com.offcn.demo;

public class Demo04_范围表示 {
    public static void main(String[] args) {
        //1, [abc]任意的a或b或c
        System.out.println("b".matches("[abc]"));
        //2.[^abc]除了 abc 都可以
        System.out.println("e".matches("[^abc]"));
        //3.[a-zA-Z] a到z或A到Z 两头的字母包含在内(范围)
        System.out.println("a".matches("[a-z]"));
        //4.[a-d[m-p]]a到d 或者m到p 并集
        System.out.println("f".matches("[a-b[e-h]]"));
        //5. [a-z&&[abc]] 交集
        System.out.println("c".matches("[a-z&&[abc]]"));
        //[a-z&&[^abc]] a到z之间 除了abc
        System.out.println("e".matches("[a-z&&[^abc]]"));
        //[a-z&&[^m-p]]  a到z之间 不包括m到p
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false
    }
}
