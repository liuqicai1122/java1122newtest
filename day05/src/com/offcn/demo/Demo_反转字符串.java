package com.offcn.demo;

import java.awt.*;
import java.util.Scanner;

public class Demo_反转字符串 {
    public static void main(String[] args) {
        //反转字符串 String str = "abcdefg"
        String str="abcdgfg";


       for (int i = str.length()-1;i >= 0; i--){
         char b= str.charAt( i );
            System.out.print(b);
        }


    }
}
