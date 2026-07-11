package com.oop.staticExample;

public class Main {
    public static void main(String args[]){
        Human yahiya = new Human("yahiya", 20, "male",false);
        Human jay = new Human("jay", 20, "male",false);
        System.out.println(yahiya.name + " "+ yahiya.age + " "+ Human.planet);
        System.out.println(Human.planet);
    }
}
