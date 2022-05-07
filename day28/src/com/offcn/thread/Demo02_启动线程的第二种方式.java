package com.offcn.thread;

public class Demo02_启动线程的第二种方式 {
    public static void main(String[] args) {
        //创建Runnable对象
        MyRunnable01 mr = new MyRunnable01();
        //但是Runnable并没有start()方法
        //我们现在学习线程,启动方式只有一种 就是start()
        //  Thread 中有个构造方法 Thread(Runnable target ) 分配一个新的Thread对象
        Thread t1 = new Thread(mr);
            t1.start();
            for (int i=0;i<=10;i++){
                System.out.println("main++++++++"+i);
            }
    }
}
