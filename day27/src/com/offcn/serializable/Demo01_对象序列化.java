package com.offcn.serializable;

import java.io.*;

public class Demo01_对象序列化 {
    public static void main(String[] args) throws IOException {
        /*ObjectOutputStream 对象输出流:对象的序列化
         *将对象存到文件中
         *ObjectOutputStream(OutputStream os)
         *FileOutputStream fos=new FileOutputStream("student.txt")
         */
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"));
        //writeObject(Object obj) 写对象
        oos.writeObject(new Student("张三" ,13));
        oos.writeObject(new Student("李四" ,35));
        oos.writeObject(new Student("王五" ,24));
        oos.writeObject(new Student("二狗" ,23));
        oos.close();
    }


}
