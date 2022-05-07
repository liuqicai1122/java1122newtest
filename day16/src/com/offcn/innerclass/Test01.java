package com.offcn.innerclass;

public class Test01 {
    public static void main(String[] args) {
        //普通的成员内部类,前提是没有被private进行修饰
        //我们的访问方式 外部类.内部类 内部类对象名=new 外部类(). new 内部类();
        Body.Heart heart=new Body().new Heart();
        System.out.println(heart.jump);
        heart.show();
      // Body i=new Body();//666
       // i.useHeart();这个男孩的身高:180.0,心跳666
    }
}
