package com.oop.abstractDemo;

public class Child1 extends Parent{


    public Child1(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("java dev");
    }

    @Override
    void partner() {
        System.out.println("i love batmen");
    }
}
