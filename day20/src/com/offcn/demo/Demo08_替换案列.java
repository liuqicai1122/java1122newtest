package com.offcn.demo;

public class Demo08_替换案列 {
    public static void main(String[] args) {
        //案列替换电话号码为******
        String  str="联系我：13810637606联系我：18610637606联系我：17610637606联系我：18910637606";
        String regex="1[3-9]\\d{9}";
        String s = str.replaceAll(regex, "******");
        System.out.println(s);
        /*String i="[0-9]{11}";
        String s1 = str.replaceAll(i, "******");
        System.out.println(s1)*/

    }
}
