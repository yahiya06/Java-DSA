package com.patternWithRecursion;

//****
//***
//**
//*

public class Pattern {
    public static void main(String[] args) {
        tri(4,0);
    }
    static void tri(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("*");
            tri(row,col+1);
        }
        else {
            System.out.println();
            tri(row-1,0);
        }
    }
}
