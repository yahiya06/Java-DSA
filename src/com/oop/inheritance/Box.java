package com.oop.inheritance;

public class Box {
    double l;
    double h;
    double w;

    void msg(){
        System.out.println("Super class msg called");
    }

    Box(){
        this.h= -1;
        this.l= -1;
        this.w= -1;
    }

    Box(double len,  double hig, double wid){
        this.l= len;
        this.h= hig;
        this.w= wid;
    }
}
