package com.oop.singleton;

public class Main {
    public static void main(String[] args) {

        SingleTon obj = SingleTon.getIns();
        SingleTon obj1 = SingleTon.getIns();
        SingleTon obj2 = SingleTon.getIns();
    }
}
