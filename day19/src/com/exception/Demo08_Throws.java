package com.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo08_Throws {
    public static void main(String[] args) throws Exception {
        String name="2232-11-13";
        strToDate(name);
   /* try{
        strToDate(name);
    }catch (Exception e){
        e.printStackTrace();
    }*/
   //方法声明可能有异常,main我们自己解决了 就可以运行 不解决 我们也要声明有异常 然后jvm是不会执行的 直接报错
        System.out.println("哈哈哈哈哈");
        System.out.println("嘿嘿嘿嘿嘿嘿");
        System.out.println("嘤嘤嘤 嘤嘤嘤" );
    }
    //throws 是声明异常  代表这个代码可能会出现异常,也可能不出现异常
    //我们定义一个方法,,里面的代码出现了问题   我们不去try..catch捕获
    //为了省事,我们可以直接声明throws异常类型
    //throws后面可以更多个异常声明
    // 我们方法throws后面的声明的异常 一定要小于 等于方法调用者的异常声明
    public static  void strToDate(String  name) throws  Exception{
       // int x=10;
       // int y=0;
        //我们运行时期的异常 ,我们可以提前处理,也可以不处理

        //System.out.println(x/y);

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse(name));


    }
}
