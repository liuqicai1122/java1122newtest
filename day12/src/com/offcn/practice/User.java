package com.offcn.practice;

public class User {
    //案例2：使用计数器num统计创建User对象的个数（提示构造方法里对num进行自加操作
    private  static  int num;
        //静态变量 需要在构造方法中 进行自增操作
    //构造方法格式及定义
    /*格式
    权限修饰符  类名 (参数列表){}
    * */
    public User(){
        num++;
        System.out.println("当前已经创建了"+num+"个对象");
    }
}
