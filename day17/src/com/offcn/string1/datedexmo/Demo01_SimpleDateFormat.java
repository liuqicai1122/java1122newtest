package com.offcn.string1.datedexmo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat  简单的日期格式
        //很好的作用:1.把时间转换成字符 2.把字符串转换成时间
        SimpleDateFormat sdf= new SimpleDateFormat();
        System.out.println(sdf);//java.text.SimpleDateFormat@b5341f2a 说明没有对toSpring重写

        SimpleDateFormat i=new SimpleDateFormat("yyyy年MM月dd日  HH时:mm分:ss秒");
       Date ii= new Date();
       // System.out.println(ii);
        String format2 = i.format(ii);
        System.out.println(format2);
        Date parse1 = i.parse("2021年12月19日  15时:50分:09秒");
        System.out.println(parse1);


        //使用 format()方法,将日期转换成字符串
        Date date= new Date();
        String format = sdf.format(date);
        //默认的SimpleDateFormat 默认的格式
        System.out.println(format);//21-12-14 下午5:34

        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy年MM月dd日  HH时:mm分:ss秒");
        String format1 = sdf1.format(date);
        System.out.println(format1);//2021年12月14日  17时:36分:11秒

        //parse()字符串转时间
        Date parse = sdf1.parse("2021年12月14日  17时:36分:11秒");
        System.out.println(parse);
        long time = parse.getTime();
        System.out.println(time);
    }
}