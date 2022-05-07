package com.offcn.demo;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class Demo05_案列 {
    public static void main(String[] args) {
        //验证qq号 必须是5-15位数字 0不能开头.
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        //yanZhengQQ(str);
        yanZhengQQ1(str);


    }//这是我们正常情况下 的定义
    public  static  void yanZhengQQ(String qq){
        int len = qq.length();
        if(len>=5 &&len<=15){
            if(!qq.startsWith("0")){
                //验证qq是否是纯数字
                try {
                    long l = Long.parseLong(qq);
                    System.out.println("qq号" +qq);
                } catch (Exception e){
                    System.out.println("qq必须是纯数字啊");
                }
            }else{
                System.out.println("qq不能以0开头");
            }

        }else{
            System.out.println("qq长度不符合要求");
        }

    }
    //当我们学习了正则后
    public  static  void yanZhengQQ1(String qq){
        boolean matches = qq.matches("[1-9][0-9]{4,14}");
        if (matches){
            System.out.println("符合"+qq);
        }else{
            System.out.println("不符合"+qq);
        }

    }
}
