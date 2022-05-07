package com.offcn.file;

import java.io.File;
import java.io.IOException;

public class Demo02_File类型的创建 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\student");
        //boolean createNewFile():  创建当前对象File对象所描述的路径的文件
        //注意:createNewFile 创建文件的,不要给文件夹的路径
        //要去创建文件,必须前面的所有文件夹的路径真实存在
        boolean boo1 = f.createNewFile();
        System.out.println(boo1);
        //boolean mkdir():创建当前File对象所描述的路径的文件夹
        //(如果父级路径不存在,那么不会自动创建父级路径)
        //mkdir()只能创建一级文件夹
        File f1=new File("d:\\test");
        boolean boo2 = f1.mkdir();
        System.out.println(boo2);

        //boolean mkdirs():创建当前File对象所描述的路径的文件夹
        //(如果父级路径不存在,那么自动创建父级路径)
        File f2=new File("d:\\animal\\aog\\大黄");
        boolean boo3 = f2.mkdirs();
        System.out.println(boo3);
    }
}
