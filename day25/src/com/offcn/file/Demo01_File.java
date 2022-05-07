package com.offcn.file;

import java.io.File;
import java.nio.channels.FileLockInterruptionException;

public class Demo01_File {
    public static void main(String[] args) {
        //File(String pathname)
        //通过将给定路径名字符串转换为抽象路径名来创建一个新的File实列
        //带盘符是 绝对地址
        File f=new File("d:\\test\\abc.txt");
        System.out.println(f);//d:\test\abc.txt
        //不带盘符的是 相对地址
        File f1=new File("ABC.txt");
        System.out.println(f1);//ABC.txt

        //File(String parent,String child)
        //根据parent 路径名字符串和child 路径名字符串创建一个新的
        File f2= new File("d:\\text","abc.txt");
        System.out.println(f2);//d:\text\abc.txt

        //File(File parent,String child)
        //根据parent 抽象路径名和child路径名字符串创建一个新的File实例;
        File f3=new File(new File("E:\\"),"abc.ppt");
        System.out.println(f3);

    }
}
