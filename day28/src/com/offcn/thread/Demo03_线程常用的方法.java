package com.offcn.thread;

public class Demo03_线程常用的方法 {
    public static void main(String[] args) throws InterruptedException {
        //1.构造方法Thread(String name) 构造方法初始化线程的名字
        MyThread01 mt1 = new MyThread01("线程1");//这里爆红是因为 MyThread01 没有构造方法
        mt1.setName("线程1.1");
        mt1.sleep(1000);
        mt1.start();
        //2.Thread(Runnable target ,String name)
        //给我们的Runnable 起线程名字
        MyRunnable01 mr=new MyRunnable01();
        Thread t2= new Thread(mr,"线程2");

        t2.start();
        t2.setName("线程2.2");

    }

}
