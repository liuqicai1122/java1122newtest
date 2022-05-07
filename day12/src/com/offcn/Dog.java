package com.offcn;

public class Dog {
        private  String name;
        private  int    age;
    /*静态代码块:
    代码块就是被{}包裹起来的代码,这个代码块会存在于我们代码中不同的位置,有不同的作用
           静态代码块 局部代码块  构造代码块 同步代码块(后面学)
     *静态代码块的    格式  ; static{}
       位置 类中 方法外
       静态代码块的作用 用来去执行 那些在整个过程中 只需要运行一次的情况与创建对象无关
     */
        static{
        System.out.println("静态代码块执行了");
    }
    public void call(){
        System.out.println("这个狗会叫");
    }

}
