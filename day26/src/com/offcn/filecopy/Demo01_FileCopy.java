package com.offcn.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01_FileCopy {
    public static void main(String[] args) throws IOException {
        //文件的复制
        //字节输入输出流
        FileInputStream fis=new FileInputStream("D:\\test\\cat.txt");
        FileOutputStream fos=new FileOutputStream("D:\\dog.txt");
        //利用字节输出流,将cat.txt里面的数据读到内存中
        int len=0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        //一定要关流
        fos.close();
        fis.close();
    }

}
