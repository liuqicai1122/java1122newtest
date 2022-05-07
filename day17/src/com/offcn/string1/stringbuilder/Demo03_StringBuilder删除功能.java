package com.offcn.string1.stringbuilder;

public class Demo03_StringBuilder删除功能 {
    public static void main(String[] args) {
        StringBuilder   sb=new StringBuilder("agwga123214");
        // 1.deleteCharAT(int index):删除指定索引的字符,返回值类型是其本身
        sb.deleteCharAt(0);
        System.out.println(sb);//gwga123214

        //2.delete(int start,int end):删除指定范围的字符,被删除的部分包含头不含尾
        sb.delete(0,2);
        System.out.println(sb);//ga123214
    }
}
