package com.offcn.bean;

public class Account {
   private  int id ;
   private  int money;

    public Account(int id, int money) {
        this.id = id;
        this.money = money;
    }

    public Account(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
