package com.offcn.dayinliu;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo02_字符打印流 {
    public static void main(String[] args) throws FileNotFoundException {
            //PrintWriter  属于字符流的子类
        PrintWriter pw=new PrintWriter("h.txt");
        pw.write("嘤嘤嘤");
        pw.println("\n");
        pw.println("啊哈啊哈哈哈哈");
    pw.close();
    }
}
