package com.offcn;

public class Son  extends  Father{
    @Override
    public void play(){
        System.out.println("娃喜欢玩电脑");
    }
    //@Override;
    //public void lookChild(){
       // System.out.println("娃照顾孩子不太行");
    //注意这里报错了 没法重写  因为父类这个方法加了final 为最终方法 不能修改了

}
