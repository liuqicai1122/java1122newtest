package com.offcn.calander1.math;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo01_Math {
    public static void main(String[] args) {
        //Math 不能直接创建对象 但是有构造方法,只是构造被私有
        //3.141592653589793
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //abs(数字类型),返回该参数的绝对值
        System.out.println(Math.abs(-100));//100

        //ceil(double d),返回d的向上取整
        double ceil = Math.ceil(3.213);
        System.out.println(ceil);

        //floor(double d),返回d的向下取整
        double floor = Math.floor(3.21);
        System.out.println(floor);

        //max(int a,int b),返回a,b的较大值
        int max = Math.max(12, 314);
        System.out.println(max);

        //min(int a ,int b),返回a,b的较小值
        int min = Math.min(123, 421);
        System.out.println(min);

        //pow(int a, int b),返回a的b次幂
        double pow = Math.pow(2,3);
        System.out.println(pow);

        //random(),返回0.00,到0.999的随机数
        //返回的是[0,1)之间的随机小数
        double random = Math.random();
        System.out.println(random);

        //round(double d),返回d 四舍五入的结果
        long round = Math.round(3.23);
        System.out.println(round);
    }
}


