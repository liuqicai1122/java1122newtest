package com.offcn.innerclass.test1;
import java.net.BindException;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输出你想要的输入的内容");
        String i= sc.next();
        int num1=0;
        int num2=0;
        int num3=0;
        for (int index = 0; index <=i.length()-1; index++) {
            num3++;
            char ch=i.charAt(index);
            if (ch>='A'&&ch<='Z'){
                num1++;
            }if(ch>='a'&&ch<='z'){
                num2++;
            }
        }
        System.out.println("小写字母为:"+num2+"个,大写字母为:"+num1+"个,其他字符:"+(num3-num1-num2));
    }
}
