package com.offcn.practice;

public class Voter {
    //案例1：使用static 完成 投票功能。
    //最多有5个人投票，定义投票人的类（voter），
    //在这个类中定义一个投票的方法，当票数超过5时，提示不能再投票。
    public static int num;
      public void voter(){
          while (true){
              if (num>=5){
                  System.out.println("投票超过5个了,不能再投票了");
                  break;
              }else {
                  num++;
                  System.out.println("已经投票"+num+"个了");
              }
          }

      }
}
