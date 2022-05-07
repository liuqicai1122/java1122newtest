package com.offcn;

public class Father {
    public void play(){
        System.out.println("父亲喜欢搓麻将");
        //final 关键字 修饰方法 表示这个方法是最终方法
        //然后不能被子类重写 了 可以被调用
    }
    public final  void lookChild(){
        System.out.println("父亲会照顾娃");
    }
}
