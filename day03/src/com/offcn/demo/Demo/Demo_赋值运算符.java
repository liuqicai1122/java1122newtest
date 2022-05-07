package com.offcn.demo.Demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo_赋值运算符 {
            // =赋值符号 把右边的值赋值给等号左边的变量名
            public static void main(String[] args) {
                int x =6;
                System.out.println(x);
                // +=
                x += 4;
                System.out.println(x);// 10
                x -= 1;
                System.out.println(x);// 9
                x *=10;
                System.out.println(x);//90
                x /=9;
                System.out.println(x);//10
                x %=4;
                    System.out.println(x);//1


            }

}
