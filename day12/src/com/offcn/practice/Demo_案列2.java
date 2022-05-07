package com.offcn.practice;

public class Demo_案列2 {
    public static void main(String[] args) {
    //这道案列给我们证明了几件事情
        //第一件 每次我们创建对象 都会调用一个构造方法
        //构造方法 也属于非 静态  可以直接使用静态资源
        User i= new User();
        User ii = new User();
        User iii =new User();
    }
}
