package com.offcn.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

   public static Date  stringToDate(String date)  {
       SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
       Date parse = null;
       try {
           parse = sim.parse(date);
       } catch (ParseException e) {
           e.printStackTrace();
       }
       return parse;
    }
        public  static String dateToString(Date date){
       SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
       return sim.format(date);
        }
}
