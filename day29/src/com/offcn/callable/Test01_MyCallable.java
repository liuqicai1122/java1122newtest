package com.offcn.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test01_MyCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable对象
        MyCallable mc=new MyCallable();
        //要想让我们的第三种Callable线程跑起来 也要使用Thread中的start()方法
        //通过查看Thread 里面 我们的Callable的实现类无法直接与我们的Thread产生联系
        //我们通过查看Runnable的实现类对象,我们发现了一个实现类FutureTask
        //FutureTask(Callable<V> callable)创建一个FutureTask,一旦运行就执行给定的Callable
        FutureTask<Integer> ft=new FutureTask<>(mc);
        //FutureTask 实现了Runnable证明 就是Runnable的一个实现类对象
        Thread t1=new Thread(ft);
        ft.run();
        Integer integer = ft.get();
        System.out.println(integer);
    }
}
