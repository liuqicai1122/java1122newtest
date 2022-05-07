package com.offcn.synchronizedmethodthread;

public class Test {
    public static void main(String[] args) {
        SaleTickets st=new SaleTickets();

        Thread t1=new Thread(st,"美团");
        Thread t2=new Thread(st,"猫眼");
        Thread t3=new Thread(st,"影院");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
