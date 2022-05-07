package com.offcn.thread;
    //1.自定义一个类,继承Thread
public class MyThread01 extends Thread{
            //2.重写run方法


        public MyThread01() {
        }

        public MyThread01(String name) {
            super(name);
        }

        @Override
        public void run() {
            //3.在run中书写正常代码
            for (int i = 1; i <=5 ; i++) {
                System.out.println(getName()+"   "+i);
            }
        }
    }
