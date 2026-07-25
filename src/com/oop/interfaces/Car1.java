package com.oop.interfaces;

public class Car1 implements Engine,Break{
    @Override
    public void brake() {
        System.out.println("abs break");
    }

    @Override
    public void start() {
        System.out.println("Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("acc like a normal car");
    }
}
