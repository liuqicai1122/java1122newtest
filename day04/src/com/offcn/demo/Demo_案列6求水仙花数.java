package com.offcn.demo;

public class Demo_案列6求水仙花数 {

    public static void main(String[] args) {
        //案列 求出100 到 999之间的水仙花数 并且算出他们个数
         int flag=0;
        for (int i = 100; i <=999 ; i++) {
           System.out.println(i);
            int num1= i/100;
            int num2 =i/10%10;
            int num3 = i%10;

            int num4 = num1*num1*num1+num2*num2*num2+num3*num3*num3;
            if (i ==num4){   //真正的水仙花在上面里面筛选出来
                System.out.println(i);//输出的是 i等于 num4 为水仙花的全部数
                flag++;

            }

        } System.out.println("水仙花总数:"+flag+"个");


    }
}
