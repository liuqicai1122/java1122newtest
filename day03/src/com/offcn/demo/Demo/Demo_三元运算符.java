package com.offcn.demo.Demo;

public class Demo_三元运算符 {
    public static void main(String[] args) {
        //三元运算符 格式 数据类型 变量名 = 布尔类型表达式 ？ 值1:值2;
        //获取两个数的最大值
        int num1 = 10;
        int num2 = 100;
        System.out.println(num1>num2? num1 : num2);
        //求出三个数中的最大值
        int num3 = 44;
                 int max = num1 > num2? num1 : num2;
          max= max>num3 ? max: num3;
        System.out.println(max);






    }


}
