package com.offcn;

public class Demo01_死锁效应 {
    //创建俩对象
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();
        new Thread("线程1"){
            @Override
            public void run() {
                synchronized (obj1){
                    System.out.println(getName()+"已经拿到A锁,现在还需要一个B锁");
                    try {
                        sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2){
                        System.out.println(getName()+"A锁B锁都已经拿到了");
                    }
                }
            }
        }.start();

        new  Thread("线程2"){
            @Override
            public void run() {
            synchronized (obj2){
                System.out.println(getName()+"已经拿到了B锁,现在还需要一个A锁");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1){
                    System.out.println(getName()+"A锁B锁都已经拿到了");
                }
            }
            }
        }.start();
    }
}
