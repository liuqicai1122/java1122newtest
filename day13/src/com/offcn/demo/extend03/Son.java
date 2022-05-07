package com.offcn.demo.extend03;

public class Son extends Fu{
    String name="小憨怂";
    int age;
    double height;
    //构造方法是方法 可以重写吗?
    //构造方法不可以重写,但是可以被调用,构造调用通过super(参数列表);
    //他也有要求,和this 调用构造方法一样 只能放到 子类构造方法中有效代码行的第一行
    public Son(){
            //子类的构造方法第一行,如果我们没有提供super或者没有手动调用任何super()参数列表
        //系统会默认添加一个super()  目的:让父类资源 优先于子类进入内存
        super();

    }
    public Son (String name ,int age, double height){
        //系统会默认调用一个父类 空参 super(){}
        //但我们手动调用父类有参 就没空参了
        super (name,age);
        this.height=height;


    }
}
