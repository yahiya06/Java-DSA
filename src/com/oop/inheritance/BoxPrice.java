package com.oop.inheritance;

public class BoxPrice extends BoxWeight {
    double price;


    BoxPrice(double price, double weight, double side){
        super(weight , side);
        this.price = price;
    }
}
