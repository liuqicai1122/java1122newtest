package com.offcn;

public class Student1 {
    private  int sid;
    private   String name;
    public  Student1(){};
    public Student1(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    /*static 静态修饰符
    *我们只需要在静态变量的数据类型前面添加static即可
    *  static再去修饰变量的时候 我们权限修饰符一般不写或者携程public
    *静态变量我们一般喜欢直接赋值,静态变量的操作方式和之前一模一样
    *
    *静态变量的位置,在方法区中 ,方法区中所以资源,只会在程序加载的时候运行一次
    * 方法区的加载时机是最早的   早于对象
    *
    * */
    public static String     schoolName="哈佛大学";

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student1.schoolName = schoolName;
    }/*静态方法就和我们之前的 方法定义一模一样了
    注意事项:
       静态方法; 可以直接访问静态变量 静态方法
         静态方法不能直接访问非静态方法 变量
    */
    public static void study(){
        System.out.println("我们很喜欢学习"+"清华北大" + "");
        //this 不能调用静态方法 ,因为this代表的是对象 我们的静态方法不属于对象
    }//非静态的 方法 可以直接访问静态的一切内容
    public void  sleep(){
        System.out.println("学生真tm能睡");
        schoolName="b站大学";
        study();
        getSchoolName();
        System.out.println(schoolName);
    }
}
