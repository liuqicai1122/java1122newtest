package com.offcn.demo;

public class Demo02_Lambda表达式的特殊情况 {
    //注意 lamdba表达式()里面的参数 没有数据类型
    //特殊情况1 : 参数列表只有一个的时候,我们可以省略()
    public static void main(String[] args) {
        MyInterface2 my2=  b ->{
            System.out.println(b+"我爱中国");
        };
        my2.show("刘奇才");

        //特殊情况2 : {}里面只有一句语句体的时候 且没有返回值类型 可以省略{}
        MyInterface3 my3= s-> System.out.println(s);
        my3.show(222);

        //特殊情况3: 有返回值而且方法体语句只有一句 可以把{} return一起省略
        MyInterface4 my4= (i, t) -> i+t+222;
        my4.add(1,1);

    }

}




@FunctionalInterface
interface  MyInterface2{
    //方法有一个参数列表
    void show (String s);
}
@FunctionalInterface
interface  MyInterface3{
        //方法有一个参数列表
    void show(Integer s);
}
@FunctionalInterface
interface  MyInterface4{
    int add(Integer i, Integer b);
}


