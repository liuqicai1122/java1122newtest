package com.offcn.roch;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTickets implements Runnable{
    static  int i=100;
    ReentrantLock r1=new ReentrantLock();
    @Override
    public void run() {
        while (true){
        r1.lock();
                if (i>0){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"        "+(i--)+"张票");
                }
                r1.unlock();
                }
        }


}

