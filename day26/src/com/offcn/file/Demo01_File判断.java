package com.offcn.file;

import java.io.File;

public class Demo01_File判断 {
    public static void main(String[] args) {
        File f1=new File("e:\\新建文件夹");
        //exists():判断当前调用者File对象是否存在
        boolean boo1 = f1.exists();
        System.out.println(boo1);//true

        //isFile():判断当前调用者File对象是否是文件
        boolean boo2 = f1.isFile();
        System.out.println(boo2);//false

        //isDirectory():判断当前调用者File对象是否是文件夹
        boolean directory = f1.isDirectory();
        System.out.println(directory);//true

    }
}
