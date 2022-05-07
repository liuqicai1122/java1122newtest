package com.offcn.string1.stringbuilder;

public class Demo04_StringBuilder替换和反转 {
    public static void main(String[] args) {
                StringBuilder sb=new StringBuilder("abcd1234");
                //1.replace(int start,int end,String str)
        //将字符串缓冲区中的从start开始到end-1这部分内容 替换成str
       // sb.replace(4,8,"#");
       // System.out.println(sb);//abcd#

        //2.字符串反转
        sb.reverse();
        System.out.println(sb);
    }
}
