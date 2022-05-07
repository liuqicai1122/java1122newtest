package com.offcn.jointhread;

public class Test01 {
    public static void main(String[] args) {
        A a=new A();
        Thread t1=new Thread(a,"线程A");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        for (int i = 0; i <=20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"       "+i);
        }
    }
}
