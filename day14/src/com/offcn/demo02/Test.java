package com.offcn.demo02;

public class Test {
    public static void main(String[] args) {
        Shape num1 = new San(3,4);
        Shape num2 = new Rectangle(2,4);
        Shape num3 = new Yuan(3);
        num1.aaArea();
        Object [] arr= new Object[]{num1,num2,num3,num2,num3};
         /*       double sum=0;
           for (int index=0;index<=arr.length-1;index++){
                sum += ((Shape) arr[index]).aaArea();
           }
        System.out.println(sum)*/;
        for (int index = 0; index <arr.length-1 ; index++) {
            if(arr[index] instanceof  Shape){

            }

        }
    }
}
