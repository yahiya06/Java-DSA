package com.oop.inheritance;

public class BoxPrice extends BoxWeight {
    double price;
    String color;


    BoxPrice(double price, double weight, double side, String color){
        super(weight , side);
        this.price = price;
        this.color= color;
    }
    BoxPrice(double price, double weight, double side){
        super(weight , side);
        this.price = price;
    }
}
