package com.offcn.animal;

public class Cat {
      //属性
    String name;
    int age;
    String color;
    //行为
    public void   catchMouse(){
        System.out.println(name+"害怕老鼠");
    }
    /*构造方法的一些特性
        当我们没有提供任何构造方法的时候,系统会给我们提供一个无参构造方法
        方法名  和 当前类名完全一致
        这个构造方法我们一般会使用public进行修饰
        构造方法没有返回值类型 连void都不要写
        ()形参列表
        调用时机
        每一次我们创建对象new 时候 都会调用一次构造方法
        注意:一旦我们手动书写了有参构造,那么jvm就不会再给我们自动构造无参数
        要求:以后我们构造了有参方法 ,还要必须手动定义一个无参构造
     *构造方法 也符合重载的要求
     同一个类中 方法名形同1   参数列表不同 与返回值 类型无关

     */
            public Cat(){
                   name="小花";
                   age=2;
                    //方法体语句//这里就是相当于系统默认的无参构造
            }
            //构造方法最主要的作用 给成员变量  进行赋值
            //一旦赋值  我们就需要有参构造
         public Cat(int i, String b,String c){
                age=i;
                name=b;
                color=c;
         }public Cat (int i,String b){
                age =i;
                name =b;
    }
}
