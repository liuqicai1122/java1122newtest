package com.offcn.innerclass;

public class Boy3 {
    private  static double height=180;

    static class Heart{
        int jump=111;
    public void show(){

        System.out.println("这个男孩升高:"+height +",心跳"+jump);
    }
    }
    public void show(){
        Heart h= new Heart();
        System.out.println(h.jump);
        h.show();
    }
}
