package com.offcn.prictice1;

public class Single {
    /*单例模式
    *1.创造私有
    * 2.创建出唯一的一个对象,这个对象需要私有化
    * 3.提供一个公共的访问方式,可以让外界来访问这个唯一的一个对象
    * 单列模式分两种
    * 第一种 饿汉式; 想创建出唯一的对象
    * 第二种 懒汉式   ;创建对象之前 需要先去判断 有没有对象  有对象就不去创建 没有就创建
    * 饿汉式 比较浪费内存 不管用不用 都创建出唯一的一个对象 时间快
    * 懒汉式  先去判定有没有对象 有不创建 没有的话  才去创建对象 时间慢 节省空间
    * 饿汉式 是 空间换时间  懒汉式是 时间换空间
    * 我们更喜欢 饿汉式
    */
    //构造私有化 饿汉式
   // private  Single(){};
   // private  static  Single st = new Single();
    //提供公共的访问方式
   /* public static  Single get(){
        return  st;
    }*/

    //懒汉式 第一步 构造私有
     private Single (){};
        //第二步创建 一个私有的对象
     private  static Single st= null;
     //去进行判断 判断这个对象存在还是不存在 存在的时候   就不去创建了
    //如果 不存在的话就创建出唯一的一个对象
    public  static  Single  getInstance(){
        if(st==null){
            st=new Single();
        }return st;
    }


}
