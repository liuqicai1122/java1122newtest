package com.offcn.demo.Demo;

import javax.xml.bind.SchemaOutputResolver;

public class Demo08_逻辑运算符 {
    public static void main(String[] args) {
        /*逻辑运算符 与 或 非
        逻辑运算符的两边为  布尔表达式 与 布尔表达式

        *与 逻辑运算 全真为真 一假全假
      *     true&true== >true
          true & false> false
          false & false==> false
        * */
            int num1=2;
            int num2 = 3;
            int num3 = 4;
           int num4 = 5;
            boolean x1 = num1<num2;
            boolean x2 = num3 > num4;
            boolean x3 = x1 & x2;
        System.out.println(x3);
        // | 或 逻辑运算符 一真为真， 全假为假
        /*false|false= false
        *false | true= true
        *true|true= true
        * */
                  int   q1= 2;
                  int q2= 3;
                  int q3 = 4;
                  int q4=5;
             boolean q5 = q1>q2 ;
             boolean q6 =q3>q4;
             boolean q7= q5|q6;
        System.out.println(q7);
         // 非   取反
        System.out.println(!q7);
        System.out.println("***********************************************************");
        int i=1;
        i++;
        System.out.println(i);//2
        System.out.println(i++);//2
        System.out.println(i);//3
        System.out.println(--i);//2
        System.out.println(i--);//2
        System.out.println(i);//1
        int h= i ++;
        System.out.println(h);//1
        System.out.println(h);//1
        System.out.println(i);//2
        h=++i;
        System.out.println(i);//3
        System.out.println(h);//3
       int bb=1;
       int iii;
        System.out.println(iii=bb++);
        System.out.println(iii);
        System.out.println(bb);
    }
}
