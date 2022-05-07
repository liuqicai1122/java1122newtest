package com.offcn.compareto;

import java.util.Objects;
//想让我们的自定义数据存到TreeSet集合里面,我们需要实现Comparable接口
//需要把接口里面的所有抽象方法全部重写
public class Student { //implements Comparable<Student>  {
    private  String name;
    private  int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//compareTo重写之后,有返回值类型
    //0  前面的对象所产生的的整数 等于后面对象产生的整数 会判定为一个对象 然后去重 只取第一个
    //正整数:前面的对象产生的整数 后面的对象产生的整数  大于0  降序排序  从小到大
    //负整数: 前面的对象产生的整数 后面的 对象大于0 升序排序 从小到大
    /*@Override
    public int compareTo(Student o) {
        //前面的对象:称为当前对象 this
        //o为后面的对象
        //当 this.age-o.age==0 的时候我们不能确定这两个对象是同一个对象
        int i = this.age - o.age;
        int i1 = i == 0 ? this.name.compareTo(o.name) : i;
        return i1;
    }*/
}
