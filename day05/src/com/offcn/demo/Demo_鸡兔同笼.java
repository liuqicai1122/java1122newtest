package com.offcn.demo;

public class Demo_鸡兔同笼 {
    public static void main(String[] args) {
        //案列 鸡兔同笼 50个头   120个脚 多少鸡 多少兔

        for( int ji =0 ; ji<=50; ji++){
            int tu = 50-ji;
            if((ji*2 + tu*4) == 120){
                System.out.println("鸡有"+ji+"只,兔子有"+tu+"只");
            }
        }



    }
}
