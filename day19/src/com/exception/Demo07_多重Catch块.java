package com.exception;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;

public class Demo07_多重Catch块 {
    public static void main(String[] args) {
        int x=10;
        int y =0;
        SimpleDateFormat i= new SimpleDateFormat("yyyy-MM-dd");
        try{
            //存放可能出现的代码
            System.out.println(x/y);
            i.parse("1232-1111");
            //以下catch后面的异常类型,如果没有任何关系,没有先后之分
            //如果多个catch中的异常类型有子父级的关系,需要把孩子放最前面
            // 多catch模块只会运行一个   catch中的代码
        }catch (Exception a){
            a.printStackTrace();
        }


      /*  (ArithmeticException e) {
            System.out.println("除数不能为o");
        }*/

    }
}
