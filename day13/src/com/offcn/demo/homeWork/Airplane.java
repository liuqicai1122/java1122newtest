package com.offcn.demo.homeWork;

public class Airplane  extends  Transport{
        String enginertype;
        int enginers;

        public String getEnginertype() {
                return enginertype;
        }

        public int getEnginers() {
                return enginers;
        }
        public  Airplane(){};
        public  Airplane(String enginertype,int enginers){
                super(13,431);
                System.out.println("飞机的速度为:"+enginers+"飞机的名字是"+enginertype);
        }
}