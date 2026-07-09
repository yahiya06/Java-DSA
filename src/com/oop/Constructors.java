package com.oop;

public class Constructors {
    public static void main(String[] args) {
        //Student1 std1 = new Student1();
        Student1 std1 = new Student1(101,"yahiya",90.9f);
        System.out.println(std1.rno);
        System.out.println(std1.name);
        System.out.println(std1.marks);

        Student1 std2 = new Student1();
        System.out.println(std2.name);
    }
}

class Student1{
    int rno;
    String name;
    float marks;

    //Student1(){
//        this.rno=1;
//        this.name="yahiya";
//        this.marks=98.0f;
//    }

    //calling constructor with another constructor
    Student1(){
        this(1,"another",34.0f);
    }

    Student1(int rno, String name, float marks){
        this.rno= rno;
        this.name=name;
        this.marks=marks;
    }


}
