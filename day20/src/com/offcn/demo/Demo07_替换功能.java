package com.offcn.demo;

public class Demo07_替换功能 {
    public static void main(String[] args) {
            String str="www.taobao.com";
            //String 类的replaceALL方法
        String s = str.replaceAll("w", "m");
        System.out.println(s);

        //把. 替换成- 以后 我们在替换或切割的时候,如果使用正则里面的一些规则
        //如果我们不想使用 记得   加\\或者[]
        String s1 = str.replaceAll(".", "-");
        System.out.println(s1);//--------------
        String s2 = str.replaceAll("[a-d]", "x");
        System.out.println(s2);
        String s3 = str.replaceAll("\\.", "---");
        System.out.println(s3);

    }
}
