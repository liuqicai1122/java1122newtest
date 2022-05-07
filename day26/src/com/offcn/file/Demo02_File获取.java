package com.offcn.file;

import com.sun.org.apache.xerces.internal.xs.datatypes.XSDateTime;

import java.io.File;

public class Demo02_File获取 {
    public static void main(String[] args) {
        //绝对路径
        File f1=new File("D:\\test\\新建文件夹");
        //相对路径
        //File f2=new File("新建文本文档.txt") ;

        //getAbsolutePath():获取当前File对象的绝对路径
        String str = f1.getAbsolutePath();
        System.out.println(str);//e:\新建文件夹\新建文本文档.txt
        String str1 = f1.getAbsolutePath();
        System.out.println(str1);//E:\IntelliJ IDEA 2019.3.3\java1122_1\新建文本文档.txt

        //getPath():获取的是在构造方法中封装的路径
        String path = f1.getPath();
        System.out.println(path);//e:\新建文件夹\新建文本文档.txt
        String path1 = f1.getPath();
        System.out.println(path1);//新建文本文档.txt

        //getName():获取最底层的简单的文件或者文件夹名称(不包含所造目录的路径)
        String name = f1.getName();
        String name1 = f1.getName();
        System.out.println(name);//新建文本文档.txt
        System.out.println(name1);//新建文本文档.txt"
        //length():获取文件的字节个数
        //该方法被文件File对象调用时,返回的是文件的字节个数
        long length = f1.length();
        long length1 = f1.length();
        System.out.println(length);//9
        System.out.println(length1);//0
        //String[] list():获取当前文件夹下面的所有文件和文件夹名称,到一个字符串数组中
        String[] list = f1.list();
        System.out.println(list);

        //File[] listFiles():获取当前文件夹下的所有文件和文件文件file对象 到一个file对象数组中
        File[] files = f1.listFiles();
        for (File f:files) {
            System.out.println(f.toString());
        }

    }
}
