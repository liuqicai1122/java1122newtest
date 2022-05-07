package com.offcn.demo;

public class Person {
    //我们要去封装我们数据,通过private进行封装
    //private只能在本类中进行使用
    private String name;
    private int age;
    //我们在属性前加了private 就是封装 我们在别的main中使用 创建Person对象后 取个对象名i i.name i.age就会
    //报红 无法使用 因为我们前面加了private 将他封装起来了 无法使用
    //我们把我的的数据封装起来以后,我们需要提供一种方式,来让调用者间接的使用
    //我们对变量的使用 无非两种 一是赋值 而是 取值
    //我们先去进行赋值 以后我们需要传递一个String类型的名字 x,之后赋值给我们name成员变量
    public void setName(String iii){
        //以后如果我们要对我们的名字做一定的限制的时候,我们就可以在这个方法里面进行书写
        //比如名字的长度限制 或者是一些特殊符号不能用
        name=iii;
    }
    public String getName(){
        return name;
    }
    //给年龄赋值 并且加限制
    public void setAge (int iii){
        if(iii<0 ||iii>=120){
            System.out.println( "您输入的年龄不符合标准");
        }else {
            age=iii;
        }
    }public int getAge(){
        return age;
    }
}
