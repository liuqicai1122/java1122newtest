package com.offcn.duotai4;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {


        //测试的目的 就是通过我们的动物园 来去喂养动物
        Zoo z = new Zoo();

         Animal d = new Dog();
        z.feed(d);
        Monkey m= new Monkey();
        z.feed(m);
        Tiger t= new Tiger();
        z.feed(t);
        Cat c= new Cat();
        z.feed(c);
        //以上我们虽然 用正常形式完成了喂养但是编写的太多了
        //所以我们用多态完成 我们将Zoo里面的参数列表替换成 Animal就可以
        Animal an=new Cat();
        z.feed(an);

    }
}
