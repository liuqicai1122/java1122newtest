package com.offcn.JButils;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
   public static SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        public  static  String dateToString(Date date){
                return  sim.format(date);
        }
}
