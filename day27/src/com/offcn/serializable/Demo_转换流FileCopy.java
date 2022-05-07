package com.offcn.serializable;

import java.io.*;

public class Demo_转换流FileCopy {
    public static void main(String[] args) throws IOException {
        //InputStreamReader 是字节到字符的桥梁
        //OutputStreamWriter 是字符流通向字节流的桥梁

        //InputStreamReader(InputStream in, String charsetName) 字符输入流
        //    创建使用指定字符集的    InputStreamReader
        //String charsetName 现在这个文件是怎样的一种编码格式
        InputStreamReader isr=new InputStreamReader(new FileInputStream("copy.txt"),"utf-8");
        //OutputStreamWriter(OutputStream out,String charsetName)
        //                     创建使用指定字符集的  OutputStreamWriter
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("hhhhh.txt"),"utf-8");
        //读写操作
        int len=0;
        while((len=isr.read())!=-1){
            osw.write(len);
        }
        isr.close();
        osw.close();
    }
}
