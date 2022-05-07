package com.offcn.duotai1;

public class Test {
    public static void main(String[] args) {
        //正常情况下的 创建对象
        Teacher t= new Teacher();
        System.out.println(t.num);//100 子类的100将继承中父类的10取代了 子类不写num=100
        //则会输出父类中的 10
        System.out.println(t.num1);//1000
        System.out.println("________________________________________________");
        //父类的引用指向子类对象 玩多态
        //多态再去使用成员变量时 与子类的成员变量完全关系都没有
        //只与父类的成员变量有关 父类有就用父类的 没有就报错
        //多态玩成员变量时候 口诀  编译看左边  运行看左边
        //多态条件 1 有继承关系
        //2 有方法重写(根据实际而定)
        //3 父类的引用 指向 子类的 对象
        // Person P 父类的引用      new Teacher 子类的对象
        Person p= new Teacher();
        System.out.println(p.num);//10 变量 只看父类中的变量
        //System.out.println(p.num1); 这个会报错 因为多态变量只看父类 不看
        //子类 父类中没有num1 所以就报错
    }
}
