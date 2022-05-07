package com.offcn.demo;

public class Demo_匿名对象 {
    public static void main(String[] args) {
        //匿名对象 也是一个对象 它也需要new 创建出来
        //没有名字的对象 我们称匿名对象
        new Teacher().teach(3);
        //匿名对象也能 调用属性和方法,但是我们更加喜欢匿名对象 调用方法
        //格式 : new 类名() . 方法名 /属性
        System.out.println(new Teacher());//null
        new Teacher().name="小王";
        System.out.println(new Teacher());//null
        //由着三个我们可以看出  匿名对象只能运行一次
        // 每一个new 都会在堆内存中创建一个空间 一个地址  和 创建对象 命名的有所区别 匿名对象
        //在堆内存中 只能存在一次 不能一直存在 而给创建的对面命名后 地址会一直存在
        //匿名对象 在堆空间只能存在以下 不信的话 我们 sout打印两个 new. Teacher
        // 地址不一样 我们将上面sout 删了 下面的地址也有可能变为上面的 因为上面的对象在堆内存中空间已经
        //没了
        //匿名对象的好处,用来执行那些只需要执行一次的方法的对象;好处就是节省空间
        //比如百万行的代码 我们只需要这个类中的方法运行 一次 就不需要了 而如果赋值 该被命名的对象
        //所在堆内存中开辟的空间还会一直存在占有着
        Teacher sb=new Teacher();
        sb.teach(5);
    }
}
