package com.offcn.demo;

public class Demo_方法的注意事项 {
    public static void main(String[] args) {
        getSum(23,312);
        System.out.println(getSum(1,3));
    }
    //两个整数的和 需要有返回值
    public static int getSum(int num1 ,int num2){
        int sum =0;
        sum =num1+num2;
            return sum;
    }
        /*public static 返回值类型 方法名(参数列表){
        方法体语句)

        return;(根据实际情况
        }
        *方法注意事项;
        1,方法不能嵌套定义:方法之中不能有方法
        2 方法和方法之间是平级关系
        *3 方法与方法没有顺序之分
        *4,方法可以嵌套 调用,方法里面可以调用方法
        甚至方法可以自己调用自己 递归调用
            参数列表注意事项
            1.方法上的参数, 我们叫形参 也就是只有数据类型 没有具体数字
            2.实际参数 ,是方法在调用的时候,实际传递过去的值
            实参的顺序一定要有形参的顺序保持一致,多个实参 也是通过,进行分隔
            return
            方法有结果 我们这个return百分百存在 return后面的返回值要与返回值类型
            保持一致
            方法没有结果这个return;可以没有 也可以有 相加的话 return;
            方法无返回值 的话 返回值类型的位置书写出 void



        * */





}
