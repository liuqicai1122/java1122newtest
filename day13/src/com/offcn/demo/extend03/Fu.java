package com.offcn.demo.extend03;

public class Fu {
     private  String name="老憨怂";
     private  int age;

     public Fu(){
         System.out.println("父亲的空参执行了");
     };
     public Fu (String name,int age){
         System.out.println("父亲的有参执行了");
         this.name=name;
         this.age=age;
     }

}
