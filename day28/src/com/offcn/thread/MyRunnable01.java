package com.offcn.thread;

public class MyRunnable01 implements  Runnable {
    @Override
    public void run() {
        //2.重写Runnable接口中唯一的抽象方法 run()
        //3 书写正常代码


        //这里如何截取Runnable的线程名字呢
        //currentThread() Thread类的静态方法,返回cpu正在执行的线程的对象
        for (int i = 0; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"            "+i);
        }
    }
    //启动多线程的第二种方式
    //1. 自定义一个类 实现Runnable接口

}
