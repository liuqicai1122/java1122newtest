package com.offcn.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04_IO流关流处理 {
    public static void main(String[] args) {

        //jdk1.7之前的关流操作
    //文件的复制
    //字节输入输出流
    FileInputStream fis=null;
    FileOutputStream fos=null;
    try{
        fis=new FileInputStream("d:\\test\\cat.txt");
        fos=new FileOutputStream("copy.txt");
        //利用字节输入流,将cat.txt里面的数据,读到内存中
        int len=0;
        //我们真正在做文件复制的时候,字节数组肯定要用,但是这个字节数组的大小有一些要求
        //大小要求是1024的倍数,最大不能超过8倍
        byte[] b=new byte[1024*8];
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len );
        }
    } catch (IOException e){
        e.printStackTrace();
    }finally {
        //我们要求,只要使用了流,无论成功还是失败,流一定要关
        try{
            if(fos!=null){
                fos.close();
            }
            if (fis!=null){
                fis.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    }
}
