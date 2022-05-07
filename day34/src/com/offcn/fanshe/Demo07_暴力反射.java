package com.offcn.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class Demo07_暴力反射 {
    //获取class对象
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Car> carClass = Car.class;
        //Class<Car> carClass1 = Car.class;
       // System.out.println(carClass);//class com.offcn.fanshe.Car
       // System.out.println(carClass1);//class com.offcn.fanshe.Car
        //获取单个私有的成员变量
        Field name = carClass.getDeclaredField("name");
        //在获取 以后调用父类的 setAccessible(boolean flag)
        //  将此对象的accessible 标志设置为指示的布尔值
        name.setAccessible(true);
        Car car = carClass.newInstance();
       // Car car3 = carClass.newInstance();
        //System.out.println(car);
        //System.out.println(car3);//两个对象地址值不一样
        name.set(car,"雷诺");
        System.out.println(name.get(car));

        //获取单个私有的构造方法
        Constructor<Car> declaredConstructor = carClass.getDeclaredConstructor(String.class, String.class);
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);

        Car car1 = declaredConstructor.newInstance("哈哈哈", "嘎嘎爱国");
        Car car2 = declaredConstructor.newInstance("哈哈", "嘎嘎爱");
        System.out.println(car1);
        System.out.println(car2);//两个对象地址值不一样
        //获取单个私有的方法

        Method declaredMethod = carClass.getDeclaredMethod("getName");
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(car);
        System.out.println(invoke);
    }
}
