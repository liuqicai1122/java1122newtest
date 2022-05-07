package com.offcn.demo;

public class Demo_冒泡排序 {
    public static void main(String[] args) {
        //我们要将数组里面的数字从小到大排序
        //这要用冒泡排序  比较轮数 一轮比较几次
        int[] arr = {4,23,52,1,25,43,53};
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int num= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=num;
                }


                }
                
            }  for (int k = 0; k <=arr.length-1 ; k++) {
            System.out.println(arr[k]);
            
            
        }
    }
}
