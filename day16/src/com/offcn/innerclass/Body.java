package com.offcn.innerclass;
//Body是我们的外部类
public class Body {
        //成员变量
    private  double height=180;
    //内部类:被class修饰 类名符合类名的命名规范就可以 每个单词首字母大写 后面是一对{}
    class Heart{
        int jump=120;//内部类成员变量
        public  void show(){//内部类成员方法
            System.out.println("这个男孩的身高:"+height+",心跳"+jump);
            //内部类可以直接使用外部类资源
        }
    }
    //外部类不能直接访问内部类资源
    //jump=222会爆红
    Heart i= new Heart();
    //i.show报错 外部类不能直接使用内部类资源 方法也是
    //所以
    public  void useHeart(){
        Heart iii= new Heart();
        iii.jump=666;
        System.out.println(iii.jump);
        iii.show();
    }
}
