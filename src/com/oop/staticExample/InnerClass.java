package com.oop.staticExample;

public class InnerClass {
    static class a{
        String name;

        public a(String name) {
            this.name = name;
        }
    }
    public static void main(String args[]){
        a obj = new a("yahiya");
        a obj1 = new a("jay");
        System.out.println(obj.name);
        System.out.println(obj1.name);
    }
}
