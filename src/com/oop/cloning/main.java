package com.oop.cloning;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(29,"yahiya");

//        System.out.println(h1.age+" "+h1.name);

        Human h2 = (Human) h1.clone();
        System.out.println(h2.age+" " +h2.name);
    }
}
