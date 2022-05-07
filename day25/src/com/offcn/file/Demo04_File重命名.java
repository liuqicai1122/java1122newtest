package com.offcn.file;

import java.io.File;

public class Demo04_File重命名 {
    public static void main(String[] args) {
       // File f1=new File("d:\\test\\dog.txt");
        //重命名 renameTo(File dest)  同一个文件夹下面 就是重命名
       // f1.renameTo(new File("d:\\test\\cat.txt"));

        //不同文件夹下面,先移动,后重命名
        File f2= new File("d:\\test\\cat.txt");
        boolean b = f2.renameTo(new File("e:\\hhh\\HelloWorld.txt"));
        System.out.println(b);

    }
}
