package com.offcn.serializable;

import java.io.*;

public class Demo02_对象反序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象反序列化 就是将对象从 文件里面获取出来
        //ObjectInputStream
        //ObjectInputStream(InputStream in)创建从指定InputStream 读取的ObjectInputStream

        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("student.txt"));
        //readObject()从 ObjectInputStream读取对象
        //readObject()  从ObjectInStream读取对象
        //Student stu=(Student)(ois.readObject());
        //System.out.println(stu.getName());//张三
        //System.out.println(stu.getAge());//13
        Object  obj;
        while((obj=ois.readObject())!=null){
            Student stu=(Student)obj;
            System.out.println(stu.getName());
            System.out.println(stu.getAge());
        }
        //关流
        ois.close();
            
        }


    }

