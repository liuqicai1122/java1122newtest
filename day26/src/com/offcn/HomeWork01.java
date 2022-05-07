package com.offcn;

import java.io.File;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        //键盘录入一个文件夹路径，统计该文件夹下的各种后缀名的文件的个数
        //	例如：.txt有3个，.java有10个......
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        int count=0;
        int count1=0;
        int count2=0;
            String i = sc.nextLine();
            File f1=new File(i);
            //File[] files = f1.listFiles();
            if(f1.exists()) {
                File[] files = f1.listFiles();
                for (File file : files) {
                    if (file.isFile()) {
                        if (file.getName().endsWith("txt")) {
                            ++count;

                        }
                        if (file.getName().endsWith("java")) {
                            ++count;

                        }
                        if (file.getName().endsWith("doc")) {
                            ++count;

                        }
                    }
                    }
                } else {
                System.out.println("该文件夹不存在");
                  }
        System.out.println("txt类型有" + count + "个");
        System.out.println("java类型有" + count1 + "个");
        System.out.println("doc类型有" + count2 + "个");

        }
}