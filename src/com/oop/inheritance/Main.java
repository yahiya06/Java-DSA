package com.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Box obj = new Box();
        System.out.println(obj.h +" "+ obj.l+" " + obj.w);

        Box obj1 = new Box(10.0, 20.0, 10.0);
        System.out.println(obj1.h +" "+ obj1.l+" " + obj1.w);

        BoxWeight obj3 = new BoxWeight();
        System.out.println(obj3.weight +" "+ obj3.h);

        BoxWeight obj4= new BoxWeight(10.0, 10.0, 10.2, 12.0);
        System.out.println(obj4.h +" "+ obj4.l+" " + obj4.w+" " +obj4.weight);

        BoxWeight msg = new BoxWeight();

            msg.msg();

    }
}
