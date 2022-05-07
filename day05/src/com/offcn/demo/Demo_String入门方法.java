package com.offcn.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo_String入门方法 {
            //定义一个字符串`
            public static void main(String[] args) {


                String name = "刘奇才,牛逼";
                //字符串是有长度的 就是字符的个数 length() 方法,这个方法有一个返回值
                //这个返回值 是一个具体数值 ,就是字符串个数 数据类型是int
               int length=name.length();
                System.out.println(length);//这个是你输出的字符串长度
                //我们也可以获得每个字符每个字符 charAT    (整形的数字 int num)
                //num的范围    是0 到 (length()-1)
                        char zi= name.charAt(0);//这是第一个字符
                System.out.println(zi);
                char z6= name .charAt(5);
                System.out.println(z6);//这是最后一个字符
                //分别获取每一个字符
                for (int i = 0; i<=  (name.length()-1);i++){
                    char c = name .charAt(i);
                    System.out.println(c);
                }
            }



}
