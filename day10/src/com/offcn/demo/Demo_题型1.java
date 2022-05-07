package com.offcn.demo;

public class Demo_题型1 {
    public static void main(String[] args) {
        //定义一个方法  参数类型是int[]类型 把传入的int类型数组组成字符串返回
        //返回格式为[1#2#3#] 传入数组 int [] aa ={1,2,3}  返回的字符串为"[1#2#3#]"
            int []aaa = {1,2,3};
        System.out.println(str(aaa));
    }
    public static String str(int [] arr){
        String iii="[";
        for (int index = 0; index <=arr.length-1; index++) {
               int num =arr[index];
                if (index!=arr.length-1){
                    iii=iii+num+"#";
                }else{
                    iii=iii+num+"#"+"]";
                }
             }return iii;
    }
}

