package com.offcn.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo03_Properties与IO流结合 {
    public static void main(String[] args) throws IOException {
        //创建配置文件
        Properties p= new Properties();
        //读取配置文件
        //1. Load(InputStream inStream):通过Load方法,将InputStream 字节流读取到配置文件信息,放置到
        //properties的键值对集合中
        p.load(new FileInputStream("config.properties"));
        //2 load(Reader read):通过load方法,将reader 字符流读取到的配置文件放置到properties的键值对集合中
        //(String, String)中
        System.out.println(p);
        //修改配置文件的内容 将 name改成 zhangsan
        //setProperty(String key,String  value):只是修改了集合中的变量,并没有修改文件内容
      p.setProperty("username","zhangsan");
        p.setProperty("wwwww","fweafwa");
        p.setProperty("username","lisi");
       // System.out.println(p.getProperty("uesrname"));

        //需要一个方法,将修改后的内容同步到文件里面
        //3.  store(OutputStream out ,String comments):使用字节的输入流,修改配置文件中的内容
            p.store(new FileOutputStream("config.properties"),"i am happy");
            //4.  store(Writer out ,String comments):使用字符的输入流,修改配置文件中的内容,

    }
}
