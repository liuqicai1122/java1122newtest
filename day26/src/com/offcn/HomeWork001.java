package com.offcn;

import com.sun.nio.sctp.SendFailedNotification;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class HomeWork001 {
    public static void main(String[] args) {
        //1.将预计需要遍历的文件夹封装在File对象中
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件夹路径");
        String s = sc.nextLine();
        File f =new File(s);
        //map集合用于存储文件后缀名与其对应的个数
        HashMap<String,Integer> map=new HashMap<>();
            if (f.isDirectory()){
                //将a文件夹下所有文件和文件夹都获取到
                File[] files = f.listFiles();
                //遍历数组 获取到每一个文件和文件夹
                for (File f1:files){
                    //验证遍历出每一个File类型路径是否表示该文件
                    if (f1.isFile()){
                        //获取文件名字
                        String name = f1.getName();
                        //6 使用 将文件名进行切割,需要获取到文件的后缀名
                        String[] split = name.split("\\.");
                        //7.获取文件后缀名
                        String s1 = split[split.length - 1];
                        //验证需要存储在map集合中文件后缀名endName是否在map集合中是否第一次存储
                        if(map.containsKey(s1)){
                            //不是第一次存储 在原有基础上加一
                            map.put(s1,map.get(s1)+1);
                        }else{
                            map.put(s1,1);
                        }
                    }
                }
            }else{
                System.out.println("文件无法进行遍历");
            }
        System.out.println(map);
    }
}
