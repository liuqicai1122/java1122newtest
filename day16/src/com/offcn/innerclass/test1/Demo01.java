package com.offcn.innerclass.test1;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(; ; ){
            System.out.println("请输入您想输入的内容");
            String  i=sc.next();
            if (i.equals("end")) {
                System.out.println("程序结束了");
                break;
            }
            String st="";
            int count=0;
            for (int index=0;index<=i.length()-1;index++){
                char ch= i.charAt(index);
                if (ch>='A' &&ch<='Z'){
                    st=st+ (ch+"").toLowerCase();
                    count++;
                }else if (ch>='a'&& ch<='z'){
                    st =st+(ch+"").toUpperCase();
                    count++;
                }else{
                    st=st+(ch='*');
                }
            }System.out.println(st);
            System.out.println("共有"+count+"个字母");
        }




    }


}





