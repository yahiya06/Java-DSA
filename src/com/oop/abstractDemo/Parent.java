package com.oop.abstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age=age;
    }

    static  void hellow(){
        System.out.println("hellow child");
    }
    abstract void career();
    abstract void partner();
}
