package com.offcn.demo;

import jdk.nashorn.internal.runtime.linker.Bootstrap;

import java.io.*;
import java.util.ArrayList;

public class Demo01_测试题1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList=new ArrayList<>();//创建一个集合
        BufferedReader br=new BufferedReader(new FileReader("D:\\exam.txt"));//高效字符缓冲流
        //BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\exam1.txt"));
        String i;
        while ((i=br.readLine())!=null){//一行一行的读
            arrayList.add(i);//存入集合中
        }
        for (String s : arrayList) {//遍历集合
            System.out.println(s);
        }
        br.close();//关流
    }
}
