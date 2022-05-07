package com.offcn.stopthread;

public class Test02 {
        static  boolean flag=false;
    public static void main(String[] args) throws InterruptedException {
        B b=new B();
        b.start();
        //以下是我们的主线程
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--------"+i);
            if (i==10){
                flag=true;
            }
            Thread.sleep(300);
        }
    }
}
