package com.offcn;

//我们已经定义好了类 使用
//创建对象  类名 对象名(自己取)=new 类名();看到new 就说明创建对象了
public class Demo_Test {
    public static void main(String[] args) {
        //我们已经定义好的类 ,现在去进行使用
        //创建对象 类名 对象名 =new 类名();
        Student  sb= new Student();
        Student sb2= new Student();
        System.out.println(sb);
        System.out.println(sb2);
        //上面的sb 和sb2 不是同一个对象 因为都使用了new
        System.out.println("_____________________________________________");
            //当我们创建类的时候不用给我们的成员变量赋值 即使不赋值也不会报错,还是一个对象
        //对象的值 一般都是我们创建完对象后手动赋值的 不报错是因为jvm给我们赋值了默认值
        //整数 0  小数 0.0 布尔 false char ' ' 引用数据类型 null
        //给属性赋值
            sb.name="蔡徐坤";
            sb.ago=23;
            sb.height=170;
            sb.sex="女";
        System.out.println(sb.name);
        System.out.println(sb.ago);
        System.out.println(sb.sex);
        System.out.println(sb.height);
          //调用方法 对象名.方法名
        System.out.println(sb.introduce());//蔡徐坤喜欢打羽毛球 已经将类里面的=张三改为蔡徐坤
        System.out.println(sb2.introduce());//张三喜欢打羽毛球 因为 sb2 并没有重新赋值 还是原来的值
   sb.playBasketeball();//没有返回值类型 直接写出来 打印的话会报错
   sb2.playBasketeball();//一样
    }
}
