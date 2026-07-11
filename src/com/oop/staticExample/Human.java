package com.oop.staticExample;

public class Human {
    String name;
    int age;
    String gender;
    boolean married;
    static String planet;

    Human(String name, int age, String gender, boolean married){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        Human.planet = "earth";
    }
}
