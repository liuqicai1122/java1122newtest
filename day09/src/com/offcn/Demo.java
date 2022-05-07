package com.offcn;

public class Demo {
    public static void main(String[] args) {
      int[] w=new int[]{21,43,54,213};
        System.out.print(iii(w));

    }
    public  static  String iii(int [] arr){
      String i="";
       for (int index=0;index<=arr.length-1;index++){
           i=arr[index]+"#";
           System.out.println(i);
        }
        return i;
    }
}
