package com.offcn.calander1.system;

import java.util.Scanner;

public class Demo01_System {
    public static void main(String[] args) {
        //1.System.in:标准输入流,默认关联到键盘上
        Scanner sc=new Scanner(System.in);

        String str = sc.next();

        //2.System.out:标准输出流,默认关联到控制台上
        System.out.println(str);

        //3.System.err:标准错误输出流,默认关联到控制台上,用于打印错误信息,在eclipse中,使用该
        //流打印出来的内容是红色
        System.err.println(str);

        //gc():强制垃圾回收器回收内存中的垃圾
        //java中我们的垃圾回收,是全自动的
        System.gc();
        //exit(int status):结束虚拟机
        while(true){
            break;
            //System.exit(0);//代码jvm停止 下面所有代码不能运行
        }
        //当前时间的毫秒值 时间也是从1970年一月一日   0时0分0秒开始的
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
