package com.offcn.dayinliu;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01_字节打印流 {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out 打印到控制台上面
        //System.out==>PrintStream
        //PrintStream(File f) 通过file对象构建字节打印流对象
        //PrintStream(String path) 通过String 路径构建字节打印流对象
        PrintStream ps=new PrintStream("copy.txt");
        //ps=System.out;
        ps.println("嘻嘻嘻嘻");
        ps.println("哈哈哈哈哈");
        System.out.println("阿巴阿巴巴");
        ps.close();

    }
}
