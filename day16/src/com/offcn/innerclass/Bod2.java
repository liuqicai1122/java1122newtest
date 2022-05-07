package com.offcn.innerclass;

public class Bod2 {
    private  double height=180;

    private   class Heart{
        int jump=120;
         public void  show(){
             System.out.println("这个男孩身高"+height+",心跳"+jump);
         }
    }
    //内部类用private修饰
    //提供一个public 修饰的方法就可以了
    public void useHeart(){
        Heart h= new Heart();
        System.out.println(h.jump);
        h.show();
    }
}
