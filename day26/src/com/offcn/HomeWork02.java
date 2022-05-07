package com.offcn;

import java.io.File;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //2.键盘录入一个字符串,表示一个文件夹路径,如果不是文件夹路径提示重新输入
        //打印当前文件夹下,所有的大于20m的后缀名是wmv的文件的绝对路径
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入一个文件夹");
            String s = sc.nextLine();
            //将path封装到File里面
            File  f=new File(s);
            //判断是否是文件
                if(f.isDirectory()){
                    //判断是否是文件夹
                    File[] files = f.listFiles();//将里面的都取出来
                for (File file: files) {
                    if (file.isFile()){
                        String[] split = (file + "").split("\\.");
                        String s1 = split[split.length - 1];
                        if (s1.equals("wmv")&& file.length()>(1024*1024*8)){
                            System.out.println(file.getAbsoluteFile());//获取绝对路径
                        }
                    }
                    }
                break;
                } else {
                    System.out.println("你输入的不是一个文件夹");
                }
        }
    }
}
