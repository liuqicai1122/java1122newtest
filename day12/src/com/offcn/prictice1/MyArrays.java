package com.offcn.prictice1;

public class MyArrays {
    //案列三
    //定义一个ing类型数组操作的工具类,MyArrays.方法包括:
    //最大值 最小值 升序排序 求和方法
    //用静态方法 可以修饰我们的成员方法,可以让我们的方法直接通过类名  直接惊醒访问
    //以后我们的工具中,主要使用的就是我们的static
    //求最大值
    public static void getArrMax(int[] arr) {
        //我们操作数组的时候 要判定是否为null 长度是否为0
        if(arr!= null && arr.length!= 0){
            int max =arr[0];
            for (int index = 0; index <=arr.length-1 ; index++) {
                        if(max<arr[index]){
                            max= arr[index];
                        }
            }
            System.out.println("数组中的最大值为:"+max);
        }else{
            System.out.println("数组为null 或 长度为0");
        }
    }//最小值
        public static void  getArrMin(int [] arr){
             int min= arr[0];
            for (int index = 0; index <=arr.length-1 ; index++) {
                if(min>arr[index]){
                    min=arr[index];
                }
            }
            System.out.println("这个数组最小值为:"+min);
        }//升序排序  也就是冒泡排序
            public static void  sort (int [] arr) {
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int index = 0; index < arr.length - 1 - i; index++) {
                        //判断
                        if (arr[index] > arr[index + 1]) {
                            //交换元素
                            int temp = arr[index];
                            arr[index] = arr[index + 1];
                            arr[index + 1] = temp;
                        }
                    }
                }//遍历数组
                for (int index = 0; index <=arr.length-1 ; index++) {
                    System.out.print(arr[index]+"  ");
                }
                System.out.println();
            }
            public static  void  getArrSum(int [] arr){
        //定义一个和变量初始值为0
                int Sum=0;
                //遍历数组
                for (int index = 0; index <=arr.length-1 ; index++) {
                    Sum +=arr[index];
                }
                System.out.println("该数组和为:"+Sum);
            }
}