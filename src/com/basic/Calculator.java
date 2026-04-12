package com.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        while(true){
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for modulo");
            System.out.println("Enter 6 for exit");
            System.out.println("Enter choise");
            int choise = in.nextInt();
            switch (choise){
                case 1:
                   System.out.println("Enter 2 number for addition");
                    a = in.nextInt();
                    b = in.nextInt();
                    a=a+b;
                    System.out.println("Addition of a and b is: "+ a);
                    break;
                case 2:
                    System.out.println("Enter 2 number for subtraction");
                    a = in.nextInt();
                    b = in.nextInt();
                    a=a-b;
                    System.out.println("subtraction of a and b is: "+ a);
                    break;
                case 3:
                    System.out.println("Enter 2 number for multiplicatin");
                    a = in.nextInt();
                    b = in.nextInt();
                    a=a*b;
                    System.out.println("Multiplication of a and b is: "+ a);
                    break;
                case 4:
                    System.out.println("Enter 2 number for division");
                    a = in.nextInt();
                    b = in.nextInt();
                    if( a!=0 && b!=0) {
                        a = a / b;
                        System.out.println("division of a and b is: " + a);
                    }else{
                        System.out.println("enter valid no.");
                    }
                    break;
                case 5:
                    System.out.println("Enter 2 number for modulo");
                    a = in.nextInt();
                    b = in.nextInt();
                    a=a%b;
                    System.out.println("modulo of a and b is: "+ a);
                    break;
                case 6:
                    System.out.println("Exit...");
                    return;
                default:
                    System.out.println("enter valid choise");
            }
        }
    }
}
