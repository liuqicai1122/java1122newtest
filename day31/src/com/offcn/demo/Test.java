package com.offcn.demo;

public class Test {
    public static void main(String[] args) {
        TcpScoketThread2 tst=new TcpScoketThread2();
        Thread t1=new Thread(tst,"用户1");
        Thread t2=new Thread(tst,"用户2");
        Thread t3=new Thread(tst,"用户3");
        t1.start();
        t2.start();
        t3.start();
    }
}
