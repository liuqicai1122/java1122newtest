package com.exception;

import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int numRan = ran.nextInt(100) + 1;
        int count = 1;


        for (; ; ) {
                if (count ==6) {
                    System.out.println("您的次数用完了已经");
                    break;
                }
            System.out.println("请输入一个1到100之间的整数");
            String i = sc.next();
            try{
                        if((Integer.parseInt(i))>100 || Integer.parseInt(i)<1 ){
                    System.out.println("请输入范围内的数字");
                }else if (Integer.parseInt(i)< numRan) {
                            System.out.println("您输入的数字小了,请输入大点");
                            // System.out.println("您还有" + (j - 1) + "次机会");
                            count++;

                        } else if (Integer.parseInt(i) > numRan) {
                            System.out.println("您输入的数字大了,请输入小点");
                            //System.out.println("您还有" + (j - 1) + "次机会");
                            count++;

                        } else if (Integer.parseInt(i)== numRan) {
                            System.out.println("恭喜你猜对了");
                            break;

                        }
                }catch (Exception e){
                    System.out.println("请输入纯整数数字");
                }


        }

    }
}




