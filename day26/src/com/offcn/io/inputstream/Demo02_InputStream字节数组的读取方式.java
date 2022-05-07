package com.offcn.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo02_InputStream字节数组的读取方式 {
    public static void main(String[] args) throws IOException {
            //我们玩Io玩的是文件,当我们封装File路径的时候,需要的是文件的路径
        //FileInputStream(File f):将File对象封装成字节输入流,将来可以读取这个文件中的信息
        InputStream fis1=new FileInputStream("d:\\test\\cat.txt");
        //字节数组的读取方式
        //read(byte[]arr)
        //定义一个变量
         int len=0;
         //创建byte类型的数组
        byte[] b=new byte[3];
        while((len=fis1.read(b))!=-1){
                //new String(b,0,len)
                //通过String的构造方法,将byte类型的数组转换成String
            System.out.println(new String(b,0,len));
        }
        fis1.close();






    }
}
