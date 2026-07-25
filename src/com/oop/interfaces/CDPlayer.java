package com.oop.interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("CD Player start");
    }

    @Override
    public void stop() {
        System.out.println("CD Player Stop");
    }
}
