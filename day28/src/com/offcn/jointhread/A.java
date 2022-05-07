package com.offcn.jointhread;

public class A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <=20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"        "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
