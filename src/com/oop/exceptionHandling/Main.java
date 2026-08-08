package com.oop.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a= 8;
        int b= 0;
        try {
//            int c = a/b;
//            int c = devide(3,0);
//            System.out.println(c);
            String name = "yahiya";
            if (name.equals("yahiya")){
                throw new MyException("name is yahiya");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static int devide(int a, int b){
        if(b==0){
            throw new ArithmeticException("do not devide by zero");
        }
        return a/b;
    }
}
