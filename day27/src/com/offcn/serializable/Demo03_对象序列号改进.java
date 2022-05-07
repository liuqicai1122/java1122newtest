package com.offcn.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo03_对象序列号改进 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student1.txt"));
        //将对象存到list集合里面
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",15));
        list.add(new Student("二狗子",23));
        list.add(new Student("王小二",35));
        list.add(new Student("李四",25));
        oos.writeObject(list);
        oos.close();
    }
}
