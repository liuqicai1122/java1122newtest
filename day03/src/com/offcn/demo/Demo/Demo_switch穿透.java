package com.offcn.demo.Demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Demo_switch穿透 {
    public static void main(String[] args) {


        //Switch    穿透是case后面没有跟break:
        /*int i = 5
         *switch (i){
         * case 0 :
         * System . out .println("执行case0");
         *break;
         *...
         * default:
         * System .out.println("执行default");
         *
         *     *
         * }

         * */
        //case 穿透
        //当变量week值为1 2 3  4 5 中任意一个值时,处理方式都为"工作日"
        // 当变量week值为 6 .7 处理结果为"休息日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7数字");
               int num= sc.nextInt();
               switch ( num){
                   case 1 :
                   case 2 :
                   case 3 :
                   case 4 :
                   case 5 :
                       System.out.println("工作日");
                       break;
                   case 6:
                   case 7:
                       System.out.println("休息日");
                       break;
                   default:
                       System.out.println("你输的数字是个屁");
                       break;



               }

    }


}
