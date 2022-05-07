package com.offcn.callable;

import java.util.concurrent.Callable;
public class MyCallable implements Callable<Integer> {
    //Callable是多线程的第三种实现方式
    @Override
    public Integer call() throws Exception {
        int i;
        for ( i = 0; i <=5 ; i++) {
            System.out.println("MyCallable"+i);
        }
        return i;
    }
    //Callable中的一个抽象方法 等价于 我们的Runnable的run()方法
    //1 call方法有返回值类型
    //2.call还可以抛异常

}
