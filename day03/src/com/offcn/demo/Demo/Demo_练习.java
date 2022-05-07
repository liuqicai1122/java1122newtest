package com.offcn.demo.Demo;

public class Demo_练习 {
    public static void main(String[] args) {
        int a = 1;
        short b = 2;
        //b = a + b;编译失败 ，b +a 结果是int类型 而b 本身为short类型
        //b += a  就等于 b = b+a
            b +=a;
        System.out.println(b);
        // 因此用 += 会自带强制转换类型  直接大转小

    }
}
