package com.offcn.abstract1;

public  abstract class Animal {
    //抽象类的由来 完全是因为抽象方法
    //  抽象方法必须在抽象类中 而抽类中可能没有抽象方法
        public abstract  void  eat();
        //抽象方法 可以将我们的方法{}给直接去掉,这时我们会添加 一个关键字abstract
        public void sleep(){
            System.out.println("动物都有睡觉的技能");
        }
}
