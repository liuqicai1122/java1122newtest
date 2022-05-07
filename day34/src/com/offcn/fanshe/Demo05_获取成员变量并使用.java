package com.offcn.fanshe;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Demo05_获取成员变量并使用 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //第一步 还是获取Class对象
        Class<Animal> animalClass = Animal.class;
        // 获取属性方式 和构造一样 两大类 获取public修饰的成员变量,获取所有的成员变量(主要用获取private)

        //获取public修饰的成员变量
        //获取多个
        //Field[] getFields()
        Field[] fields = animalClass.getFields();
        String string = Arrays.toString(fields);
        System.out.println(string);
        //获取单个公共的成员变量
        //Field getField(String name)
        //返回单个公共成员变量对象,参数name表示成员变量的名字
        Field height = animalClass.getField("height");
        System.out.println(height);
        //单个的public修饰的成员变量  赋值
        //set (Object obj,Object  value):用于给obj对象的,该成员变量,赋value值
        //Object obj:要给那个对象赋值
        //有两种第一种 通过public修饰的空参构造
       // Animal animal = animalClass.newInstance();
        //height.set(animal,121);
        //第二种 没有空参构造 通过有参构造创建对象
        Constructor<Animal> constructor = animalClass.getConstructor(String.class);
        Animal lisa = constructor.newInstance("Lisa");
        height.set(lisa,121);
        //get(Object obj)
        //  取得是哪一个对象里面的成员值能
        double o = (double)height.get(lisa);
        System.out.println(o);
        System.out.println("===================================");

        //获取所有的成员变量
        //Field[]   getDeclaredFields()
        //    返回所有成员变量对象的数组
        Field[] declaredFields = animalClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        //获取单个
        //Field   getDeclareField(String name)
        //    返回单个成员变量对象,参数name表示成员变量的名字
        //获取单个   被 private修饰的成员变量
        Field name = animalClass.getDeclaredField("name");
        System.out.println(name);
        //不能直接给私有赋值 和取值
       // name.set(lisa,"小白白");
        //name.get(lisa);

        //获取单个被默认修饰的成员变量

        Field age = animalClass.getDeclaredField("age");
        System.out.println(age);
        //对成员变量的使用 有两种方式 一个是取值 一个是赋值
        //私有的是不能直接赋值的 取值
        //赋值方式是:set(Object obj,Object value):用于给obj对象的 改成员变量赋value值
        //取值 get(Object obj):用于获取obj对象的指定成员变量值
    }
}
