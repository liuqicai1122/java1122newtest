package com.offcn.fanshe;

public class Car {
    private  String name;
    private  String color;
    public Car(){};

    private Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
