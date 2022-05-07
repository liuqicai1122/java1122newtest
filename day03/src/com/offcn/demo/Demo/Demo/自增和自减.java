package com.offcn.demo.Demo.Demo;

public class 自增和自减 {
    public static void main(String[] args) {
        /*++自增  --自减
        *
        *
        * */
            int num=2;
            num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        //重点 ++ 或-- 在做独立运算的时候这个 对后面运算没有任何影响
        //但是一旦参与了运算 ，先用原来的数值运算 然后自增一
        System.out.println(num++);
        System.out.println(num);
            int x=5;
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        char ss='1';
        System.out.println(ss+0);
        //++在前就先自增1 在做运算
        int bb=55;
        System.out.println(++bb);//56
        System.out.println(bb++);//56
        System.out.println(bb);//57


    }
}
