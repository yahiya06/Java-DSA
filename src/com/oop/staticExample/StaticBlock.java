package com.oop.staticExample;

public class StaticBlock {
    static int i=10;
    static int b;

    static {
        System.out.println("this is static block");
        b = i *7;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b +" "+ StaticBlock.i);
    }
}
