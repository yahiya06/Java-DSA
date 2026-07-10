package com.oop;

public class Student {
    public static void main(String[] args) {

        StudentInfo std1 = new StudentInfo();
        std1.rno=101;
        std1.name="yahiya";
        std1.marks=99f;

        System.out.println(std1.rno);
        System.out.println(std1.name);
        System.out.println(std1.marks);
    }
    public static void msg(){
        System.out.println("hellow from another pkg");
    }
}

class StudentInfo{
    int rno;
    String name;
    float marks;
}
