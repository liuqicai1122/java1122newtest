package com.offcn.this1;

public class Person {
    //通过private 保护我们的属性
    //private 私有的
     private String name;     private  int age;
     //虽然被private 私有,不能直接被外界进行使用,但是我们可以在本类中提供一种方式
    //可以让外界间接的使用的方式setter (赋值)和 getter(获取)
    //赋值
    public void setName(String name){
        //因为赋值的失败 我们引入了this 关键字
        //this 可以代表当前对象
        this.name=name;
    }
        //取值
    public String getName(){
        return  name;
    }
    public void setAge( int age){
        if(age<0 ||age>120){
            System.out.println("你输入的年龄不合法");
        }else {
            this.age= age;
        }
    }public int getAge (){
        return age;
    }
}
