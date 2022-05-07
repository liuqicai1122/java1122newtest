package com.exception;

public class Demo02_异常的语法 {
    public static void main(String[] args) {
        /*try{
            可能发生的异常
        }catch(你要把上面可能发生的异常代码的异常类型确定  变量名){
            //你捕获到以后需要做那些事
        }
        *
        *
        * */
         int x=10;
         int y=0;
         try{
             //可能发生问题的代码
             System.out.println(x/y);
         }catch (ArithmeticException  e){
             System.out.println("除数不能为0");
         }




    }
}
