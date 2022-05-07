package com.offcn.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01_Writer {
    public static void main(String[] args) throws IOException {
        //Write 字符输出流的  顶层抽象父类, FileWriter
        //最主要的就是writer方法
        FileWriter fw=new FileWriter("writer.txt",true);
        //write(ch) :将一个字符写入流中
        fw.write('中');
        fw.write('国');
        fw.write('牛');
        fw.write('逼');
        //write(char[]):将一个字符`数组写入流中
        char[]c={'我','爱','中','国'};
        fw.write(c);

        //write(String):将一个字符串写入 流中
        fw.write("刘奇才真牛逼,未来的it行业大能");
        fw.write("\n");


        fw.close();
    }
}
