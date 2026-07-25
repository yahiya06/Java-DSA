package com.oop.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car1 car = new Car1();
//        car.acc();
//        car.start();
//        car.stop();

        NewCar car = new NewCar();
        car.start();
        car.startMusic();
        car.acc();
        car.stop();
        car.stopMusic();
    }
}
