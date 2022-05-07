package com.offcn.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02_FileCopy02 {
    public static void main(String[] args) throws IOException {
        //文件的复制
        //字节输入输出流
        FileInputStream fis=new FileInputStream("D:\\test\\cat.txt");
        FileOutputStream fos=new FileOutputStream("D:\\dog.txt");
        //利用字节输出流,将cat.txt里面的数据读到内存中
        int len=0;
        //我们真正要做文件复制的时候,字节数组肯定要用,但是对于这个字节数组大小有一些要求
        //大小要求是1024的倍数,最大不能超过8倍
        long l = System.currentTimeMillis();
        byte[] b=new byte[1024*8];
        while ((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);//0
        //一定要关流
        fos.close();
        fis.close();
    }

}
