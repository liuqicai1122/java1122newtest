package com.offcn.demo;

public class Son extends  Father{
    public void play (){
        System.out.println("孩子喜欢玩游戏" + "");
    }
        //孩子中有方法 与父类的方法定义一模一样  不同的方法体的具体实现
        //方法的重写  有前提 发生在子父类的继承中
        /*方法的重写
          1. 前提  发生在子父级的继承中
            2.要求 1.方法名和参数列表完全一致
                   2.子类方法的权限修饰符要大于等于父类的权限修饰符(一般是等于)
                   3.返回值类型 必须是父类返回值类型的子类或和父类类型保持一致
        * *///列如
       public void sleep(){
           System.out.println("孩子睡觉的时候,需要刷刷抖音 看看小美女");
        }
        public void  sleep(int a){
            System.out.println("孩子睡觉的时候需要刷刷抖音看看美女");
        }
}
