package com.oop.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Parent.hellow();
        Child1 c1 = new Child1(25);
        c1.career();
        c1.partner();
        System.out.println();
        Child2 c2 = new Child2(35);
        c2.career();
        c2.partner();
    }
}
