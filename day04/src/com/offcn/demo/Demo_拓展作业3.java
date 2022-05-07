package com.offcn.demo;

import java.util.Scanner;

public class Demo_拓展作业3 {
    public static void main(String[] args) {
        /*(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	(2)涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，
	   基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工龄");
        int num=sc .nextInt();

            if(num>=0 & num<1) {
                System.out.println("您目前工作了" + num + "年," + "基本工资为 3000元," + "应涨工资200元,涨后工资" + (3000 + 200) + "元"
                );
            }else if(num>=1 & num<3) {
                 System.out.println("您目前工作了"+num+"年,"+"基本工资为 3000元,"+"应涨工资500元,涨后工资"+(3000+500)+"元");

            }else if (num>=3 & num<5){
                System.out.println("您目前工作了"+num+"年,"+"基本工资为 3000元,"+"应涨工资1000元,涨后工资"+(3000+1000)+"元");
            }else if (num>=5&num<10){
                System.out.println("您目前工作了"+num+"年,"+"基本工资为 3000元,"+"应涨工资2500元,涨后工资"+(3000+2500)+"元");
            }else if(num>=10 & num <15){
                System.out.println("您目前工作了"+num+"年,"+"基本工资为 3000元,"+"应涨工资5000元,涨后工资"+(3000+5000)+"元");
            }




            }

    }

