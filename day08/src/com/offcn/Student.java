package com.offcn;

public class Student {
    //类的命名;每一个单词的首字母大写
    //当我们书写类的时候,我们不需要再去书写main 主方法入口main()
        //属性 ===成员变量 整体和变量一样 有一个特性 不需要书写 具体的变量值了
    //姓名
    String name ="张三";
    //年龄
    int ago;
    //性别
    String  sex;
    //身高
    double  height;
    //这个学生能做什么事情:行为===>方法
    //和我们之前学习的方法定义几乎一模一样 现在我们可以把static去掉
    //学习  无参无返
    public void study(){
        System.out.println("学生很喜欢学习");
    }
        //打篮球 无参无返
        public void playBasketeball(){
            System.out.println("打篮球真的菜");
        }
        //无参有返 :参加自我介绍 introduce
    public String introduce(){
        return name+"特别喜欢打羽毛球";
    }//学生可以做加法运算
    public int add (int num1,int num2){
        return num1+num2;
    }

}