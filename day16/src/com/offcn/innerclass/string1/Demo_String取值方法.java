package com.offcn.innerclass.string1;

public class Demo_String取值方法 {
    public static void main(String[] args) {
        //1.length():获取字符串的个数
        String str1 ="helloworld123";
        int length=str1.length();
        System.out.println(length);

        //2.charAT(int index):返回调用者字符串中索引为index的字符
        //和length方法结合之后可以遍历字符串
        char c=str1.charAt(2);
        System.out.println(c);//l

        //想取到字符串中的每一个字符,遍历数组
        for(int index=0; index<=str1.length()-1;index++){
            char c1=str1.charAt(index);
            System.out.print(c1+" ");
        }
        System.out.println();

        //3. substring(int beginIndex ,int endIndex):获取一个指定索引范围的子串
        //截取的时候含头不含尾
        String str3=str1.substring(0,5);
        System.out.println(str3);

        //4.substring(int beginIndex):获取一个字符串
        //内容是从当前字符串的beginIndex索引开始
        String str2= str1.substring(3);
        System.out.println(str2);

        //5.indexOf(int ch)
        //返回指定字符在此字符串中第一次出现处的索引
        int index=str1.indexOf('l');
        System.out.println(index);

        //indexOf(int ch, int fromIndex):从fromIndex索引开始寻找,
        //找到ch字符在当前字符串中第一次出现的索引
        int   index1=str1.indexOf('o',3);
        System.out.println(index1);

        //indexOf(String  str):返回的是str这个字符串在调用者字符串中第一次出现的索引
        int index3=str1.indexOf("ll");
        System.out.println(index3);
        //indexOf(String str,int  fromIndex):从fromIndex索引开始寻找,找到str字符串在当前字符
        //(注意:无论从哪个位置开始找,所有的字符索引都不会变化)
        int index4=str1.indexOf("owo", 2);
        System.out.println(index4);
        //lastIndexOf家族
        //和 IndexOf基本一样,只不过是从后往前找,所有字符和字符串的索引也都不会发生变化


        int index5=str1.lastIndexOf("o");
        int index6=str1.indexOf("o");
        System.out.println(index6);
        System.out.println(index5);

        int index7=str1.lastIndexOf("ll");
        int index8=str1.indexOf("ll");
        System.out.println(index7);
        System.out.println(index8);
    }
}
