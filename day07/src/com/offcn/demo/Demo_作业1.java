package com.offcn.demo;

public class Demo_作业1 {
    public static void main(String[] args) {
        //分别定义方法，求一个整数数组的最大值、最小值、平均值和所有数组元素的和（4个方法）

            int [] arr={32,31,45,67,};
        System.out.println(da(arr));//最大值
        System.out.println(xiao(arr));//最小值
        System.out.println(ping(arr));
        System.out.println(Sum(arr));

    }   public static int da (int [] arr){
        int max =arr[0];
        for (int i = 1;i <=arr.length-1;i++){
            if (max <arr[i]){
                max=arr[i];
            }
        }
       return max;
    }
            public static int xiao (int [] arr){
            int min=arr[0];
            for (int i=1;i<=arr.length-1;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }return min;
    }
            public static int ping(int [] arr){
                    int jia=0;
                  for (int i =0; i<= arr.length-1; i++){
                        jia=jia+arr[i];
                  }    int pingJun= jia/arr.length;
                  return pingJun;
            }
                    public static int Sum(int [] arr){
                    int he=0;
                    for (int i = 0; i<=arr.length-1;i++){
                        he=he+arr[i];
                    }return he;


                    }


    }
