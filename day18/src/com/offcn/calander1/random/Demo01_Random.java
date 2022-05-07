package com.offcn.calander1.random;

import java.util.Random;

public class Demo01_Random {
    public static void main(String[] args) {
        //创建随机数对象
        Random ran=new Random();
        //nextInt(n)  随机产生0到n-n-1的整数
        int ranNum = ran.nextInt(100)-1;//生成1到100直接的整数

        //nextDouble() 随机生成0到1之间的随机浮点数
        double v = ran.nextDouble();
        System.out.println(v);

        //nextFloat()随机产生0到1之间的随机浮点数
        float v1 = ran.nextFloat();
        System.out.println(v1);

        //nextLong()  随机产生整数
        long xx = ran.nextLong();
        System.out.println(xx);

    }
}
