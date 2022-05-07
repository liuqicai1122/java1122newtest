package com.offcn.string1.datedexmo;

import java.util.Date;

public class Demo01_Date {
    public static void main(String[] args) {
        //Date 来自于java.util包中,使用需要导包
        Date date=new Date();
        //Date重写了Object中的toString();
        System.out.println(date);//Tue Dec 14 17:02:18 CST 2021

        //时间的毫秒值,时间的毫秒值 是从1970年1月1日00:00:00
        //  1秒=1000毫秒
        long time = date.getTime();
        System.out.println(time);//1639472637108

        //计算机的元年时间 是 19701月1日00:00:00
        Date date1= new Date(3000);
        System.out.println(date1);
        System.out.println(date1.getTime());

        //Date (int year,int month,int  date)
        Date date2=new Date(2021,12,14);
        System.out.println(date2);//Sat Jan 14 00:00:00 CST 3922
    }
}
