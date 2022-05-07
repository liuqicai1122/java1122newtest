package com.offcn.string1;

public class Demo_String转换功能 {
    public static void main(String[] args) {
        //0=-48    a==97 A==65
        String str="0123afgaGAW";
        //1.bety[]       getBytes():将当前字符串,转成字节数组
        byte[] bytes =  str.getBytes();
        System.out.println(bytes);//打印的是地址
        for (int index = 0; index <bytes.length-1 ; index++) {
            System.out.print(bytes[index]+" ");//48 49 50 51 97 102 103 97 71 65
        }
        System.out.println();
        //2.char[]   toCharArray():将当前的字符串,转成字符数组
        char[] chars = str.toCharArray();
        //所有数组除了char[]数组打印的是内容 其余都是地址
        System.out.println(chars);//0123afgaGAW

        //3.toUpperCase():将当前的字符串,转成全大写形式    返回值    是一个新的String
        String s=str.toUpperCase();
        System.out.println(s);//0123AFGAGAW

        //4.toLowerCase():将当前的字符串,转成全小写形式
        String s1=str.toLowerCase();
        System.out.println(s1);//0123afgagaw

        //5.concat(String str):将当前调用者,和参数str进行拼接,返回拼接后的长字符串(不常用)
        String str1="helloworld";
        String concat=str.concat(str1);
        String  str2=str+str1;
        System.out.println(concat);//0123afgaGAWhelloworld
        System.out.println(str2);//0123afgaGAWhelloworld

        //6.valueOf家族:可以将任意数据类型的数据,转换成字符串
        //静态方法,我们只需要通过类名String.valueOf(任意数据类型)
        String s2=String.valueOf(2141);
        System.out.println(s2);//2141  将所输入的任何内容都转成String 类型
    }
}
