package com.offcn.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo_变量 {
    public static void main(String[] args) {
        System.out.println();
        //定义 数据类型 变量名= 变量值 // x 是 我们的=变量名
        int o = 223;
        System.out.println(o);
        /*
        * 一个变量只能保存一个数值 int o = 30;
        * 变量使用后可以不需要直接赋值
        * 先定义 在赋值 再打印


        * */

        {
            short x;
            x = 5555;x = 6666;
            System.out.println(x);
        }
            o=3333;
        System.out.println(o);
        //定义是什么样的容器，承接什么样的数据
        //变量使用时是由作用域范围
        //变量作用域的范围是离它最近的大括号
        //浮点型范围大于整数型数据
        //double>float>long>in>short=char>byte
        int z=100;
        System.out.println(z);
        double ee=2.32132132;
        System.out.println(ee);
        float    jk=624624642;
        System.out.println(jk);


     }

}
