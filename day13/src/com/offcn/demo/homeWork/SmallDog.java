package com.offcn.demo.homeWork;

public class SmallDog extends  Dog {
    public void setName(String str){
         dogName=str;
    }
    public void steAge(int num){
        dogAge=num;
    }
        public  void dogWalk(){
        super.dogWalk();
            System.out.println("那个大狗"+super.dogName+"跑起来很憨"+"这个小狗跑起来更憨了");
        }
}
