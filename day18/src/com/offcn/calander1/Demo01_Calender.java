package com.offcn.calander1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01_Calender {
    public static void main(String[] args) throws ParseException {
        // Calendar是一个抽象类不能直接创建对象,但是我们可以通过一个方法
        //getInstance()是一个静态方法,帮我们创建出一个Calender
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //获取Date
        Date date = cal.getTime();
        System.out.println(date);

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2001-12-12");

        //setTime(Date date)设置时间到日历中
        cal.setTime(parse);
        System.out.println(cal);

        //获取Calendar 年月日
        int year = cal.get(Calendar.YEAR);  //2001
        System.out.println(year);
        //获取 月
         int month=cal.get(Calendar.MONTH)+1;
        System.out.println(month);

        //获取  日
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //Calender自带的设置时间到日历中
        //set(2015,11,11,10,10,10) 设置时间到日历中  月份从0到11
        cal.set(2012,11,11,10,42,55);
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)-1);//这才是我们的星期 美国比我们早一天

        //add(Calendar.YEAR/MONTH/DATE,2) 在一个日期的年月日添加一个值
        cal.add(Calendar.YEAR,2);
        System.out.println(cal.get(Calendar.YEAR));
    }
}
