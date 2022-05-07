package com.offcn.demo;

import java.util.function.Function;

public class Demo06_函数型接口 {
    public static void main(String[] args) {
        //客户1  y为x2倍
        Function<Integer,Integer> fun=i -> i*2;
        System.out.println(uesFunction(5,fun));
        // 客户2: y与x相等
        Function<Integer,Integer> fun1=i -> i;
        System.out.println(uesFunction(5,fun1));
        //客户3  y为x平方
        Function<Integer,Integer> fun2=i -> i*i;
        System.out.println(uesFunction(5,fun2));


        //客户  x为"" 计算出x转换成整数后 2倍结果
        //Function<String,Integer> fun3= x ->{
          //  int num=  Integer.parseInt(x);
          //  return num*2;
        //};
        //System.out.println(useFunction2("5",fun3));

        Function<String, Integer>fun4=x ->Integer.parseInt(x);
        Function<Integer,Integer>  fun5= x ->x*2;
        System.out.println(useFunction2("33",fun4,fun5));
        System.out.println(useFunction2("33",fun4,fun));
        //客户 x为 "-2" 计算出x转换成整数后 +1 的结果
        Function<Integer,Integer> fun6=x-> x+1;
        System.out.println(useFunction2("-2",fun4,fun6));

    }
    //案列1 定义一个方法功能  ,根据整数x 计算出对应的整数y
    //x数据由客户给出,y数据的计算方式根据客户要求决定
    //1  客户1 y为x的二倍
    //2  客户2:y与x相等
    //3  客户3:y为x的平方
    public static int uesFunction(int x, Function<Integer,Integer> fun){
        Integer apply = fun.apply(x);
        return apply;

    }



    //案列2 定义一个方法 根据字符串x 计算出对应整数y
    //x 数据 由客户给出, y数据的计算方式根据客户要求决定
    //1 客户4:x 为"6",计算出x转换成整数后 ,2倍的结果
    //客户5 x为"-2",计算出x转换成整数后,+1 的结果
   /* public static  int useFunction2(String x,Function<String,Integer> fun) {
        Integer y= fun.apply(x);
        return y;
    }
*/
    public  static int  useFunction2(String x,Function<String,Integer> fun,Function<Integer,Integer> fun1)
    {
       // Integer apply = fun.apply(x);
        //Integer apply1 = fun1.apply(apply);
        //return apply1;
        return  fun.andThen(fun1).apply(x);
    }
}
