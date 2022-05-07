package com.offcn.prictice1;

public class Student {
    //新班开班 学员报到 现在想为每一个新来报到的同学编写学号(sid),
    //从第一名同学开始,sid 为1  以此类推  学号必须唯一 连续
    //并且与班级的人数相符 这样以便知道 要分配给下一名新同学的学号是多少
    private   static int sid;
    private  String name;
    private  int age;
    //需要创建一个静态变量  记录学生个数
   // static  int studentNum=0;

    public Student() {
        sid++;
        this.sid=sid;
    }

    public Student( String name, int age) {
        sid++;
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getStudentNum() {
        return sid;
    }

    public static void setStudentNum(int studentNum) {
        Student.sid = studentNum;
    }
    //显示学生姓名 目前有多少学生的一个方法
    public void show (){
        System.out.println("学号:"+sid+",名字"+name
        +",年龄"+age+",目前您是第"+sid+"名学生");
    }
}
