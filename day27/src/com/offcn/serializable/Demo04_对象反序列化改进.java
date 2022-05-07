package com.offcn.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo04_对象反序列化改进 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象的反序列化 就是将对象从文件中获取出来
        //ObjectInputStream
                //ObjectInputStream(InputStream in ) 创建从指定InputStream 读取的   ObjectInputStream
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("student1.txt"));
        ArrayList<Student>list = (ArrayList<Student>) ois.readObject();
        for (Student stu:list) {
            System.out.println( stu.getAge());
            System.out.println(stu.getName());
        }
        //关流
        ois.close();


    }
}
