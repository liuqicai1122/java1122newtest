package com.offcn.filecopy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03_字符流文件拷贝 {
    public static void main(String[] args) throws IOException {
        //字符流只能拷贝纯文本文档
        FileReader fr=new FileReader("e:\\hhh\\HelloWorld.txt");
        FileWriter fw=new FileWriter("HelloWorld.txt");

        int len=0;
        char [] ch=new char[1024];
        while((len=fr.read(ch))!=-1){
           fw.write(ch,0,len);
        }
        //关流
        fw.close();
        fr.close();
    }
}
