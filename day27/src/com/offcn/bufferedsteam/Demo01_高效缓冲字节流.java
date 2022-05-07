package com.offcn.bufferedsteam;

import java.io.*;

public class Demo01_高效缓冲字节流 {
    public static void main(String[] args) throws IOException {
        //我们现在对文件的赋值,我们学习了几种方式
        //第一种:单个字节进行复制
        //第二种:字节数组进行文件复制
        //第三种:高效缓冲字节流
        //第四种:字节数组+高效字节缓冲流
        //高效字节缓冲流
        //BufferedInputStream   BufferedOutputStream
        BufferedInputStream bis=new BufferedInputStream((new FileInputStream("hhhhh.txt")));
        BufferedOutputStream bos=new BufferedOutputStream((new FileOutputStream("h.txt")));
        //定义一个变量
        int len=0;
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
