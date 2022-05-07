package com.offcn.stopthread;

public class A extends  Thread{
    public A() {
    }

    public A(String name) {
        super(name);
    }
    //我们的run方法,不允许抛出异常
    //  throws  InterruptedException
    //run方法里面要是有了异常,我们只能try,catch处理

    @Override
    public void run() {
        for (int i = 1; i <=50 ; i++) {
            System.out.println(getName()+"      "+i);
            //让其稍微跑的慢一点
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
