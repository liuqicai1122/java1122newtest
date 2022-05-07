package com.offcn.synchronizedmethodthread;

public class SaleTickets implements  Runnable{
static  int i=100;
    @Override
    public void run() {
        //我们可以使用synchronized去保护 多线程发生问题的代码
        //synchronized(任意一个对象){}

        while (true) {
           synchronized ("this") {
               if (i>0){
                   try { Thread.sleep(200);
               }
               catch (InterruptedException e) {
                   e.printStackTrace();
               }
                   System.out.println(Thread.currentThread().getName() + "正在售卖第" + (i--) + "张票");
               }
              sale2();
           }

        }
    }

    public  synchronized  void sale2(){
        if (i>0){
            try { Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在售卖第" + (i--) + "张票");
        }

    }
}
