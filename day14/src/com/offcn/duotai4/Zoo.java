package com.offcn.duotai4;

import java.util.concurrent.Callable;

public class Zoo {
    //喂动物的方法 定义
    /*public void feed(){
        System.out.println("动物园可以喂养动物");
    }*/
    public  void feed(Animal an){
         an.eat();
    }
   /* public  void feed( Cat cat){
    cat.eat();
    }
    public  void feed( Tiger dog){
        dog.eat();
    }
    public  void feed( Monkey dog){
        dog.eat();
    }
*/

}
