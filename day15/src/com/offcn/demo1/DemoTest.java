package com.offcn.demo1;

public class DemoTest {
    //饿汉式 单列模式
    //1私有无参构造
    //2 . 构建一个唯一的对象 这个对象私有化
    //3. 对外提供唯一的公开的访问方式
   /*   private  DemoTest(){};
    private  static  DemoTest ss= new DemoTest();
    public  static  DemoTest  get(){
        return ss;
    }*/
    //懒汉式
    //1  私有化无参构造
    private DemoTest() {
    }

    ;
    // 2 构建一个唯一的对象 这个对象私有化
    private static DemoTest iii = new DemoTest();

    //3  写方法 判断对象存不存在 不存在就创建 存在就输出
    public static DemoTest get() {
        if (iii == null) {
            iii = new DemoTest();
        }
        return iii;
    }
}



