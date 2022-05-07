package com.offcn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01_线程池的创建和使用 {
    public static void main(String[] args) {
        //创建线程池
        //我创建一个一个线程池,里面有定义几个线程
        ExecutorService executorService = Executors.newFixedThreadPool(2);
       Runnable run1= new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <=5; i++) {
                    System.out.println(Thread.currentThread().getName()+"---------"+i);
                }
            }
        };
       Runnable run2= new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <=5; i++) {
                    System.out.println(Thread.currentThread().getName()+"---------"+i);
                }
            }
        };
      Runnable run3=  new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <=5; i++) {
                    System.out.println(Thread.currentThread().getName()+"---------"+i);
                }
            }
        };
        Runnable run4=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <=5; i++) {
                    System.out.println(Thread.currentThread().getName()+"---------"+i);
                }
            }
        };
        //以上线程池也创建出来,线程任务也有了
        //怎么让我们的线程跑起来
        //ExectorService 给我们提供了开启的1方式
        //Future<?>submit(Runnable task):
        executorService.submit(run1);
        executorService.submit(run2);
        executorService.submit(run3);
        //void  shutdown()启动一次顺序关闭,执行以前提交的任务,但不接受新任务
       // executorService.shutdown();
        //List<Runnable> shutdownNow()
        //           试图停止所有正在执行的活动任务,暂时处理正在等待的任务,并返回等待执行的任务列表
       // executorService.shutdownNow();
    }
}
