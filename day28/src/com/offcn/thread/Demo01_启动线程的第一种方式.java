package com.offcn.thread;

public class Demo01_启动线程的第一种方式 {
    public static void main(String[] args) {

        //原来的我们只有一个线程
        /*for (int i = 0; i <=2 ; i++) {
            System.out.println(i);
        }*/
        //多线程 刚刚我们定义了一个新的线程 MyThread01
        //创建对象
        MyThread01 mt=new MyThread01();
        mt.start();
        //mt.run()用这个方法调用 还是一个线程main 只能用start 表示另外一个线程
        for (int i = 0; i <=5 ; i++) {
            System.out.println("Mian---------"+i);
        }

    }
}
