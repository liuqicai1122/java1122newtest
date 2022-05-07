package com.offcn.animal;

import java.util.concurrent.Callable;

public class CatTest {
    public static void main(String[] args) {
        //构造方法 new 创建对象 () 构造方法===构造器
        //类名 对象名 = new 类名();
        Cat c =new Cat();//我们括号是构造方法 里面现在啥都写不了 系统 默认给我们无参构造方法
        Cat b=new Cat(22,"马牛逼","彩色");
        System.out.println(b.name);
        System.out.println(b.age);
        Cat a=new Cat();
        System.out.println(a.name);
        Cat v =new Cat(21,"憨怂","彩色");
        System.out.println(v.name);
        Cat r =new Cat(66,"傻逼");
        System.out.println(r.color);


            }
        }


