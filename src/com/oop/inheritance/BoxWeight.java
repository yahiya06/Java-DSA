package com.oop.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight= -1;
    }

    public BoxWeight(double len, double hig, double wid, double weight) {
        super(len, hig, wid);
        this.weight = weight;

    }

    BoxWeight(double weight, double side){
        super(side);
        this.weight=weight;
    }

     void msg(){
        System.out.println("Sub class msg called");
        super.msg();
    }
}
