package com.oop.abstractDemo;

public class Child2 extends Parent {

    public Child2(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("ASP Dot net dev "+ age);
    }

    @Override
    void partner() {
        System.out.println("i love black widow");
    }
}
