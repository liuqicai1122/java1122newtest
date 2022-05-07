package com.offcn.string1.object1;

public class Test {
    public static void main(String[] args) {
        Student s= new Student();
        Student s1=new Student();
        // 构造方法 只有一个空参构造
        //Object   obj=new Object();
        //obj.hashCode();

        int i=s.hashCode();
        int ii=s.hashCode();
        System.out.println(i);
        System.out.println(ii);
        System.out.println("==================");
        int i2=s1.hashCode();
        System.out.println(i2);
        //hashCode()计算对象在内存中的位置,并给出一个int类型的数值
        //如果返回 的是同一个值,那证明是同一个对象 ,如果数值不同,就可以说是不同的对象

    }
}
