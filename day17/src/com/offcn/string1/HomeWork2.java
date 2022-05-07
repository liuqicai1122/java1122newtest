package com.offcn.string1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的出生日期,日期格式为****-**-**");
        Scanner sc=new Scanner(System.in);
         String iii = sc.next();


        Date date=new Date();
        //System.out.println(date);
        long time1 = date.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(iii);
        long time = parse.getTime();
        System.out.println(time);
        System.out.println("你已经活了"+((time1/1000/60/60/24)-(time/1000/60/60/24))+"天");
        System.out.println(6621/365);
    }
}
