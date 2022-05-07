package com.offcn.demo.homeWork;

public class Transport {
    int speed ;
    float load;
    public Transport(){
    }
    public  Transport (int speed,float load) {
        this.speed = speed;
        this.load=load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    public int getSpeed() {
        return speed;
    }

    public float getLoad() {
        return load;
    }
    public void show(){
        System.out.println("交通工具的速度"+getSpeed());
        System.out.println("交通工具的载重量"+getLoad());
    }
}
