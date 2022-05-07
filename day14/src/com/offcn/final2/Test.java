package com.offcn.final2;
//被final修饰的类不能有子类 public class Test extends Father
public class Test {
    public static void main(String[] args) {
        Father f= new Father();
            int num=20;
           int num1=30;
                num=40;
         f.add(num,num1);

    }
}
