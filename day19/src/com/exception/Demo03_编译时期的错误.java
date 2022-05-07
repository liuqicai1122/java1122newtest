package com.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo03_编译时期的错误 {
    public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            String date="2021-2-3";
            //编译时期的错误
        //光标放上去会自动提示异常类型
        //工作中我们处理最多的就是编译时期的错误
        try{
            sdf.parse(date);
        }catch (ParseException e){
            System.out.println("字符串格式不对");
        }
    }
}
