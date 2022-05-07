package com.offcn.demo;

import java.util.function.Consumer;

public class Demo04_消费型接口 {
    //案列  定义出一个方法功能 客户预计消费500 每个客户消费不同
    // 客户1 花了 500 大宝剑
    //客户2 花了500 买了化妆品
    //客户3 花了5000 一双球鞋
    public static void main(String[] args) {
        //客户1 花了500 一个大宝剑
        //Consumer<Double> con 本质是一个函数式接口,在方法调用的时候.,传递的应该是函数式接口的实现类对象
        //函数式接口的实现类对象 我们通过lambda表达式实现
        Consumer<Double>con= x-> System.out.println("消费"+x+"买了一个大宝剑");
        useMoney(500,con);

        Consumer<Double>con1=xx->{
            if(xx>=500){
                System.out.println("消费量"+xx+"买了化妆品");
            }else {
                System.out.println("钱不够");
            }
        };
        useMoney(111,con1);

        Consumer<Double>con2=xx->{
            if(xx>=500){
                System.out.println("消费量"+xx+"买了球鞋");
            }else {
                System.out.println("钱不够");
            }
        };
        useMoney(999,con2);

    }
    public  static  void useMoney(double money, Consumer<Double> con){
        //Consumer 中有一个抽象方法 accept(T t)
        //我们通过accept进行消费 消费的是money
        con.accept(money);
    }
}
