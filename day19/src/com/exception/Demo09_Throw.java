package com.exception;

public class Demo09_Throw {
    public static void main(String[] args) {
            strToDate("1231");
    }

    //一旦我们的代码碰到了throw 就证明 我们的代码 百分百出现了错误,出现了错误
    public static  void strToDate(String time){
            int x=10;
            int y=0;
            try{
                System.out.println(x/y);
            }catch (ArithmeticException e){
                //System.out.println("处理异常");
                System.out.println("数据异常");
                throw new ArithmeticException();
                //throw 下面的代码是不能运行的,throw可以让我的jvm停止运行
                //System.out.println();
            }
            //如果我们的throw后面的具体的异常对象是  编译时期的异常,这个throw代码一定会在try..catch中
            //或者  方法throws声明中
            try{
                throw new Exception();
            }catch (Exception e){
                System.out.println("异常个鬼");
               // e.printStackTrace();
            }
        System.out.println("什么异常都没");
    }
}
