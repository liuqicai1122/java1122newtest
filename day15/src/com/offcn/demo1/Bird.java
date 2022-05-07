package com.offcn.demo1;

public abstract class Bird {
    public void  fly(){
        System.out.println("鸟会飞,飞的更高,摔得更惨");
    }
    public void call(){
        System.out.println("嗷嗷的憨叫");
    }
    public abstract  void attack();
}
