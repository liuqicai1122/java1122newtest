package com.coffcn.kebancanshu;

public class Demo01_可变参数 {
    public static void main(String[] args) {
        //求0个整数参数的和
        System.out.println(getSum());//0
        //求两个整数和
        System.out.println(getSum(213,42));//255
        //求多个
        System.out.println(getSum(213,213,213,42,21));//702
        // 可变参数看成 数组
            int [] arr={12,32,43,432,12};
        System.out.println(getSum(arr));//531

    }
    public static  int getSum(int x ,int y){
        return x+y;
    }
    public static int getSum(int x,int y,int z){
        return x+y+z;
    }
    //  方法的重载
    //但是可变参数的引入,就让我们方法的参数列表个数可以确定
    // 数据类型...变量名 这就告诉我们  变量名的范围0到n
    //权限修饰符  返回值类型 方法名  (数据类型...变量名){
    // 方法体语句;
    // }
    //注意事项
    //   一个方法里面只能有1个可变参数
    //可以有其他参数,但是必须写到可变参数里面
    //可以把可变参数当成一个数组来看待
    public static  int getSum(int...num){
        //把可变参数当成数组来看
        int sum=0;
        int i = num.length - 1;
        for (int index = 0; index <=i ; index++) {
                sum += num[index];
        }
            return sum;
    }


}
