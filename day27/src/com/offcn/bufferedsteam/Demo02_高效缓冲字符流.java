package com.offcn.bufferedsteam;

import java.io.*;

public class Demo02_高效缓冲字符流 {
    public static void main(String[] args) throws IOException {
        //字符流 复制文件 有如下方式
        //1.一个字符 一个字符复制
        //2 字符数组复制
        //3 高效缓冲字符 一个字符一个字符复制
        //4 高效缓冲字符流特有的方法进行复制 readLine()
        //5 2+3
        //高效字符流
        BufferedReader br=new BufferedReader((new FileReader("doudizhu.txt")));
        BufferedWriter bw=new BufferedWriter((new FileWriter("doudizhu1.txt")));

        String i;//注意我们用的是readLine  所有i为一串字符串
        while((i=br.readLine())!=null){
              bw.write(i);
              //换行的方法
            //bw.write("\n");
            bw.newLine();
        }
            bw.close();
            br.close();

    }
}
