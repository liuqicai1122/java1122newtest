package com.offcn.thread;

public class Test01_守护线程 {
    public static void main(String[] args) {
        //匿名内部类
        //() 当成匿名内部类的  构造方法
        Thread t1=new Thread("守护线程"){
            @Override
            public void run() {
                int i=0;
                while (true){
                    System.out.println(getName()+"-----------------" +(i++));
                }
            }
        };
        t1.setDaemon(true);
        t1.start();

        Thread t2=new Thread("被守护线程"){
            @Override
            public void run() {
                for (int i = 0; i <=20 ; i++) {
                    System.out.println(getName()+"       "+i);
                }
            }
        };
        t2.start();

    }

}
