package com.offcn.fanshe;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo04_通过构造创建对象 {
    //第一步 获取反射 Class类对象
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;
        //获取单个被public 修饰的构造方法
        // get  Constructor(Class<?>... parame)
        // 返回单个公共的构造方法对象
        Constructor<Person> constructor = personClass.getConstructor(String.class);
        System.out.println(constructor+"+++++++++++");
        //  有参构造创建对象 newInstance(Object...initargs)
        //Object...initargs 这是有参的实际值
        Person 张三 = constructor.newInstance("张三");//创建对象
        //newInstance 使用 被私有的构造方法 不能被创建出对象 会报错



        //无参创建对象
        //先获取无参构造方法
        Constructor<Person> constructor1 = personClass.getConstructor();
        Person person = constructor1.newInstance();
        System.out.println(person);

        //获取单个的被private修饰的构造方法
        //Constructor   getDeclaredConstructor(Class<?>... parameterTypes)
        //返回单个构造方法对象
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class, int.class);
       // Person iii = declaredConstructor.newInstance("李四", 22);
        //私有的构造方法对象不能直接创建对象
        //默认的
        Constructor<Person> declaredConstructor1 = personClass.getDeclaredConstructor(int.class);
        Person person1 = declaredConstructor1.newInstance(21);
        System.out.println(person1);
    }
}
