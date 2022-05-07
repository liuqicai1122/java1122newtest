package com.offcn.demo;

public class Demo_案列2 {
    public static void main(String[] args) {
        //int year =2004
        //int month=3;
        //int day=25;
        //求这个日期是这年中的第多少天/
        int year =2004;
        int month=3;
        int day =25;
        int [] monthDa={31,28,31,30,31,30,31,31,30,31,30,31};
        //我们写个方法判断是平年或者是闰年
        if(pingHuoRun(2004)){
            monthDa[1]=29;
            //System.out.println(pingHuoRun(2004));

        }   int i=0;//计算天数
           for (int index=0;index<2;index++){
                i=i+monthDa[index];
        }i=i+day;
        System.out.println("这个"+year+"年"+month+"月"+day+"是这一年中的第"+i+"天");



    }
    public static boolean pingHuoRun (int nian){
        boolean flag=false;
        if((nian%4==0 &&nian%100!=0)||(nian%400 == 0)){
            flag=true;

        }return flag;
    }

}
