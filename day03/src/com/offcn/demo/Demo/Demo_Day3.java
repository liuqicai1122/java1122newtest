package com.offcn.demo.Demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo_Day3 {
    public static void main(String[] args) {
     int i = 3287;
     //千位数字
        System.out.println(i/1000);
        //个位
        System.out.println(i/100%10);

        System.out.println(i/10%10);

        System.out.println(i%10);


        int num=2312;
        int num1=7;

        System.out.println(num%num1==0? num1: num);


    }


}
