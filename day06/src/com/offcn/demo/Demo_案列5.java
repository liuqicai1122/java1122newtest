package com.offcn.demo;

public class Demo_案列5 {
    public static void main(String[] args) {
        //案例5：输出1到100之间能被3整除的前5个数
        int num = 1;
        int flag = 0;
        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.println(num);

              flag++;

            }

            if (flag == 5) {
                break;
            }num++;
        }
    }
}

