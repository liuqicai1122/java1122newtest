package com.offcn.demo;

public class Demo_String练习 {
    public static void main(String[] args) {
        String str="aaa   bbb    ccc";
           int length=str.length();
        //定义了一个字符串
        //我们需要把字符串的空格去掉 ,并且 将剩余字符串拼接成新的字符串
        for (int i = 0; i<= (length-1);i++){
            char cha=str .charAt(i);
            if(cha ==' '){
                  continue;

            }
            System.out.print(cha);

        }


    }
}
