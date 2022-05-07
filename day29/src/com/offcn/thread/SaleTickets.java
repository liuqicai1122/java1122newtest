package com.offcn.thread;

public class SaleTickets implements  Runnable{
    //共享100张票
    static  int tickets=100;
    @Override
    public void run() {
            //当我们的票 大于0的时候,才能卖票
            while (tickets>0){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售卖"+(tickets--)+"张票");
            }
    }


}
