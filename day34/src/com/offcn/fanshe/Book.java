package com.offcn.fanshe;

public class Book {
    private  String name;
    private  double price;
    private  String author;
    public Book(){ }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    private  void play(){
        System.out.println("我们很喜欢打游戏");

    }
    void fun(){
        System.out.println("我们都开开心心每一天");
    }
}
