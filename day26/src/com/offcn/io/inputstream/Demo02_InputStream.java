package com.offcn.io.inputstream;

import java.io.*;

public class Demo02_InputStream {
    public static void main(String[] args) throws IOException {
        //InputStream 是字节输入流的顶级抽象类
        //里面有一个很重要的方法 read() 一个字节一个字节的读
        //read[byte[]arr]   一个字节数组 一个数组的读
        //我们要玩read()不能直接玩,创建一个FileInputStream
        //玩io的3个步骤
        //  第一步 导包
        //  第二步 创建对象
        //  第三步 关流

        //我们IO流玩的是文件,当我们封装File路径的时候,需要是文件的路径
        //FileInputStream(File f):将File对象封装成字节输入流,将来可以读取这个文件中的信息
        File f = new File("E:\\hhh\\HelloWorld.txt");
        FileInputStream fis = new FileInputStream(f);
        //FileInputStream(String path):将字符串封装成字节输入流,将来可以读取信息
       // FileInputStream fis1=new FileInputStream("E:\\hhh\\HelloWorld.txt");

        //read()
        /*int read = fis1.read();
        System.out.println(read);//97
        int read1 = fis1.read();
        System.out.println(read1);//32
        int read2 = fis1.read();
        System.out.println(read2);//98
        int read3 = fis1.read();
        System.out.println(read3);//32
        int read4 = fis1.read();
        System.out.println(read4);//99
        */
        //读取最后一个完了 在使用read()方法 会输出-1


        FileInputStream fis1=new FileInputStream("E:\\hhh\\HelloWorld.txt");
        //直接遍历出来 不用一个一个打
        int i=0;
       while((i=fis1.read())!= -1){
           // System.out.print(i+"  ");//打印出数字
           //System.out.println();
           System.out.print(i+" ");//打印书
        }
       fis.close();
       fis1.close();

    }


}
