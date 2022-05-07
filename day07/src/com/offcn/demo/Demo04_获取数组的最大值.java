package com.offcn.demo;

public class Demo04_获取数组的最大值 {
    public static void main(String[] args) {
//获取数组的最大值 我们定义一个获得数组的方法
            int [] max= {123 ,231,423};
            //最大值只能从我们定义的数组中获取
        System.out.println(getMax(max));



    }

    //获取数组的最大值 我们定义一个获得数组的方法
    public static int getMax (int[]arr ){
        int max = arr[0];
        for (int i = 1; i <=arr.length-1 ; i++) {
            if(arr[0]<arr[i]){
                max=arr[i];
            }

        } return max;


    }


}
