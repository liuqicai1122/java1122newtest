package com.offcn.demo;

public class Demo02_访问数组元素 {
    /*当我们动态初始化数组成功以后,我们虽然没有赋值但这时JVM会自动默认给我们一些初始值
    *基本数据类型 4类 8种
    * 整数 会给 0
    * 小数0.0
    * 布尔类型 false
    *字符'\u0000'
    *引用数据类型
    * 默认值是null;
    * */
    public static void main(String[] args) {
            boolean[] arr1 =new boolean [3];
            //数组的长度     我们需要通过一个属性length
         int length = arr1.length;
        System.out.println(arr1.length);//3
        //但是索引是从0开始 数的 所以 索引的范围是 0- 数组名.length-1
            //通过数组名[索引值] 就可以找到对应位置上的具体值
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        //以上我们是不去给动态数组赋值的话 就是系统默认值
        //给动态数组赋值 数组名[索引值]=具体的值
        arr1[0]=true;
        System.out.println(arr1[0]);
        //我们知道 通过 int length = 数组名.length 可以知道数组的长度
        //和字符串类似 但是 在字符串中 我们用的是方法, 数组中没有length的方法 ,这是数组的属性
        //定义一个静态数组
        int[] num =new int []{1,2,2,4,5,};
        System.out.println(num[0]);//1
        System.out.println(num[1]);//2
    }
}
