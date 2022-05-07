package com.offcn.file;

import java.io.File;

public class Demo03_File删除 {
    public static void main(String[] args) {
        File f1=new File("d:\\student");
        //删除文件夹使用delete()
        //这个删除不会经过我们的回收站
        boolean boo1 = f1.delete();
        System.out.println(boo1);
        //删除文件夹的时候,一定要保证  文件夹里面是空的内容的
        File f3=new File("d:\\animal");
        boolean boo2 = f3.delete();
        System.out.println(boo2);
        //删除文件,删除文件也用delete
        File f2=new File("d:\\test\\dog.txt");
        boolean boo3= f2.delete();
        System.out.println(boo3);
    }
}
