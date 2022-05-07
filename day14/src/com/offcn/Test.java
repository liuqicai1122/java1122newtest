package com.offcn;

public class Test {
    public static void main(String[] args) {
        Son son= new Son();
        son.play();//这是重写后的 儿子的方法
        son.lookChild();//这是继承了父类中的方法 儿子没法重写
    }
}
