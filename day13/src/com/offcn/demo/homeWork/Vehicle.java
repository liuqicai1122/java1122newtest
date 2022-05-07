package com.offcn.demo.homeWork;

public class Vehicle extends  Transport {
      int wheels;
      float weight;

    public int getWheels() {
        return wheels;
    }

    public float getWeight() {
        return weight;
    }

    public Vehicle() { };

    public Vehicle(int wheels, float weight) {
         super(21,434);
        this.wheels =wheels;
        this.weight = weight;
    }
    public  void show (){
        super .show();
        System.out.println(getWeight());
        System.out.println(getWheels());
    }
}
