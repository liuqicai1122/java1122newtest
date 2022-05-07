package com.offcn.file;

import java.io.File;

public class Demo03_案列1 {
    public static void main(String[] args) {
        File f =new File("d:\\test");
         printFile(f);
    }
    //案列1:递归方式列出某个目录下所有文件夹名和文件名
    public  static  void printFile(File file){
            if(file.exists()){
                //获取File 路径下的所有文件夹或文件
                File[] files = file.listFiles();
                for (File flies1:files) {
                        //遍历files获取的是一个一个File对象
                        //判断是否是文件
                    if(flies1.isFile()){
                        System.out.println("文件是"+flies1.getName());
                    }else{
                        System.out.println("文件夹是"+flies1.getName());
                        printFile(flies1);
                    }
                }
            }else{
                System.out.println(file+"路径不存在,无法进行操作");
            }

     }
}
