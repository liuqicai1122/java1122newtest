package com.offcn.string1;

import java.util.Arrays;

public class Demo_String其他功能 {
    public static void main(String[] args) {
        //1.replace(String oldStr,String newStr):将调用者中的老串替换成新串
        //oldStr 一定得是调用者字符串中的一部分
        String str1 = "gawggw2414";
        String newStr = str1.replace("ga", "##");
        System.out.println(newStr);//##wggw2414

        //2.trim():去掉字符串左右两边的空格,制表符
        String st2="            hello     wold         ";
        String trim = st2.trim();
        System.out.println(trim);

        //3.split():字符串拆分,一般拆分有规则的字符串
        String st3="2021-12-42";
        String[] split = st3.split("-");
        for (int index = 0; index <=split.length-1 ; index++) {
            System.out.print(split[index]+" ");//2021 12 42
        }
        System.out.println(Arrays.toString(split));//[2021, 12, 42]
    }
}