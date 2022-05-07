package com.offcn.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01_OutputStream {
    public static void main(String[] args) throws IOException {
        //OutputStream是字节输出流的顶层抽象父类,不能创建对象
        //最主要的方法就是write()
        //fileOutputStream中构造方法里面的文件可以不存在
        FileOutputStream fos=new FileOutputStream("d:\\test\\cat.txt");
        //写文件输出流的操作
        //在字节输出流中,书写int值的时候,取值范围 0-65535
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        //我们也可以写一个字节数组
        byte[]b ={65,66,67,68};
        fos.write(b);

        byte[] bytes = "我很帅,可以输出中文".getBytes();
        fos.write(bytes);
        fos.close();

    }
}
