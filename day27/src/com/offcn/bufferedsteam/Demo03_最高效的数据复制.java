package com.offcn.bufferedsteam;

import java.io.*;

public class Demo03_最高效的数据复制 {
    public static void main(String[] args) throws IOException {
        //高效字节缓冲流
        //BufferedInputStream  BufferedOutputStream
        BufferedInputStream bis=new BufferedInputStream((new FileInputStream("doudizhu.txt")));
        BufferedOutputStream bos=new BufferedOutputStream((new FileOutputStream("doudizhu2.txt")));

        int len=0;
        byte[] arr=new byte[1024*8];
        while((len=bis.read(arr))!=-1){
             bos.write(arr,0,len);
        }
        bos.close();
        bis.close();
    }
}
