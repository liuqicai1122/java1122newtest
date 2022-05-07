package com.offcn.demo;

public class Teacher {
    //属性==成员变量
    //成员变量的位置:在类中 方法中 别名 全局变量
    String name;
    //    //行为 ==方法
    public void teach(int year){
        //在方法中 局部变量
        int num;//注意这是在方法中的变量 我们没有赋值 在 main 中 是不能运行的 会报错
        System.out.println("老师具有教课的能力");
        System.out.println(name);//在main 运行 我们没有赋值 但name 本身是成员变量 不需要 这样会输出null
        //这个地方告诉我们 局部变量 要有默认值,先赋值 在使用
        //System.out.println(num);

        //重点 要记住 成员变量与局部变量的区别
        /*位置:
        成员变量 :类中方法外
        *局部变量:方法定义的小括号内,或者是方法{} 里面===>在方法里面定义
        内存位置 :
        成员变量:属于对象在堆内存里面
        局部变量:属于方法 ,在栈内存里面
        生命周期:
        成员变量 :和对象一样 创建对象了就出现 随着对象的消失而消失
        局部变量:和方法一样,随着方法的调用而产生,随着方法的调用结束而消失
        有无默认值:
        成员变量:有默认值 整数 0 小数0.0 布尔是false char ''  引用数据类型是 null
        局部变量:系统不会自带默认值 我们必须要赋值 不然在main 运行 会报错

        * */


    }
}