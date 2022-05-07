public class Student1 {
    //学号
    private  int sid;
    private  String name;
    //一旦我们的变量添加上static之后
    //我们一般会把权限修饰符修改为public 不去提供setter getter
    //因为写上static之后 这个内容就跑到方法区 多了一个静态区
    //不在创建对象 之后开辟的空间里面了
    //字节码文件里面 原来只有.class 现在又有了静态区
    //方法区   在整个程序运行过程中 只会执行一次
    public static String schoolName="中公教育";
    public Student1(){};
    public Student1 (int  sid,String name, String schoolName){
        this.sid=sid;
        this.name=name;
        this.schoolName=schoolName; };

    public int getSid(){ return getSid(); }
    public void setSid(int num){this.sid=num;}
    public  void setName(String name){this.name=name;}
    public  String getName(){return  name;}
    public  void  setSchoolName(String schoolName){this.schoolName=schoolName;}
    public  String getSchoolName(){return schoolName;}
}
