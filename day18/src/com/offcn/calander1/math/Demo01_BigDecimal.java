package com.offcn.calander1.math;

import java.math.BigDecimal;

public class
Demo01_BigDecimal {
    public static void main(String[] args) {
        //BigDecimal 可以精确的表示小数,也可以精确的运算小数
        double d=0.1;
        BigDecimal bd= new BigDecimal(d);
        System.out.println(bd);
        //0.1000000000000000055511151231257827021181583404541015625

        BigDecimal bd1= new BigDecimal("0.1");
        System.out.println(bd1);

        BigDecimal bd2= new BigDecimal("0.8");
        //add();相加
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
        //subtract():相减
        BigDecimal bd4= bd1.subtract(bd2);
        System.out.println(bd4);
        //multiply():相乘
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);//0.08

        //divide():相除结果一定要除尽
        //BigDecimal是个精准的数据 除不尽会报错
       /* BigDecimal divide = bd1.divide(bd2);
        System.out.println(divide);*/
       //doubleValue();把BigDecimal类型转换成double类型
        double v = bd5.doubleValue();
        System.out.println(v);//0.08

        BigDecimal bb=new BigDecimal(v);
        System.out.println(bb);

        //解决除不尽
        //BigDecimal ds=b1.divide(被除的BigDecimal对象,保留几位小数,模式);
        //模式:四舍五入 BigDecimal.POUND_HALF_UP
        //向下取整
        //向上取整
        //直接舍去小数位
        BigDecimal bd10=bd1.divide(bd2,10,BigDecimal.ROUND_HALF_UP);
        System.out.println(bd10);

        //ROUND_HALF_DOWN
        // 向"最接近的"数字舍入,如果与两个相邻数字的距离相等,则为上舍入的舍入模式
        BigDecimal bd8=new BigDecimal("0.13131");
        BigDecimal bd9=new BigDecimal("1");
        System.out.println(bd8.divide(bd9,2,BigDecimal.ROUND_HALF_DOWN));


    }
}
