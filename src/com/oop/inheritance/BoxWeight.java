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
}
