package com.offcn.stopthread;

public class B extends Thread{
    public B() {
    }

    public B(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <=50 ; i++) {
            System.out.println(getName()+"      "+i);
            if (Test02.flag){
                break;
            }
            //让其稍微跑的慢一点
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
