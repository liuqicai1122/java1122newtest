package com.offcn.jointhread;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class TestJoin01 {
    public static void main(String[] args) throws InterruptedException {


        A a = new A();
        Thread t1 = new Thread(a, "线程a");
        for (int i = 0; i <=30 ; i++) {
            System.out.println(Thread.currentThread().getName()+"             "+i);
            if (i ==10){
                t1.start();
                t1.join();
            }
            Thread.sleep(300);
        }
    }
}
