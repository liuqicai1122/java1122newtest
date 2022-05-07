package com.offcn.demo.extend1;

public class Zi extends Fu {
    int num=99;
    //当我们子类的成员变量名与父类重名 我们再去正常的路径访问子或父类中的变量时候
    //我们发现 取值都是子类的  解决方案就是我们的super 关键字
    //super  本质 当前对象的父类对象
    public void show (){
        System.out.println("Fu中的num"+super.num);
        System.out.println("Zi中的num"+num);
    }
    @Override
     public void study(){
        super.study();
        System.out.println("孩子在空调室中学习,很幸福");
        // 父亲中study方法
     }
}
