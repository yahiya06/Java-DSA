package com.oop.singleton;

public class SingleTon {
    private SingleTon(){

    }

    private static SingleTon ins;

    public static SingleTon getIns(){
        if (ins == null){
            ins = new SingleTon();
        }

        return ins;
    }
}
