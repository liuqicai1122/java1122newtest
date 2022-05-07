package com.offcn.demo.Demo;
import java.util.Scanner;

  import java.util.Scanner;
        public class Demo_扩展题 {
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
     System.out.println("-----------------------------商品库存清单---------------------");
     System.out.println("品牌型号       尺寸    价格      库存数");
     String w1 =sc.next();
     double d1 =sc.nextDouble();
     double c1 =sc.nextDouble();
        int b1 = sc.nextInt();
        String w2 =sc.next();
        double d2=sc.nextDouble();
        double c2 =sc.nextDouble();
        int b2 = sc.nextInt();




        System.out.println("总库存数:"+(b1+b2));
        System.out.println("库存总金额:"+(c1+c2));
    }


}
