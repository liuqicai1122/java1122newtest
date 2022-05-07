package com.offcn.filecopy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo05_IO流关流处理 {
    public static void main(String[] args) {
        //jdk1.7之后关流操作
          /*  try(
          流对象的创建;
          ){
          流对象的使用
          }catch(IOException e){
            异常处理方式;
           }
           * */
            try(//文件的复制
                //字节输入输出流
                FileReader fr=new FileReader("e:\\hhh\\HelloWorld.txt");
                FileWriter fw=new FileWriter("HelloWorld.txt");
                    ){
                     int len=0;
                     while ((len=fr.read())!=-1){
                         fw.write(len);
                     }
            }catch (IOException e){
                e.printStackTrace();
            }
    }

}
