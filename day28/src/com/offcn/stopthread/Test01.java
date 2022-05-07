package com.offcn.stopthread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        A  a =new A("线程A");
        a.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"          "+i);
            if(i==10){
                    //stop()方法已经过时
                a.stop();
            }
            Thread.sleep(300);
        }
    }
}
